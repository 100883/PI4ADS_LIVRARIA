/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.dao;

import br.com.treebu.model.Funcionario;
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
public class FuncionarioDao implements GenericDao<Funcionario> {

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
    public void Cadastrar(Funcionario funcionario) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "insert into funcionario "
                + "(email_fun,"
                + "senha_fun,"
                + "nome_fun,"
                + "telefone_fun,"
                + "cpf_fun,"
                + "datenascimento,"
                + "dateadmissao,"
                + "ctps,"
                + "logradouro_fun,"
                + "complemento_fun,"
                + "bairro_fun,"
                + "cidade_fun,"
                + "estado_fun,"
                + "cep_fun) "
                + "values "
                + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, funcionario.getEmail());
        pstmt.setString(2, funcionario.getSenha());
        pstmt.setString(3, funcionario.getNome());
        pstmt.setString(4, funcionario.getTelefone());
        pstmt.setString(5, funcionario.getCpf());
        pstmt.setDate(6, new java.sql.Date(funcionario.getDataNascimento().getTime()));
        pstmt.setDate(7, new java.sql.Date(funcionario.getDataAdmissao().getTime()));
        pstmt.setString(8, funcionario.getCtps());
        pstmt.setString(9, funcionario.getLogradouro());
        pstmt.setString(10, funcionario.getComplemento());
        pstmt.setString(11, funcionario.getBairro());
        pstmt.setString(12, funcionario.getCidade());
        pstmt.setString(13, funcionario.getEstado());
        pstmt.setString(14, funcionario.getCep());
        pstmt.executeUpdate();

    }

    @Override
    public void Deletar(int codigo) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "delete from funcionario "
                + "where cod_fun=?";
        pstmt = connect.prepareStatement(sql);
        pstmt.setInt(1, codigo);
        pstmt.executeUpdate();

    }

    @Override
    public void Atualizar(Funcionario funcionario) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "update funcionario set "
                + "email_fun=?,"
                + "senha_fun=?,"
                + "nome_fun=?,"
                + "telefone_fun=?,"
                + "cpf_fun=?,"
                + "datenascimento=?,"
                + "dateadmissao=?,"
                + "ctps=?,"
                + "logradouro_fun=?,"
                + "complemento_fun=?,"
                + "bairro_fun=?,"
                + "cidade_fun=?,"
                + "estado_fun=?,"
                + "cep_fun=?"
                + "where cod_fun=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, funcionario.getEmail());
        pstmt.setString(2, funcionario.getSenha());
        pstmt.setString(3, funcionario.getNome());
        pstmt.setString(4, funcionario.getTelefone());
        pstmt.setString(5, funcionario.getCpf());
        pstmt.setDate(6, new java.sql.Date(funcionario.getDataNascimento().getTime()));
        pstmt.setDate(7, new java.sql.Date(funcionario.getDataAdmissao().getTime()));
        pstmt.setString(8, funcionario.getCtps());
        pstmt.setString(9, funcionario.getLogradouro());
        pstmt.setString(10, funcionario.getComplemento());
        pstmt.setString(11, funcionario.getBairro());
        pstmt.setString(12, funcionario.getCidade());
        pstmt.setString(13, funcionario.getEstado());
        pstmt.setString(14, funcionario.getCep());
        pstmt.setInt(15, funcionario.getCodigo());

        pstmt.executeUpdate();

    }

    /**
     *
     * @return @throws Exception
     * @throws SQLException
     */
    @Override
    public List<Funcionario> Listar() throws Exception, SQLException {

        List<Funcionario> funcionarioList = new ArrayList<>();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from funcionario";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Funcionario funcionario = new Funcionario();

            funcionario.setCodigo(resul.getInt("cod_fun"));
            funcionario.setEmail(resul.getString("email_fun"));
            funcionario.setSenha(resul.getString("senha_fun"));
            funcionario.setNome(resul.getString("nome_fun"));
            funcionario.setTelefone(resul.getString("telefone_fun"));
            funcionario.setCpf(resul.getString("cpf_fun"));
            funcionario.setDataNascimento(resul.getDate("datenascimento"));
            funcionario.setDataAdmissao(resul.getDate("dateadmissao"));
            funcionario.setCtps(resul.getString("ctps"));
            funcionario.setLogradouro(resul.getString("logradouro_fun"));
            funcionario.setComplemento(resul.getString("complemento_fun"));
            funcionario.setBairro(resul.getString("bairro_fun"));
            funcionario.setCidade(resul.getString("cidade_fun"));
            funcionario.setEstado(resul.getString("estado_fun"));
            funcionario.setCep(resul.getString("cep_fun"));

            funcionarioList.add(funcionario);
        }
        return funcionarioList;
    }

    @Override
    public Funcionario ConsultarPorCodigo(int codigo) throws Exception, SQLException {

        Funcionario funcionario = new Funcionario();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from funcionario"
                + " where cod_fun=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setInt(1, codigo);
        resul = pstmt.executeQuery();

        if (resul.next()) {

            //Dados Pessoais
            funcionario.setCodigo(resul.getInt("cod_fun"));
            funcionario.setEmail(resul.getString("email_fun"));
            funcionario.setSenha(resul.getString("senha_fun"));
            funcionario.setNome(resul.getString("nome_fun"));
            funcionario.setTelefone(resul.getString("telefone_fun"));
            funcionario.setCpf(resul.getString("cpf_fun"));
            funcionario.setDataNascimento(resul.getDate("datenascimento"));
            funcionario.setDataAdmissao(resul.getDate("dateadmissao"));
            funcionario.setCtps(resul.getString("ctps"));
            funcionario.setLogradouro(resul.getString("logradouro_fun"));
            funcionario.setComplemento(resul.getString("complemento_fun"));
            funcionario.setBairro(resul.getString("bairro_fun"));
            funcionario.setCidade(resul.getString("cidade_fun"));
            funcionario.setEstado(resul.getString("estado_fun"));
            funcionario.setCep(resul.getString("cep_fun"));
        }
        return funcionario;
    }

    public boolean validarAutenticacao(Funcionario funcionario) {
        try {

            connect = FabricadeConexao.getInstancia().getConexao();
            String sql = "select * from funcionario where email_fun=? and senha_fun=?";
            pstmt = connect.prepareStatement(sql);

            pstmt.setString(1, funcionario.getEmail());
            pstmt.setString(2, funcionario.getSenha());

            resul = pstmt.executeQuery();

            if (resul.next()) {
                return true;
            }

        } catch (Exception ex) {
            System.out.println(" Erro Exception " + ex.getMessage());
        }

        return false;
    }

    public Iterator<Funcionario> ListarIterator() throws Exception {
        List<Funcionario> funcionarioList = new ArrayList();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from funcionario";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Funcionario funcionario = new Funcionario();

            funcionario.setCodigo(resul.getInt("cod_fun"));
            funcionario.setEmail(resul.getString("email_fun"));
            funcionario.setSenha(resul.getString("senha_fun"));
            funcionario.setNome(resul.getString("nome_fun"));
            funcionario.setTelefone(resul.getString("telefone_fun"));
            funcionario.setCpf(resul.getString("cpf_fun"));
            funcionario.setDataNascimento(resul.getDate("datenascimento"));
            funcionario.setDataAdmissao(resul.getDate("dateadmissao"));
            funcionario.setCtps(resul.getString("ctps"));
            funcionario.setLogradouro(resul.getString("logradouro_fun"));
            funcionario.setComplemento(resul.getString("complemento_fun"));
            funcionario.setBairro(resul.getString("bairro_fun"));
            funcionario.setCidade(resul.getString("cidade_fun"));
            funcionario.setEstado(resul.getString("estado_fun"));
            funcionario.setCep(resul.getString("cep_fun"));

            funcionarioList.add(funcionario);

        }

        return funcionarioList.iterator();

    }

}
