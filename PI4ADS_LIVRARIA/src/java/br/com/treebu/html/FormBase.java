/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.html;

import br.com.treebu.dao.AutorDao;
import br.com.treebu.dao.ClienteDao;
import br.com.treebu.dao.EditoraDao;
import br.com.treebu.dao.FuncionarioDao;
import br.com.treebu.dao.GeneroDao;
import br.com.treebu.dao.IdiomaDao;
import br.com.treebu.dao.LivroDao;
import br.com.treebu.dao.LoginDao;
import br.com.treebu.dao.PagamentoCartaoDao;
import br.com.treebu.dao.PedidoDao;

/**
 *
 * @author vinicius caetano
 */
public class FormBase extends BaseGenerator {

    public String getRelatoriosAcessos() {
        try {
            LoginDao dao = new LoginDao();
            return html.RelatorioAcessos(dao.Listar());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }

    public String getRelatoriosAutores() {
        try {
            AutorDao dao = new AutorDao();
            return html.RelatorioAutores(dao.Listar());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }

    public String getRelatoriosClientes() {
        try {
            ClienteDao dao = new ClienteDao();
            return html.RelatorioClientes(dao.Listar());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }

    public String getRelatoriosEditoras() {
        try {
            EditoraDao dao = new EditoraDao();
            return html.RelatorioEditoras(dao.Listar());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }

    public String getRelatoriosFuncionarios() {
        try {
            FuncionarioDao dao = new FuncionarioDao();
            return html.RelatorioFuncionarios(dao.Listar());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }

    public String getRelatoriosGeneros() {
        try {
            GeneroDao dao = new GeneroDao();
            return html.RelatorioGeneros(dao.Listar());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }

    public String getRelatoriosIdioma() {
        try {
            IdiomaDao dao = new IdiomaDao();
            return html.RelatorioIdiomas(dao.Listar());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }

    public String getRelatoriosLivros() {
        try {
            LivroDao dao = new LivroDao();
            return html.RelatorioLivros(dao.Listar());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }

    public String getRelatoriosPagamentoCartao() {
        try {
            PagamentoCartaoDao dao = new PagamentoCartaoDao();
            return html.RelatorioPagamentoCartao(dao.Listar());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }

    public String getRelatoriosPedidos() {
        try {
            PedidoDao dao = new PedidoDao();
            return html.RelatorioPedidos(dao.Listar());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }
}
