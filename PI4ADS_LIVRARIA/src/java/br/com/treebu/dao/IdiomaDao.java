/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.dao;

import br.com.treebu.model.Idioma;
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
public class IdiomaDao implements GenericDao<Idioma> {

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
    public void Cadastrar(Idioma idioma) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "insert into idioma "
                + "(nome_idi) "
                + "values "
                + "(?)";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, idioma.getNome());

        pstmt.executeUpdate();
    }

    @Override
    public void Deletar(int codigo) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "delete from idioma "
                + "where cod_idi=?";
        pstmt = connect.prepareStatement(sql);
        pstmt.setInt(1, codigo);
        pstmt.executeUpdate();

    }

    @Override
    public void Atualizar(Idioma idioma) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "update idioma set "
                + "nome_idi=?"
                + "where cod_idi=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, idioma.getNome());

        pstmt.setInt(2, idioma.getCodigo());

        pstmt.executeUpdate();

    }

    @Override
    public List<Idioma> Listar() throws Exception, SQLException {
        List<Idioma> idiomaList = new ArrayList<>();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from idioma";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Idioma idioma = new Idioma();

            idioma.setCodigo(resul.getInt("cod_idi"));
            idioma.setNome(resul.getString("nome_idi"));

            idiomaList.add(idioma);
        }
        return idiomaList;
    }

    /**
     *
     * @param codigo
     * @return
     * @throws Exception
     * @throws SQLException
     */
    @Override
    public Idioma ConsultarPorCodigo(int codigo) throws Exception, SQLException {

        Idioma idioma = new Idioma();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from idioma"
                + " where cod_idi=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setInt(1, codigo);
        resul = pstmt.executeQuery();

        if (resul.next()) {

            idioma.setCodigo(resul.getInt("cod_idi"));
            idioma.setNome(resul.getString("nome_idi"));
        }

        return idioma;

    }

    public Iterator<Idioma> ListarIterator() throws Exception {
        List<Idioma> idiomaList = new ArrayList();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from idioma";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Idioma idioma = new Idioma();

            idioma.setCodigo(resul.getInt("cod_idi"));
            idioma.setNome(resul.getString("nome_idi"));

            idiomaList.add(idioma);

        }
        return idiomaList.iterator();
    }
}
