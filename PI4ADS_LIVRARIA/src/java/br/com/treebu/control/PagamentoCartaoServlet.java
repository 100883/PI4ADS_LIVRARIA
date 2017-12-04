/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.control;

import br.com.treebu.dao.PagamentoCartaoDao;
import br.com.treebu.model.PagamentoCartao;
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
public class PagamentoCartaoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String FormPatCartao = "Cadastros/PagamentoCartao.jsp";
    private static String List_PgtCartao = "Listagem/ListaPagamentosCartoes.jsp";
    private PagamentoCartaoDao pgtCartaoDAO;

    public PagamentoCartaoServlet() throws SQLException {
        super();
        pgtCartaoDAO = new PagamentoCartaoDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pagina = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {

            try {
                int codigo = Integer.parseInt(request.getParameter("codigo"));
                pgtCartaoDAO.Deletar(codigo);
                pagina = List_PgtCartao;
                request.setAttribute("pgtCartaoList", pgtCartaoDAO.ListarIterator());
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }

        } else if (action.equalsIgnoreCase("edit")) {
            try {
                pagina = FormPatCartao;
                int codigo = Integer.parseInt(request.getParameter("codigo"));

                PagamentoCartao pgtCartao = pgtCartaoDAO.ConsultarPorCodigo(codigo);
                request.setAttribute("pgtCartao", pgtCartao);
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        } else if (action.equalsIgnoreCase("ListaPagamentosCartoes")) {
            try {
                pagina = List_PgtCartao;
                request.setAttribute("pgtCartaoList", pgtCartaoDAO.ListarIterator());
            } catch (Exception ex) {
                System.out.println("Erro no Exception --> " + ex.getMessage());
            }
        } else {
            pagina = FormPatCartao;
        }

        //Para aparecer a pagina de acordo com ação
        RequestDispatcher view = request.getRequestDispatcher(pagina);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            PagamentoCartao pgtCartao = new PagamentoCartao();

            pgtCartao.setNomeTitular(request.getParameter("nomeTitular"));
            pgtCartao.setNumerosCartao(Long.parseLong(request.getParameter("numeroCartao")));
            try {
                Date dataValidade;
                dataValidade = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dataValidade"));
                pgtCartao.setDataValidade(dataValidade);
            } catch (ParseException e) {
                e.getMessage();
            }
            pgtCartao.setCodSeguranca(Integer.parseInt(request.getParameter("codigoSeguranca")));
            pgtCartao.setQtdParcelas(Integer.parseInt(request.getParameter("quantParcelas")));

            String codigo = request.getParameter("codigo");

            if (codigo == null || codigo.isEmpty()) {

                try {
                    pgtCartaoDAO.Cadastrar(pgtCartao);
                } catch (Exception ex) {
                    System.out.println("Erro no Exception --> " + ex.getMessage());
                }
            } else {

                try {
                    pgtCartao.setCodigo(Integer.parseInt(codigo));
                    pgtCartaoDAO.Atualizar(pgtCartao);
                } catch (Exception ex) {
                    System.out.println("Erro no Exception --> " + ex.getMessage());
                }
            }
            RequestDispatcher view = request.getRequestDispatcher(List_PgtCartao);
            request.setAttribute("pgtCartaoList", pgtCartaoDAO.ListarIterator());
            view.forward(request, response);
        } catch (Exception ex) {
            System.out.println("Erro no Exception --> " + ex.getMessage());
        }
    }
}
