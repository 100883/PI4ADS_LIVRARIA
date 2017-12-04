/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.control;

import br.com.treebu.dao.IdiomaDao;
import br.com.treebu.model.Idioma;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vinicius caetano
 */
public class IdiomaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String FormularioIdioma = "Cadastros/Idioma.jsp";
    private static String List_Idiomas = "Listagem/ListaIdiomas.jsp";
    private IdiomaDao idiomaDAO;

    public IdiomaServlet() throws SQLException {
        super();
        idiomaDAO = new IdiomaDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String pagina = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {

            int codigo = Integer.parseInt(request.getParameter("codigo"));
            try {
                idiomaDAO.Deletar(codigo);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
            pagina = List_Idiomas;
            try {
                Iterator<Idioma> idiomaList = idiomaDAO.ListarIterator();
                request.setAttribute("idiomas", idiomaList);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }

        } else if (action.equalsIgnoreCase("edit")) {
            try {
                pagina = FormularioIdioma;
                int codigo = Integer.parseInt(request.getParameter("codigo"));

                Idioma idioma = idiomaDAO.ConsultarPorCodigo(codigo);
                request.setAttribute("idioma", idioma);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        } else if (action.equalsIgnoreCase("ListaIdiomas")) {
            pagina = List_Idiomas;
            try {
                Iterator<Idioma> idiomaList = idiomaDAO.ListarIterator();
                request.setAttribute("idiomas", idiomaList);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        } else {
            pagina = FormularioIdioma;
        }

        RequestDispatcher view = request.getRequestDispatcher(pagina);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Idioma idioma = new Idioma();
        idioma.setNome(request.getParameter("nome"));

        String codigo = request.getParameter("codigo");

        if (codigo == null || codigo.isEmpty()) {

            try {
                idiomaDAO.Cadastrar(idioma);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        } else {

            idioma.setCodigo(Integer.parseInt(codigo));
            try {
                idiomaDAO.Atualizar(idioma);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        }
        RequestDispatcher view = request.getRequestDispatcher(List_Idiomas);
        try {
            Iterator<Idioma> idiomaList = idiomaDAO.ListarIterator();
            request.setAttribute("idiomas", idiomaList);
        } catch (Exception ex) {
            System.out.println("Erro no Exception --> " + ex.getMessage());
        }
        view.forward(request, response);
    }

}
