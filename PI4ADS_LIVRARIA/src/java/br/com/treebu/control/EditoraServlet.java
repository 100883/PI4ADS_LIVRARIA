/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.control;

import br.com.treebu.dao.EditoraDao;
import br.com.treebu.model.Editora;
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
public class EditoraServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String FormularioEditora = "Cadastros/Editora.jsp";
    private static String List_Editoras = "Listagem/ListaEditoras.jsp";
    private EditoraDao editoraDAO;

    public EditoraServlet() throws SQLException {
        super();
        editoraDAO = new EditoraDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String pagina = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {

            try {
                int codigo = Integer.parseInt(request.getParameter("codigo"));
                editoraDAO.Deletar(codigo);
                pagina = List_Editoras;
                request.setAttribute("editoraList", editoraDAO.ListarIterator());
            } catch (Exception ex) {
                Logger.getLogger(EditoraServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (action.equalsIgnoreCase("edit")) {
            try {
                pagina = FormularioEditora;
                int codigo = Integer.parseInt(request.getParameter("codigo"));
                Editora editora = editoraDAO.ConsultarPorCodigo(codigo);
                request.setAttribute("editora", editora);
            } catch (Exception ex) {
                Logger.getLogger(EditoraServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (action.equalsIgnoreCase("ListaEditoras")) {
            try {
                pagina = List_Editoras;
                request.setAttribute("editoraList", editoraDAO.ListarIterator());
            } catch (Exception ex) {
                Logger.getLogger(EditoraServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            pagina = FormularioEditora;
        }
        //Para aparecer a pagina de acordo com ação
        RequestDispatcher view = request.getRequestDispatcher(pagina);
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            Editora editora = new Editora();

            editora.setRazaoSocial(request.getParameter("razaoSocial"));
            editora.setCnpj(request.getParameter("cnpj"));
            editora.setTelefone(request.getParameter("telefone"));
            editora.setEmail(request.getParameter("email"));
            editora.setRepresentante(request.getParameter("representante"));
            editora.setLogradouro(request.getParameter("logradouro"));
            editora.setComplemento(request.getParameter("complemento"));
            editora.setBairro(request.getParameter("bairro"));
            editora.setCidade(request.getParameter("cidade"));
            editora.setEstado(request.getParameter("estado"));
            editora.setCep(request.getParameter("cep"));

            String codigo = request.getParameter("codigo");

            if (codigo == null || codigo.isEmpty()) {

                try {
                    editoraDAO.Cadastrar(editora);
                } catch (Exception ex) {
                    Logger.getLogger(EditoraServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {

                try {
                    editora.setCodigo(Integer.parseInt(codigo));
                    editoraDAO.Atualizar(editora);
                } catch (Exception ex) {
                    Logger.getLogger(EditoraServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            RequestDispatcher view = request.getRequestDispatcher(List_Editoras);
            request.setAttribute("editoraList", editoraDAO.ListarIterator());
            view.forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(EditoraServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
