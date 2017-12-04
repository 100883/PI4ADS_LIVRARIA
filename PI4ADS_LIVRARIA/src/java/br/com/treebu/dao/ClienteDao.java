/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.dao;

import br.com.treebu.model.Cliente;
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
public class ClienteDao implements GenericDao<Cliente> {

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

    /**
     *
     * @param cliente
     * @throws Exception
     * @throws SQLException
     */
    @Override
    public void Cadastrar(Cliente cliente) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "insert into cliente "
                + "(email_cli,"
                + "senha_cli,"
                + "nome_cli,"
                + "telefone_cli,"
                + "cpf_cli,"
                + "datenascimento,"
                + "datecadastro,"
                + "logradouro_cli,"
                + "complemento_cli,"
                + "bairro_cli,"
                + "cidade_cli,"
                + "estado_cli,"
                + "cep_cli) "
                + "values "
                + "(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, cliente.getEmail());
        pstmt.setString(2, cliente.getSenha());
        pstmt.setString(3, cliente.getNome());
        pstmt.setString(4, cliente.getTelefone());
        pstmt.setString(5, cliente.getCpf());
        pstmt.setDate(6, new java.sql.Date(cliente.getDataNascimento().getTime()));
        pstmt.setDate(7, new java.sql.Date(cliente.getDataCadastro().getTime()));
        pstmt.setString(8, cliente.getLogradouro());
        pstmt.setString(9, cliente.getComplemento());
        pstmt.setString(10, cliente.getBairro());
        pstmt.setString(11, cliente.getCidade());
        pstmt.setString(12, cliente.getEstado());
        pstmt.setString(13, cliente.getCep());
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
        String sql = "delete from cliente "
                + "where cod_cli=?";
        pstmt = connect.prepareStatement(sql);
        pstmt.setInt(1, codigo);
        pstmt.executeUpdate();
    }

    /**
     *
     * @param cliente
     * @throws Exception
     * @throws SQLException
     */
    @Override
    public void Atualizar(Cliente cliente) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "update cliente set "
                + "email_cli=?,"
                + "senha_cli=?,"
                + "nome_cli=?,"
                + "telefone_cli=?,"
                + "cpf_cli=?,"
                + "datenascimento=?,"
                + "datecadastro=?,"
                + "logradouro_cli=?,"
                + "complemento_cli=?,"
                + "bairro_cli=?,"
                + "cidade_cli=?,"
                + "estado_cli=?,"
                + "cep_cli=?"
                + "where cod_cli=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setString(1, cliente.getEmail());
        pstmt.setString(2, cliente.getSenha());
        pstmt.setString(3, cliente.getNome());
        pstmt.setString(4, cliente.getTelefone());
        pstmt.setString(5, cliente.getCpf());
        pstmt.setDate(6, new java.sql.Date(cliente.getDataNascimento().getTime()));
        pstmt.setDate(7, new java.sql.Date(cliente.getDataCadastro().getTime()));
        pstmt.setString(8, cliente.getLogradouro());
        pstmt.setString(9, cliente.getComplemento());
        pstmt.setString(10, cliente.getBairro());
        pstmt.setString(11, cliente.getCidade());
        pstmt.setString(12, cliente.getEstado());
        pstmt.setString(13, cliente.getCep());

        pstmt.setInt(14, cliente.getCodigo());

        pstmt.executeUpdate();

    }

    /**
     *
     * @return @throws Exception
     * @throws SQLException
     */
    @Override
    public List<Cliente> Listar() throws Exception, SQLException {
        List<Cliente> clienteList = new ArrayList<>();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from cliente";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Cliente cliente = new Cliente();

            cliente.setCodigo(resul.getInt("cod_cli"));
            cliente.setEmail(resul.getString("email_cli"));
            cliente.setSenha(resul.getString("senha_cli"));
            cliente.setNome(resul.getString("nome_cli"));
            cliente.setTelefone(resul.getString("telefone_cli"));
            cliente.setCpf(resul.getString("cpf_cli"));
            cliente.setDataNascimento(resul.getDate("datenascimento"));
            cliente.setDataCadastro(resul.getDate("datecadastro"));
            cliente.setLogradouro(resul.getString("logradouro_cli"));
            cliente.setComplemento(resul.getString("complemento_cli"));
            cliente.setBairro(resul.getString("bairro_cli"));
            cliente.setCidade(resul.getString("cidade_cli"));
            cliente.setEstado(resul.getString("estado_cli"));
            cliente.setCep(resul.getString("cep_cli"));

            clienteList.add(cliente);

        }
        return clienteList;
    }

    /**
     *
     * @param codigo
     * @return
     * @throws Exception
     * @throws SQLException
     */
    @Override
    public Cliente ConsultarPorCodigo(int codigo) throws Exception, SQLException {

        Cliente cliente = new Cliente();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from cliente"
                + " where cod_cli=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setInt(1, codigo);
        resul = pstmt.executeQuery();

        if (resul.next()) {

            cliente.setCodigo(resul.getInt("cod_cli"));
            cliente.setEmail(resul.getString("email_cli"));
            cliente.setSenha(resul.getString("senha_cli"));
            cliente.setNome(resul.getString("nome_cli"));
            cliente.setTelefone(resul.getString("telefone_cli"));
            cliente.setCpf(resul.getString("cpf_cli"));
            cliente.setDataNascimento(resul.getDate("datenascimento"));
            cliente.setDataCadastro(resul.getDate("datecadastro"));
            cliente.setLogradouro(resul.getString("logradouro_cli"));
            cliente.setComplemento(resul.getString("complemento_cli"));
            cliente.setBairro(resul.getString("bairro_cli"));
            cliente.setCidade(resul.getString("cidade_cli"));
            cliente.setEstado(resul.getString("estado_cli"));
            cliente.setCep(resul.getString("cep_cli"));
        }
        return cliente;
    }

    public boolean validarAutenticacao(Cliente cliente) {
        try {

            connect = FabricadeConexao.getInstancia().getConexao();
            String sql = "select * from cliente where email_cli=? and senha_cli=?";
            pstmt = connect.prepareStatement(sql);

            pstmt.setString(1, cliente.getEmail());
            pstmt.setString(2, cliente.getSenha());

            resul = pstmt.executeQuery();

            if (resul.next()) {
                return true;
            }

        } catch (Exception ex) {
            System.out.println(" Erro Exception " + ex.getMessage());
        }

        return false;
    }

    public Iterator<Cliente> ListarIterator() throws Exception {
        List<Cliente> clienteList = new ArrayList();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from cliente";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Cliente cliente = new Cliente();

            cliente.setCodigo(resul.getInt("cod_cli"));
            cliente.setEmail(resul.getString("email_cli"));
            cliente.setSenha(resul.getString("senha_cli"));
            cliente.setNome(resul.getString("nome_cli"));
            cliente.setTelefone(resul.getString("telefone_cli"));
            cliente.setCpf(resul.getString("cpf_cli"));
            cliente.setDataNascimento(resul.getDate("datenascimento"));
            cliente.setDataCadastro(resul.getDate("datecadastro"));
            cliente.setLogradouro(resul.getString("logradouro_cli"));
            cliente.setComplemento(resul.getString("complemento_cli"));
            cliente.setBairro(resul.getString("bairro_cli"));
            cliente.setCidade(resul.getString("cidade_cli"));
            cliente.setEstado(resul.getString("estado_cli"));
            cliente.setCep(resul.getString("cep_cli"));

            clienteList.add(cliente);

        }

        return clienteList.iterator();

    }

}
