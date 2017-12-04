/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.control;

import br.com.treebu.dao.GeneroDao;
import br.com.treebu.model.Genero;
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
public class GeneroServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String FormularioGenero = "Cadastros/Genero.jsp";
    private static String List_Generos = "Listagem/ListaGeneros.jsp";
    private GeneroDao generoDAO;

    public GeneroServlet() throws SQLException {
        super();
        generoDAO = new GeneroDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String pagina = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {

            try {

                int codigo = Integer.parseInt(request.getParameter("codigo"));
                try {
                    generoDAO.Deletar(codigo);
                } catch (Exception ex) {
                    System.out.println("Erro" + ex.getMessage());
                }
                pagina = List_Generos;
                request.setAttribute("generoList", generoDAO.ListarIterator());

            } catch (Exception ex) {
                Logger.getLogger(GeneroServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (action.equalsIgnoreCase("edit")) {
            try {
                pagina = FormularioGenero;
                int codigo = Integer.parseInt(request.getParameter("codigo"));

                Genero genero = generoDAO.ConsultarPorCodigo(codigo);
                request.setAttribute("genero", genero);
            } catch (Exception ex) {
                Logger.getLogger(GeneroServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (action.equalsIgnoreCase("ListaGeneros")) {
            try {
                pagina = List_Generos;
                request.setAttribute("generoList", generoDAO.ListarIterator());
            } catch (Exception ex) {
                Logger.getLogger(GeneroServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            pagina = FormularioGenero;
        }

        RequestDispatcher view = request.getRequestDispatcher(pagina);
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            Genero genero = new Genero();

            genero.setNome(request.getParameter("nome"));
            genero.setDescricao(request.getParameter("descricao"));

            String codigo = request.getParameter("codigo");

            if (codigo == null || codigo.isEmpty()) {

                try {
                    generoDAO.Cadastrar(genero);
                } catch (Exception ex) {
                    System.out.println("Erro" + ex.getMessage());
                }
            } else {

                try {
                    genero.setCodigo(Integer.parseInt(codigo));
                    generoDAO.Atualizar(genero);
                } catch (Exception ex) {
                    Logger.getLogger(GeneroServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            RequestDispatcher view = request.getRequestDispatcher(List_Generos);
            request.setAttribute("generoList", generoDAO.ListarIterator());
            view.forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(GeneroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
