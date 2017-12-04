/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.html;

import br.com.treebu.model.Autor;
import br.com.treebu.model.Cliente;
import br.com.treebu.model.Editora;
import br.com.treebu.model.Funcionario;
import br.com.treebu.model.Genero;
import br.com.treebu.model.Idioma;
import br.com.treebu.model.Livro;
import br.com.treebu.model.Login;
import br.com.treebu.model.PagamentoCartao;
import br.com.treebu.model.Pedido;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vinicius caetano
 */
public class GeraHTML {

    public String RelatorioIdiomas(List lista) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table width='70%' border='1'>\r\n"
                + "<tr>\r\n"
                + "<td>Código</td>"
                + "<td>Nome</td>\r\n"
                + "</tr>\r\n");
        for (Iterator it = lista.iterator(); it.hasNext();) {

            Idioma idioma = (Idioma) it.next();

            sb.append("<tr>\r\n"
                    + "<td>" + idioma.getCodigo() + "</td>"
                    + "<td>" + idioma.getNome() + "</td>\r\n"
            );
        }
        sb.append("</table>");
        return sb.toString();
    }

    public String RelatorioClientes(List lista) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table width='70%' border='1'>\r\n"
                + "<tr>\r\n"
                + "<td>Código</td>"
                + "<td>Nome</td>"
                + "<td>Email</td>"
                + "<td>Cidade</td>\r\n"
                + "</tr>\r\n");
        for (Iterator it = lista.iterator(); it.hasNext();) {

            Cliente cliente = (Cliente) it.next();

            sb.append("<tr>\r\n"
                    + "<td>" + cliente.getCodigo() + "</td>"
                    + "<td>" + cliente.getNome() + "</td>"
                    + "<td>" + cliente.getEmail() + "</td>"
                    + "<td>" + cliente.getCidade() + "</td>\r\n"
            );
        }
        sb.append("</table>");
        return sb.toString();
    }

    public String RelatorioAcessos(List lista) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table width='70%' border='1'>\r\n"
                + "<tr>\r\n"
                + "<td>Código</td>"
                + "<td>Email</td>"
                + "<td>Data</td>\r\n"
                + "</tr>\r\n");
        for (Iterator it = lista.iterator(); it.hasNext();) {

            Login login = (Login) it.next();

            sb.append("<tr>\r\n"
                    + "<td>" + login.getCodigo() + "</td>"
                    + "<td>" + login.getEmail() + "</td>"
                    + "<td>" + login.getDataAutenticacao() + "</td>\r\n"
            );
        }
        sb.append("</table>");
        return sb.toString();
    }

    public String RelatorioAutores(List lista) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table width='70%' border='1'>\r\n"
                + "<tr>\r\n"
                + "<td>Código</td>"
                + "<td>Nome</td>"
                + "<td>Nacionalidade</td>\r\n"
                + "</tr>\r\n");
        for (Iterator it = lista.iterator(); it.hasNext();) {

            Autor autor = (Autor) it.next();

            sb.append("<tr>\r\n"
                    + "<td>" + autor.getCodigo() + "</td>"
                    + "<td>" + autor.getNome() + "</td>"        
                    + "<td>" + autor.getNacionalidade()+ "</td>\r\n"
            );
        }
        sb.append("</table>");
        return sb.toString();

    }

    public String RelatorioEditoras(List lista) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table width='70%' border='1'>\r\n"
                + "<tr>\r\n"
                + "<td>Código</td>"
                 + "<td>Razao Social</td>"
                 + "<td>CNPJ</td>"
                 + "<td>Email</td>"
                + "<td>Cidade</td>\r\n"
                + "</tr>\r\n");
        for (Iterator it = lista.iterator(); it.hasNext();) {

            Editora editora = (Editora) it.next();

            sb.append("<tr>\r\n"
                    + "<td>" + editora.getCodigo() + "</td>"
                    + "<td>" + editora.getRazaoSocial() + "</td>"
                    + "<td>" + editora.getCnpj() + "</td>"
                    + "<td>" + editora.getEmail() + "</td>"
                    + "<td>" + editora.getCidade() + "</td>\r\n"
            );
        }
        sb.append("</table>");
        return sb.toString();

    }

    public String RelatorioFuncionarios(List lista) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table width='70%' border='1'>\r\n"
                + "<tr>\r\n"
                + "<td>Código</td>"
                + "<td>Nome</td>"
                + "<td>Email</td>"
                + "<td>CTPS</td>"
                + "<td>Cidade</td>\r\n"
                + "</tr>\r\n");
        for (Iterator it = lista.iterator(); it.hasNext();) {

            Funcionario funcionario = (Funcionario) it.next();

            sb.append("<tr>\r\n"
                    + "<td>" + funcionario.getCodigo() + "</td>"
                    + "<td>" + funcionario.getNome() + "</td>"
                    + "<td>" + funcionario.getEmail() + "</td>"
                    + "<td>" + funcionario.getCtps() + "</td>"
                    + "<td>" + funcionario.getCidade() + "</td>\r\n"
            );
        }
        sb.append("</table>");
        return sb.toString();
    }

    public String RelatorioGeneros(List lista) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table width='70%' border='1'>\r\n"
                + "<tr>\r\n"
                + "<td>Código</td>"
                 + "<td>Nome</td>"
                + "<td>Descrição</td>\r\n"
                + "</tr>\r\n");
        for (Iterator it = lista.iterator(); it.hasNext();) {

            Genero genero = (Genero) it.next();

            sb.append("<tr>\r\n"
                    + "<td>" + genero.getCodigo() + "</td>"
                    + "<td>" + genero.getNome()+ "</td>"
                    + "<td>" + genero.getDescricao()+ "</td>\r\n"
            );
        }
        sb.append("</table>");
        return sb.toString();

    }

    public String RelatorioLivros(List lista) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table width='70%' border='1'>\r\n"
                + "<tr>\r\n"
                + "<td>Código</td>"
                + "<td>Nome</td>"
                + "<td>Data Publicação</td>"
                + "<td>Descrição</td>\r\n"
                + "</tr>\r\n");
        for (Iterator it = lista.iterator(); it.hasNext();) {

            Livro livro = (Livro) it.next();

            sb.append("<tr>\r\n"
                    + "<td>" + livro.getCodigo() + "</td>"
                    + "<td>" + livro.getNome() + "</td>"
                    + "<td>" + livro.getDataPublicacao() + "</td>"
                    + "<td>" + livro.getDescricao() + "</td>\r\n"
            );
        }
        sb.append("</table>");
        return sb.toString();

    }

    public String RelatorioPagamentoCartao(List lista) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table width='70%' border='1'>\r\n"
                + "<tr>\r\n"
                + "<td>Código</td>"
                 + "<td>Nome Titular</td>"
                + "<td>Quantidade Parcelas</td>\r\n"
                + "</tr>\r\n");
        for (Iterator it = lista.iterator(); it.hasNext();) {

            PagamentoCartao pgtCartao = (PagamentoCartao) it.next();

            sb.append("<tr>\r\n"
                    + "<td>" + pgtCartao.getCodigo() + "</td>"
                             + "<td>" + pgtCartao.getNomeTitular() + "</td>"
                    + "<td>" + pgtCartao.getQtdParcelas()+ "</td>\r\n"
            );
        }
        sb.append("</table>");
        return sb.toString();

    }

    public String RelatorioPedidos(List lista) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table width='70%' border='1'>\r\n"
                + "<tr>\r\n"
                + "<td>Numero</td>"
                + "<td>Cliente</td>"
                + "<td>Valor Total</td>\r\n"
                + "</tr>\r\n");
        for (Iterator it = lista.iterator(); it.hasNext();) {

            Pedido pedidos = (Pedido) it.next();

            sb.append("<tr>\r\n"
                    + "<td>" + pedidos.getNumero()+ "</td>"
                    + "<td>" + pedidos.getCliente()+ "</td>"
                    + "<td>" + pedidos.getValorTotal()+ "</td>\r\n"
            );
        }
        sb.append("</table>");
        return sb.toString();

    }

}
