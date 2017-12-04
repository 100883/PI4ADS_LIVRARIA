/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.dao;

import br.com.treebu.model.Genero;
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
public class GeneroDao implements GenericDao<Genero> {

    private Connection connect;
    private PreparedStatement pstmt;
    private ResultSet resul;
    private Statement stmt;

    private static GeneroDao instancia;

    public static synchronized GeneroDao getInstancia() throws SQLException {
        if (instancia == null) {
            instancia = new GeneroDao();
        }
        return instancia;
    }

    /**
     *
     * @param genero
     * @throws Exception
     * @throws SQLException
     */
    @Override
    public void Cadastrar(Genero genero) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "insert into genero "
                + "(nome_gen,"
                + "descricao_gen) "
                + "values "
                + "(?,?)";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, genero.getNome());
        pstmt.setString(2, genero.getDescricao());

        pstmt.executeUpdate();

    }

    /**
     *
     * @param codigo
     * @throws Exception
     * @throws SQLException
     */
    @Override
    public void Deletar(int codigo) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "delete from genero "
                + "where cod_gen=?";
        pstmt = connect.prepareStatement(sql);
        pstmt.setInt(1, codigo);
        pstmt.executeUpdate();

    }

    /**
     *
     * @param genero
     * @throws Exception
     * @throws SQLException
     */
    @Override
    public void Atualizar(Genero genero) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "update genero set "
                + "nome_gen=?,"
                + "descricao_gen=?"
                + "where cod_gen=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, genero.getNome());
        pstmt.setString(2, genero.getDescricao());

        pstmt.setInt(3, genero.getCodigo());

        pstmt.executeUpdate();

    }

    /**
     *
     * @return @throws Exception
     * @throws SQLException
     */
    @Override
    public List<Genero> Listar() throws Exception, SQLException {

        List<Genero> generoList = new ArrayList<>();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from genero";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Genero genero = new Genero();

            genero.setCodigo(resul.getInt("cod_gen"));
            genero.setNome(resul.getString("nome_gen"));
            genero.setDescricao(resul.getString("descricao_gen"));

            generoList.add(genero);
        }

        return generoList;
    }

    /**
     *
     * @param codigo
     * @return
     * @throws Exception
     * @throws SQLException
     */
    @Override
    public Genero ConsultarPorCodigo(int codigo) throws Exception, SQLException {
        Genero genero = new Genero();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from genero"
                + " where cod_gen=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setInt(1, codigo);
        resul = pstmt.executeQuery();

        if (resul.next()) {

            genero.setCodigo(resul.getInt("cod_gen"));
            genero.setNome(resul.getString("nome_gen"));
            genero.setDescricao(resul.getString("descricao_gen"));
        }
        return genero;
    }

    public Iterator<Genero> ListarIterator() throws Exception {
        List<Genero> idiomaList = new ArrayList();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from genero";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Genero genero = new Genero();

            genero.setCodigo(resul.getInt("cod_gen"));
            genero.setNome(resul.getString("nome_gen"));
            genero.setDescricao(resul.getString("descricao_gen"));

            idiomaList.add(genero);

        }

        return idiomaList.iterator();

    }

}
