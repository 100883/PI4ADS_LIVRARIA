/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.control;

import br.com.treebu.dao.AutorDao;
import br.com.treebu.model.Autor;
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
public class AutorServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String FormularioAutor = "Cadastros/Autor.jsp";
    private static String List_Autor = "Listagem/ListaAutores.jsp";
    private AutorDao autorDAO;

    public AutorServlet() throws SQLException {
        super();
        autorDAO = new AutorDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String pagina = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            try {
                autorDAO.Deletar(codigo);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
            pagina = List_Autor;
            try {
                request.setAttribute("autorList", autorDAO.ListarIterator());

            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        } else if (action.equalsIgnoreCase("edit")) {
            try {
                pagina = FormularioAutor;
                //Buscando informação pelo o codigo
                int codigo = Integer.parseInt(request.getParameter("codigo"));

                Autor autor = autorDAO.ConsultarPorCodigo(codigo);
                request.setAttribute("autor", autor);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }

        } else if (action.equalsIgnoreCase("ListaAutores")) {
            pagina = List_Autor;
            try {
                request.setAttribute("autorList", autorDAO.ListarIterator());
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        } else {
            pagina = FormularioAutor;
        }
        request.setAttribute("valorStatus", "V");
        RequestDispatcher view = request.getRequestDispatcher(pagina);
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Autor autor = new Autor();

            autor.setNome(request.getParameter("nome"));
            autor.setNacionalidade(request.getParameter("nacionalidade"));

            try {
                Date dataNascimento;
                dataNascimento = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dataNascimento"));
                autor.setDataNascimento(dataNascimento);
            } catch (ParseException e) {
                e.getMessage();
            }
            autor.setStatus(Boolean.parseBoolean("status"));
            autor.setDescricao(request.getParameter("descricao"));

            String codigo = request.getParameter("codigo");

            if (codigo == null || codigo.isEmpty()) {

                try {
                    autorDAO.Cadastrar(autor);
                } catch (Exception ex) {
                    System.out.println("Erro no Exception --> " + ex.getMessage());
                }
            } else {

                try {
                    autor.setCodigo(Integer.parseInt(codigo));
                    autorDAO.Atualizar(autor);
                } catch (Exception ex) {
                    System.out.println("Erro no Exception --> " + ex.getMessage());
                }
            }

            RequestDispatcher view = request.getRequestDispatcher(List_Autor);
            request.setAttribute("valorStatus", "V");
            request.setAttribute("autorList", autorDAO.ListarIterator());
            view.forward(request, response);
        } catch (Exception ex) {
            System.out.println("Erro no Exception --> " + ex.getMessage());
        }
    }

}
