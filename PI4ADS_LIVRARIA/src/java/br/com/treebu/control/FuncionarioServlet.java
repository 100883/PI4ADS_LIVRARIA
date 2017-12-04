/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.control;

import br.com.treebu.dao.FuncionarioDao;
import br.com.treebu.model.Funcionario;
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
public class FuncionarioServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String FormularioFuncionario = "Cadastros/Funcionario.jsp";
    private static String List_Funcionarios = "Listagem/ListaFuncionarios.jsp";
    private FuncionarioDao funcionarioDAO;

    public FuncionarioServlet() throws SQLException {
        super();
        funcionarioDAO = new FuncionarioDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String pagina = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {

            int codigo = Integer.parseInt(request.getParameter("codigo"));
            try {
                funcionarioDAO.Deletar(codigo);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
            pagina = List_Funcionarios;
            try {
                request.setAttribute("funcionarioList", funcionarioDAO.ListarIterator());
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }

        } else if (action.equalsIgnoreCase("edit")) {
            try {
                pagina = FormularioFuncionario;
                int codigo = Integer.parseInt(request.getParameter("codigo"));
                Funcionario funcionario = funcionarioDAO.ConsultarPorCodigo(codigo);
                request.setAttribute("funcionario", funcionario);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        } else if (action.equalsIgnoreCase("ListaFuncionarios")) {
            pagina = List_Funcionarios;
            try {
                request.setAttribute("funcionarioList", funcionarioDAO.ListarIterator());
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        } else {
            pagina = FormularioFuncionario;
        }
        //Para aparecer a pagina de acordo com ação
        RequestDispatcher view = request.getRequestDispatcher(pagina);
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Funcionario funcionario = new Funcionario();

        funcionario.setEmail(request.getParameter("email"));
        funcionario.setSenha(request.getParameter("senha"));
        funcionario.setNome(request.getParameter("nome"));
        funcionario.setTelefone(request.getParameter("telefone"));
        funcionario.setCpf(request.getParameter("cpf"));
        try {
            Date dataNascimento = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dataNascimento"));
            funcionario.setDataNascimento(dataNascimento);
        } catch (ParseException e) {
            e.getMessage();
        }
        try {
            Date dataAdmissao = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dataAdmissao"));
            funcionario.setDataAdmissao(dataAdmissao);
        } catch (ParseException e) {
            e.getMessage();
        }
        funcionario.setCtps(request.getParameter("ctps"));
        funcionario.setLogradouro(request.getParameter("logradouro"));
        funcionario.setComplemento(request.getParameter("complemento"));
        funcionario.setBairro(request.getParameter("bairro"));
        funcionario.setCidade(request.getParameter("cidade"));
        funcionario.setEstado(request.getParameter("estado"));
        funcionario.setCep(request.getParameter("cep"));

        String codigo = request.getParameter("codigo");

        if (codigo == null || codigo.isEmpty()) {

            try {
                funcionarioDAO.Cadastrar(funcionario);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        } else {

            funcionario.setCodigo(Integer.parseInt(codigo));
            try {
                funcionarioDAO.Atualizar(funcionario);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        }
        RequestDispatcher view = request.getRequestDispatcher(List_Funcionarios);
        try {
            request.setAttribute("funcionarioList", funcionarioDAO.ListarIterator());
        } catch (Exception ex) {
            System.out.println("Erro no Exception --> " + ex.getMessage());
        }
        view.forward(request, response);
    }
}
