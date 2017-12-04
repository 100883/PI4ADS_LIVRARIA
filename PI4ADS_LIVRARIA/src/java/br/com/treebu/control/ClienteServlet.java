/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.control;

import br.com.treebu.dao.ClienteDao;
import br.com.treebu.model.Cliente;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vinicius caetano
 */
public class ClienteServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String FormularioCliente = "Cadastros/Cliente.jsp";
    private static String List_Clientes = "Listagem/ListaClientes.jsp";
    private ClienteDao clienteDAO;

    public ClienteServlet() throws SQLException {
        super();
        clienteDAO = new ClienteDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String pagina = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {

            int codigo = Integer.parseInt(request.getParameter("codigo"));
            try {
                clienteDAO.Deletar(codigo);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
            pagina = List_Clientes;
            try {
                request.setAttribute("clienteList", clienteDAO.ListarIterator());
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }

        } else if (action.equalsIgnoreCase("edit")) {
            try {
                pagina = FormularioCliente;
                int codigo = Integer.parseInt(request.getParameter("codigo"));
                Cliente cliente = clienteDAO.ConsultarPorCodigo(codigo);
                request.setAttribute("cliente", cliente);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        } else if (action.equalsIgnoreCase("ListaClientes")) {
            pagina = List_Clientes;
            try {
                request.setAttribute("clienteList", clienteDAO.ListarIterator());
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        } else {
            pagina = FormularioCliente;
        }
        //Para aparecer a pagina de acordo com ação
        RequestDispatcher view = request.getRequestDispatcher(pagina);
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cliente cliente = new Cliente();

        cliente.setEmail(request.getParameter("email"));
        cliente.setSenha(request.getParameter("senha"));
        cliente.setNome(request.getParameter("nome"));
        cliente.setTelefone(request.getParameter("telefone"));
        cliente.setCpf(request.getParameter("cpf"));
        try {
            Date dataNascimento = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dataNascimento"));
            cliente.setDataNascimento(dataNascimento);
        } catch (ParseException e) {
            e.getMessage();
        }
        try {
            Date dataCadastro = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dataCadastro"));
            cliente.setDataCadastro(dataCadastro);
        } catch (ParseException e) {
            e.getMessage();
        }
        cliente.setLogradouro(request.getParameter("logradouro"));
        cliente.setComplemento(request.getParameter("complemento"));
        cliente.setBairro(request.getParameter("bairro"));
        cliente.setCidade(request.getParameter("cidade"));
        cliente.setEstado(request.getParameter("estado"));
        cliente.setCep(request.getParameter("cep"));

        String codigo = request.getParameter("codigo");

        if (codigo == null || codigo.isEmpty()) {

            try {
                clienteDAO.Cadastrar(cliente);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        } else {

            cliente.setCodigo(Integer.parseInt(codigo));
            try {
                clienteDAO.Atualizar(cliente);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        }
        RequestDispatcher view = request.getRequestDispatcher(List_Clientes);
        try {
            request.setAttribute("clienteList", clienteDAO.ListarIterator());
        } catch (Exception ex) {
            System.out.println("Erro no Exception --> " + ex.getMessage());
        }
        view.forward(request, response);
    }
}
