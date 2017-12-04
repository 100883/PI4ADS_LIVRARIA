/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.dao;

import br.com.treebu.model.Login;
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
public class LoginDao implements GenericDao<Login> {

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

    public boolean validarLogin(String email, String senha) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from cliente "
                + "where email_cli = '" + email + "' and senha_cli = '" + senha + "'";
        pstmt = connect.prepareStatement(sql);

        resul = pstmt.executeQuery();

        if (resul.next()) {
            return true; //Possui Cadastro Valido
        } else {
            return false; //Nao Possui Cadastro Valido
        }
    }

    public boolean validarLoginFuncionario(String email, String senha) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from funcionario "
                + "where email_fun = '" + email + "' and senha_fun = '" + senha + "'";
        pstmt = connect.prepareStatement(sql);

        resul = pstmt.executeQuery();

        if (resul.next()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void Cadastrar(Login login) throws Exception, SQLException {
        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "insert into login "
                + "(email_log,"
                + "senha_log,"
                + "dateautenticacao) "
                + "values "
                + "(?,?,?)";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, login.getEmail());
        pstmt.setString(2, login.getSenha());
        pstmt.setDate(3, new java.sql.Date(login.getDataAutenticacao().getTime()));

        pstmt.executeUpdate();

    }

    @Override
    public void Deletar(int codigo) throws Exception, SQLException {
        System.out.println("Por motivo de segurança nao e sera possivel realizar esta ação.");
    }

    @Override
    public void Atualizar(Login entidade) throws Exception, SQLException {
        System.out.println("Por motivo de segurança nao e sera possivel realizar esta ação.");
    }

    @Override
    public List<Login> Listar() throws Exception, SQLException {
        List<Login> loginList = new ArrayList<>();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from login";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Login login = new Login();

            login.setCodigo(resul.getInt("cod_log"));
            login.setEmail(resul.getString("email_log"));
            login.setSenha(resul.getString("senha_log"));
            login.setDataAutenticacao(resul.getDate("dateautenticacao"));

            loginList.add(login);
        }
        return loginList;
    }

    @Override
    public Login ConsultarPorCodigo(int codigo) throws Exception, SQLException {
        Login login = new Login();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from login"
                + " where cod_log=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setInt(1, codigo);
        resul = pstmt.executeQuery();

        if (resul.next()) {

            login.setCodigo(resul.getInt("cod_log"));
            login.setEmail(resul.getString("email_log"));
            login.setSenha(resul.getString("senha_log"));
            login.setDataAutenticacao(resul.getDate("dateautenticacao"));
        }

        return login;
    }

    public Iterator<Login> ListarIterator() throws Exception {
        List<Login> loginList = new ArrayList();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from idioma";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Login login = new Login();

            login.setCodigo(resul.getInt("cod_log"));
            login.setEmail(resul.getString("email_log"));
            login.setSenha(resul.getString("senha_log"));
            login.setDataAutenticacao(resul.getDate("dateautenticacao"));

            loginList.add(login);

        }
        return loginList.iterator();
    }
}
