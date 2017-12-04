/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.dao;

import br.com.treebu.model.Autor;
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
public class AutorDao implements GenericDao<Autor> {

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

    //Persistencia Salvar os Dados
    // Implementação da Classe Abstrata GenericDao
    /**
     *
     * @param autor
     * @throws Exception
     * @throws SQLException
     */
    @Override
    public void Cadastrar(Autor autor) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "insert into autor "
                + "(nome_aut,"
                + " nacionalidade_aut,"
                + " datanascimento_aut,"
                + " status_aut,"
                + " descricao_aut)"
                + " values (?,?,?,?,?)";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, autor.getNome());
        pstmt.setString(2, autor.getNacionalidade());
        pstmt.setDate(3, new java.sql.Date(autor.getDataNascimento().getTime()));
        pstmt.setBoolean(4, autor.isStatus());
        pstmt.setString(5, autor.getDescricao());

        pstmt.executeUpdate();

    }

    //Persistencia Deletar os Dados
    // Implementação da Classe Abstrata GenericDao
    /**
     *
     * @param codigo
     * @throws Exception
     * @throws SQLException
     */
    @Override
    public void Deletar(int codigo) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "delete from autor "
                + "where cod_aut=?";
        pstmt = connect.prepareStatement(sql);
        pstmt.setInt(1, codigo);
        pstmt.executeUpdate();

    }

    //Persistencia Alterar os Dados
    // Implementação da Classe Abstrata GenericDao
    /**
     *
     * @param autor
     * @throws Exception
     * @throws SQLException
     */
    @Override
    public void Atualizar(Autor autor) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "update autor set "
                + "nome_idi=?"
                + "nacionalidade_aut=?,"
                + "datanascimento_aut=?,"
                + "status_aut=?,"
                + "descricao_aut=?"
                + "where cod_aut=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, autor.getNome());
        pstmt.setString(2, autor.getNacionalidade());
        pstmt.setDate(3, new java.sql.Date(autor.getDataNascimento().getTime()));
        pstmt.setBoolean(4, autor.isStatus());
        pstmt.setString(5, autor.getDescricao());
        pstmt.setInt(6, autor.getCodigo());

        pstmt.executeUpdate();

    }

    //Persistencia Listar os Dados
    // Implementação da Classe Abstrata GenericDao
    /**
     *
     * @return @throws Exception
     * @throws SQLException
     */
    @Override
    public List<Autor> Listar() throws Exception, SQLException {
        List<Autor> autorList = new ArrayList<>();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from autor";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Autor autor = new Autor();

            autor.setCodigo(resul.getInt("cod_aut"));
            autor.setNome(resul.getString("nome_aut"));
            autor.setNacionalidade(resul.getString("nacionalidade_aut"));
            autor.setDataNascimento(resul.getDate("datanascimento_aut"));
            autor.setStatus(resul.getBoolean("status_aut"));
            autor.setDescricao(resul.getString("descricao_aut"));

            autorList.add(autor);
        }
        return autorList;
    }

    //Persistencia Consultar os Dados
    // Implementação da Classe Abstrata GenericDao
    /**
     *
     * @param codigo
     * @return
     * @throws Exception
     * @throws SQLException
     */
    @Override
    public Autor ConsultarPorCodigo(int codigo) throws Exception, SQLException {
        Autor autor = new Autor();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from autor"
                + " where cod_aut=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setInt(1, codigo);
        resul = pstmt.executeQuery();

        if (resul.next()) {

            autor.setCodigo(resul.getInt("cod_aut"));
            autor.setNome(resul.getString("nome_aut"));
            autor.setNacionalidade(resul.getString("nacionalidade_aut"));
            autor.setDataNascimento(resul.getDate("datanascimento_aut"));
            autor.setStatus(resul.getBoolean("status_aut"));
            autor.setDescricao(resul.getString("descricao_aut"));
        }

        return autor;

    }
    
    public Iterator<Autor> ListarIterator() throws Exception {
        List<Autor> autorList=  new ArrayList();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from autor";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Autor autor = new Autor();

            autor.setCodigo(resul.getInt("cod_aut"));
            autor.setNome(resul.getString("nome_aut"));
            autor.setNacionalidade(resul.getString("nacionalidade_aut"));
            autor.setDataNascimento(resul.getDate("datanascimento_aut"));
            autor.setStatus(resul.getBoolean("status_aut"));
            autor.setDescricao(resul.getString("descricao_aut"));

            autorList.add(autor);

        }

        return autorList.iterator();

    }
}
