/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.control;

import br.com.treebu.dao.LivroDao;
import br.com.treebu.util.JavaMailApp;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vinicius caetano
 */
public class HomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final String LISTAR_LIVROS = "/HomeCliente.jsp";
    private static final String DETALHES_LIVRO = "Livro/detalhesLivro.jsp";
    private LivroDao livroDAO;

    public HomeServlet() throws SQLException {
        super();
        livroDAO = new LivroDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pagina = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("homeList")) {
            try {
                pagina = LISTAR_LIVROS;
                request.setAttribute("homeList", livroDAO.ListaHome());
            } catch (Exception ex) {
                Logger.getLogger(GeneroServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (action.equalsIgnoreCase("detalhesLivro")) {
            pagina = DETALHES_LIVRO;
            try {
                request.setAttribute("detalhesLivro", livroDAO.ListaHome());
            } catch (Exception ex) {
                Logger.getLogger(HomeServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        RequestDispatcher view = request.getRequestDispatcher(pagina);
        view.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        JavaMailApp email = new JavaMailApp();

        email.enviarEmail(
                request.getParameter("Name"),
                request.getParameter("Email"),
                request.getParameter("Subject"),
                request.getParameter("Message"));

        RequestDispatcher view = request.getRequestDispatcher(LISTAR_LIVROS);
        try {
            request.setAttribute("homeList", livroDAO.ListaHome());
        } catch (Exception ex) {
            Logger.getLogger(HomeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            request.setAttribute("detalhesLivro", livroDAO.ListaHome());
        } catch (Exception ex) {
            Logger.getLogger(HomeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        view.forward(request, response);
    }

}
