/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.control;

import br.com.treebu.dao.LoginDao;
import br.com.treebu.model.Login;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinicius caetano
 */
public class LoginClienteServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private LoginDao loginDAO;

    public LoginClienteServlet() throws SQLException {
        super();
        loginDAO = new LoginDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            Login loginE = new Login();

            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            String status = "";
            Date hoje = new Date(System.currentTimeMillis());

            if (loginDAO.validarLogin(email, senha)) {
                HttpSession sessao = request.getSession();
                sessao.setAttribute("sessaoUsuario", email);

                RequestDispatcher dispatcher = request.getRequestDispatcher("HomeCliente.jsp");
                dispatcher.forward(request, response);

            } else {
                request.setAttribute("mensagem", "Usuario/senha invalidos");

                loginE.setEmail(request.getParameter("email"));
                loginE.setSenha(request.getParameter("senha"));
                loginE.setDataAutenticacao(hoje);

                String codigo = request.getParameter("codigo");

                if (codigo == null || codigo.isEmpty()) {

                    loginDAO.Cadastrar(loginE);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("LoginCliente.jsp");
                    dispatcher.forward(request, response);
                }

            }
        } catch (Exception ex) {
            System.out.println("Erro" + ex.getMessage());
        }

    }

}
