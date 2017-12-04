/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.control;

import br.com.treebu.dao.AutorDao;
import br.com.treebu.dao.EditoraDao;
import br.com.treebu.dao.GeneroDao;
import br.com.treebu.dao.IdiomaDao;
import br.com.treebu.dao.LivroDao;
import br.com.treebu.model.Autor;
import br.com.treebu.model.Editora;
import br.com.treebu.model.Genero;
import br.com.treebu.model.Idioma;
import br.com.treebu.model.Livro;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class LivroServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String FormularioLivros = "Cadastros/Livro.jsp";
    private static String List_Livros = "Listagem/ListaLivros.jsp";
    private static String LISTA_EDITORA = "Listagem/ListaEditoras.jsp";
    private static String LISTA_AUTOR = "Listagem/ListaAutores.jsp";
    private static String LISTA_GENERO = "Listagem/ListaGenero.jsp";
    private LivroDao livroDAO;
    private EditoraDao editoraDAO;
    private AutorDao autorDAO;
    private GeneroDao generoDAO;
    private IdiomaDao idiomaDAO;

    public LivroServlet() throws SQLException {
        super();
        editoraDAO = new EditoraDao();
        livroDAO = new LivroDao();
        autorDAO = new AutorDao();
        generoDAO = new GeneroDao();
        idiomaDAO = new IdiomaDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {
            int numero = Integer.parseInt(request.getParameter("codigo"));
            try {
                livroDAO.Deletar(numero);
            } catch (Exception ex) {
                Logger.getLogger(LivroServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (action.equalsIgnoreCase("edit")) {
            int numero = Integer.parseInt(request.getParameter("codigo"));
            Livro livro = null;
            try {
                livro = livroDAO.ConsultarPorCodigo(numero);
            } catch (Exception ex) {
                Logger.getLogger(LivroServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

            request.setAttribute("livro", livro);

        } else if (action.equalsIgnoreCase("editoraList")) {
            forward = LISTA_EDITORA;
            try {
                request.setAttribute("editora", editoraDAO.Listar());
            } catch (Exception ex) {
                Logger.getLogger(LivroServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (action.equalsIgnoreCase("autorList")) {
            forward = LISTA_AUTOR;
            try {
                request.setAttribute("autor", autorDAO.Listar());
            } catch (Exception ex) {
                Logger.getLogger(LivroServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (action.equalsIgnoreCase("generoList")) {
            forward = LISTA_GENERO;
            try {
                request.setAttribute("genero", generoDAO.Listar());
            } catch (Exception ex) {
                Logger.getLogger(LivroServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (action.equalsIgnoreCase("idiomaList")) {
            forward = LISTA_GENERO;
            try {
                request.setAttribute("idioma", idiomaDAO.Listar());
            } catch (Exception ex) {
                Logger.getLogger(LivroServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        RequestDispatcher view = request.getRequestDispatcher(FormularioLivros);
        try {
            request.setAttribute("livroList", livroDAO.Listar());
        } catch (Exception ex) {
            Logger.getLogger(LivroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            request.setAttribute("editoraList", editoraDAO.Listar());
        } catch (Exception ex) {
            Logger.getLogger(LivroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            request.setAttribute("autorList", autorDAO.Listar());
        } catch (Exception ex) {
            Logger.getLogger(LivroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            request.setAttribute("generoList", generoDAO.Listar());
        } catch (Exception ex) {
            Logger.getLogger(LivroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            request.setAttribute("idiomaList", idiomaDAO.Listar());
        } catch (Exception ex) {
            Logger.getLogger(LivroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Livro livro = new Livro();
        livro.setEditora(new Editora());
        livro.setAutor(new Autor());
        livro.setGenero(new Genero());
        livro.setIdioma(new Idioma());

        try {
            Date dataPublicacao = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dataPublicacao"));
            livro.setDataPublicacao(dataPublicacao);
        } catch (ParseException e) {
            e.getMessage();
        }
        livro.setNome(request.getParameter("nome"));
        livro.setDescricao(request.getParameter("descricao"));
        livro.setNumeroPaginas(Integer.parseInt(request.getParameter("numPaginas")));
        livro.setAno(Integer.parseInt(request.getParameter("ano")));
        livro.setPreco(Double.parseDouble(request.getParameter("preco")));
        livro.setQtd_livro(Integer.parseInt(request.getParameter("qdtLivro")));
        livro.setIsbn(request.getParameter("isbn"));
        livro.setCapa(request.getParameter("capa"));
        livro.getEditora().setCodigo(Integer.parseInt(request.getParameter("cod_editora")));
        livro.getAutor().setCodigo(Integer.parseInt(request.getParameter("cod_autor")));
        livro.getGenero().setCodigo(Integer.parseInt(request.getParameter("cod_genero")));
        livro.getIdioma().setCodigo(Integer.parseInt(request.getParameter("cod_idioma")));

        String codigo = request.getParameter("codigo");

        if (codigo == null || codigo.isEmpty()) {
            try {
                livroDAO.Cadastrar(livro);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            try {
                livro.setCodigo(Integer.parseInt(codigo));
                livroDAO.Atualizar(livro);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        RequestDispatcher view = request.getRequestDispatcher(FormularioLivros);//Formulario
        try {
            request.setAttribute("livroList", livroDAO.Listar());
        } catch (Exception ex) {
            Logger.getLogger(LivroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        view.forward(request, response);
    }

}
