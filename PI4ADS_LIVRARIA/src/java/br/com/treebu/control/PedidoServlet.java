/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.control;

import br.com.treebu.dao.ClienteDao;
import br.com.treebu.dao.PedidoDao;
import br.com.treebu.model.Cliente;
import br.com.treebu.model.Pedido;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vinicius caetano
 */
public class PedidoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String FormularioPedido = "Cadastros/Pedido.jsp";
    private static String List_Pedidos = "Listagem/ListaPedidos.jsp";
    private ClienteDao clienteDAO;
    private PedidoDao pedidoDAO;

    public PedidoServlet() throws SQLException {
        super();
        pedidoDAO = new PedidoDao();
        clienteDAO = new ClienteDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String action = request.getParameter("action");

            if (action.equalsIgnoreCase("delete")) {
                try {
                    int numero = Integer.parseInt(request.getParameter("numero"));
                    pedidoDAO.Deletar(numero);
                } catch (Exception ex) {
                    System.out.println("Erro no Exception --> " + ex.getMessage());
                }
            }
            if (action.equalsIgnoreCase("edit")) {
                try {
                    int numero = Integer.parseInt(request.getParameter("numero"));
                    Pedido pedido = pedidoDAO.ConsultarPorCodigo(numero);

                    request.setAttribute("pedido", pedido);
                } catch (Exception ex) {
                    System.out.println("Erro no Exception --> " + ex.getMessage());
                }
            }

            RequestDispatcher view = request.getRequestDispatcher(FormularioPedido);
            request.setAttribute("pedidos", pedidoDAO.Listar());
            request.setAttribute("clientes", clienteDAO.Listar());
            view.forward(request, response);
        } catch (Exception ex) {
            System.out.println("Erro no Exception --> " + ex.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Pedido pedido = new Pedido();
            pedido.setCliente(new Cliente());

            pedido.getCliente().setCodigo(Integer.parseInt(request.getParameter("codcliente")));
            pedido.setValorTotal(Double.parseDouble(request.getParameter("valortotal")));

            String numero = request.getParameter("numero");

            if (numero == null || numero.isEmpty()) {
                try {
                    pedidoDAO.Cadastrar(pedido);
                } catch (Exception ex) {
                    System.out.println("Erro no Exception --> " + ex.getMessage());
                }
            } else {
                pedido.setNumero(Integer.parseInt(numero));
                pedidoDAO.Atualizar(pedido);
            }
            RequestDispatcher view = request.getRequestDispatcher(FormularioPedido);
            request.setAttribute("pedidos", pedidoDAO.ListarIterator());
            view.forward(request, response);
        } catch (Exception ex) {
            System.out.println("Erro no Exception --> " + ex.getMessage());
        }
    }

}
