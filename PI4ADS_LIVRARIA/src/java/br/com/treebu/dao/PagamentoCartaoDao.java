/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.dao;

import br.com.treebu.model.PagamentoCartao;
import br.com.treebu.util.FabricadeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vinicius caetano
 */
public class PagamentoCartaoDao implements GenericDao<PagamentoCartao> {

    private Connection connect;
    private PreparedStatement pstmt;
    private ResultSet resul;
    private Statement stmt;

    private static AutorDao instancia;

    public static synchronized AutorDao getInstancia() throws SQLException {
        if (instancia == null) {
            instancia = new AutorDao();
        }
        return instancia;
    }

    @Override
    public void Cadastrar(PagamentoCartao pgtCartao) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "insert into pagamentocartao "
                + "(titular_pgtcartao,"
                + "numcartao_pgtcartao,"
                + "datevalidade,"
                + "codseg_pgtcartao,"
                + "qdtparcelas_pgtcartao) "
                + "values "
                + "(?,?,?,?,?)";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, pgtCartao.getNomeTitular());
        pstmt.setLong(2, pgtCartao.getNumerosCartao());
        pstmt.setDate(3, new java.sql.Date(pgtCartao.getDataValidade().getTime()));
        pstmt.setInt(4, pgtCartao.getCodSeguranca());
        pstmt.setInt(5, pgtCartao.getQtdParcelas());

        pstmt.executeUpdate();
    }

    @Override
    public void Deletar(int codigo) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "delete from pagamentocartao "
                + "where cod_pgtcartao=?";
        pstmt = connect.prepareStatement(sql);
        pstmt.setInt(1, codigo);
        pstmt.executeUpdate();
    }

    @Override
    public void Atualizar(PagamentoCartao pgtCartao) throws Exception, SQLException {
        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "update pagamentocartao set "
                + "titular_pgtcartao=?,"
                + "numcartao_pgtcartao=?,"
                + "datevalidade=?,"
                + "codseg_pgtcartao=?,"
                + "qdtparcelas_pgtcartao=?"
                + "where cod_pgtcartao=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, pgtCartao.getNomeTitular());
        pstmt.setLong(2, pgtCartao.getNumerosCartao());
        pstmt.setDate(3, new java.sql.Date(pgtCartao.getDataValidade().getTime()));
        pstmt.setInt(4, pgtCartao.getCodSeguranca());
        pstmt.setInt(5, pgtCartao.getQtdParcelas());

        pstmt.setInt(6, pgtCartao.getCodigo());

        pstmt.executeUpdate();
    }

    @Override
    public List<PagamentoCartao> Listar() throws Exception, SQLException {

        List<PagamentoCartao> pgtCartaoList = new ArrayList<>();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from pagamentocartao";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            PagamentoCartao pgtCartao = new PagamentoCartao();

            pgtCartao.setCodigo(resul.getInt("cod_pgtcartao"));
            pgtCartao.setNomeTitular(resul.getString("titular_pgtcartao"));
            pgtCartao.setNumerosCartao(resul.getLong("numcartao_pgtcartao"));
            pgtCartao.setDataValidade(resul.getDate("datevalidade"));
            pgtCartao.setCodSeguranca(resul.getInt("codseg_pgtcartao"));
            pgtCartao.setQtdParcelas(resul.getInt("qdtparcelas_pgtcartao"));

            pgtCartaoList.add(pgtCartao);
        }

        return pgtCartaoList;
    }

    @Override
    public PagamentoCartao ConsultarPorCodigo(int codigo) throws Exception, SQLException {
        PagamentoCartao pgtCartao = new PagamentoCartao();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from pagamentocartao"
                + " where cod_pgtcartao=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setInt(1, codigo);
        resul = pstmt.executeQuery();

        if (resul.next()) {

            pgtCartao.setCodigo(resul.getInt("cod_pgtcartao"));
            pgtCartao.setNomeTitular(resul.getString("titular_pgtcartao"));
            pgtCartao.setNumerosCartao(resul.getLong("numcartao_pgtcartao"));
            pgtCartao.setDataValidade(resul.getDate("datevalidade"));
            pgtCartao.setCodSeguranca(resul.getInt("codseg_pgtcartao"));
            pgtCartao.setQtdParcelas(resul.getInt("qdtparcelas_pgtcartao"));
        }
        return pgtCartao;
    }

    public Iterator<PagamentoCartao> ListarIterator() throws Exception {
        List<PagamentoCartao> idiomaList = new ArrayList();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from pagamentocartao";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            PagamentoCartao pgtCartaoList = new PagamentoCartao();

            pgtCartaoList.setCodigo(resul.getInt("cod_pgtcartao"));
            pgtCartaoList.setNomeTitular(resul.getString("titular_pgtcartao"));
            pgtCartaoList.setNumerosCartao(resul.getLong("numcartao_pgtcartao"));
            pgtCartaoList.setDataValidade(resul.getDate("datevalidade"));
            pgtCartaoList.setCodSeguranca(resul.getInt("codseg_pgtcartao"));
            pgtCartaoList.setQtdParcelas(resul.getInt("qdtparcelas_pgtcartao"));

            idiomaList.add(pgtCartaoList);
        }
        return idiomaList.iterator();
    }
}
