/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.dao;

import br.com.treebu.model.Editora;
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
public class EditoraDao implements GenericDao<Editora> {

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
    public void Cadastrar(Editora editora) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "insert into editora "
                + "(razaosocial_edi,"
                + "cnpj_edi,"
                + "telefone_edi,"
                + "email_edi,"
                + "representante_edi,"
                + "logradouro_edi,"
                + "complemento_edi,"
                + "bairro_edi,"
                + "cidade_edi,"
                + "estado_edi,"
                + "cep_edi) "
                + "values "
                + "(?,?,?,?,?,?,?,?,?,?,?)";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, editora.getRazaoSocial());
        pstmt.setString(2, editora.getCnpj());
        pstmt.setString(3, editora.getTelefone());
        pstmt.setString(4, editora.getEmail());
        pstmt.setString(5, editora.getRepresentante());
        pstmt.setString(6, editora.getLogradouro());
        pstmt.setString(7, editora.getComplemento());
        pstmt.setString(8, editora.getBairro());
        pstmt.setString(9, editora.getCidade());
        pstmt.setString(10, editora.getEstado());
        pstmt.setString(11, editora.getCep());
        pstmt.executeUpdate();

    }

    @Override
    public void Deletar(int codigo) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "delete from editora "
                + "where cod_edi=?";
        pstmt = connect.prepareStatement(sql);
        pstmt.setInt(1, codigo);
        pstmt.executeUpdate();
    }

    @Override
    public void Atualizar(Editora editora) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "update editora set "
                + "razaosocial_edi=?,"
                + "cnpj_edi=?,"
                + "telefone_edi=?,"
                + "email_edi=?,"
                + "representante_edi=?,"
                + "logradouro_edi=?,"
                + "complemento_edi=?,"
                + "bairro_edi=?,"
                + "cidade_edi=?,"
                + "estado_edi=?,"
                + "cep_edi=?"
                + "where cod_edi=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, editora.getRazaoSocial());
        pstmt.setString(2, editora.getCnpj());
        pstmt.setString(3, editora.getTelefone());
        pstmt.setString(4, editora.getEmail());
        pstmt.setString(5, editora.getRepresentante());
        pstmt.setString(6, editora.getLogradouro());
        pstmt.setString(7, editora.getComplemento());
        pstmt.setString(8, editora.getBairro());
        pstmt.setString(9, editora.getCidade());
        pstmt.setString(10, editora.getEstado());
        pstmt.setString(11, editora.getCep());
        pstmt.setInt(12, editora.getCodigo());

        pstmt.executeUpdate();

    }

    @Override
    public List<Editora> Listar() throws Exception, SQLException {

        List<Editora> editoraList = new ArrayList<>();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from editora";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Editora editora = new Editora();

            editora.setCodigo(resul.getInt("cod_edi"));
            editora.setRazaoSocial(resul.getString("razaosocial_edi"));
            editora.setCnpj(resul.getString("cnpj_edi"));
            editora.setTelefone(resul.getString("telefone_edi"));
            editora.setEmail(resul.getString("email_edi"));
            editora.setRepresentante(resul.getString("representante_edi"));
            editora.setLogradouro(resul.getString("logradouro_edi"));
            editora.setComplemento(resul.getString("complemento_edi"));
            editora.setBairro(resul.getString("bairro_edi"));
            editora.setCidade(resul.getString("cidade_edi"));
            editora.setEstado(resul.getString("estado_edi"));
            editora.setCep(resul.getString("cep_edi"));

            editoraList.add(editora);

        }
        return editoraList;
    }

    @Override
    public Editora ConsultarPorCodigo(int codigo) throws Exception, SQLException {
        Editora editora = new Editora();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from editora"
                + " where cod_edi=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setInt(1, codigo);
        resul = pstmt.executeQuery();

        if (resul.next()) {

            editora.setCodigo(resul.getInt("cod_edi"));
            editora.setRazaoSocial(resul.getString("razaosocial_edi"));
            editora.setCnpj(resul.getString("cnpj_edi"));
            editora.setTelefone(resul.getString("telefone_edi"));
            editora.setEmail(resul.getString("email_edi"));
            editora.setRepresentante(resul.getString("representante_edi"));
            editora.setLogradouro(resul.getString("logradouro_edi"));
            editora.setComplemento(resul.getString("complemento_edi"));
            editora.setBairro(resul.getString("bairro_edi"));
            editora.setCidade(resul.getString("cidade_edi"));
            editora.setEstado(resul.getString("estado_edi"));
            editora.setCep(resul.getString("cep_edi"));
        }

        return editora;
    }

    public Iterator<Editora> ListarIterator() throws Exception {
        List<Editora> editoraList = new ArrayList();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from editora";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Editora editora = new Editora();

            editora.setCodigo(resul.getInt("cod_edi"));
            editora.setRazaoSocial(resul.getString("razaosocial_edi"));
            editora.setCnpj(resul.getString("cnpj_edi"));
            editora.setTelefone(resul.getString("telefone_edi"));
            editora.setEmail(resul.getString("email_edi"));
            editora.setRepresentante(resul.getString("representante_edi"));
            editora.setLogradouro(resul.getString("logradouro_edi"));
            editora.setComplemento(resul.getString("complemento_edi"));
            editora.setBairro(resul.getString("bairro_edi"));
            editora.setCidade(resul.getString("cidade_edi"));
            editora.setEstado(resul.getString("estado_edi"));
            editora.setCep(resul.getString("cep_edi"));

            editoraList.add(editora);

        }

        return editoraList.iterator();

    }
}
