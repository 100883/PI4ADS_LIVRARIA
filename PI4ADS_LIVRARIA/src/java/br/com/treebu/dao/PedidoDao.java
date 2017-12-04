/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.dao;

import br.com.treebu.model.Pedido;
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
public class PedidoDao implements GenericDao<Pedido> {

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
    public void Cadastrar(Pedido pedido) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "insert into pedido "
                + "(cod_cliente,"
                + "valortot_ped) "
                + "values "
                + "(?,?)";
        pstmt = connect.prepareStatement(sql);

        pstmt.setInt(1, pedido.getCliente().getCodigo());
        pstmt.setDouble(2, pedido.getValorTotal());

        pstmt.executeUpdate();

    }

    @Override
    public void Deletar(int codigo) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "delete from pedido "
                + "where cod_ped=?";
        pstmt = connect.prepareStatement(sql);
        pstmt.setInt(1, codigo);
        pstmt.executeUpdate();

    }

    @Override
    public void Atualizar(Pedido pedido) throws Exception, SQLException {

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "update pedido set "
                + "cod_cliente=?,"
                + "valortot_ped=?"
                + "where cod_ped=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setInt(1, pedido.getCliente().getCodigo());
        pstmt.setDouble(2, pedido.getValorTotal());

        pstmt.setInt(3, pedido.getNumero());

        pstmt.executeUpdate();

    }

    @Override
    public List<Pedido> Listar() throws Exception, SQLException {
        List<Pedido> pedidoList = new ArrayList<>();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from pedido";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Pedido pedido = new Pedido();

            pedido.setNumero(resul.getInt("num_ped"));
            ClienteDao clienteDAO = new ClienteDao();
            pedido.setCliente(clienteDAO.ConsultarPorCodigo(resul.getInt("cod_cli")));
            pedido.setValorTotal(Double.parseDouble(resul.getString("valortot_ped")));

            pedidoList.add(pedido);
        }

        return pedidoList;

    }

    @Override
    public Pedido ConsultarPorCodigo(int codigo) throws Exception, SQLException {

        Pedido pedido = new Pedido();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from pedido"
                + " where num_ped=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setInt(1, codigo);
        resul = pstmt.executeQuery();

        if (resul.next()) {

            pedido.setNumero(resul.getInt("num_ped"));
            ClienteDao clienteDAO = new ClienteDao();
            pedido.setCliente(clienteDAO.ConsultarPorCodigo(resul.getInt("cod_cli")));
            pedido.setValorTotal(Double.parseDouble(resul.getString("valortot_ped")));
        }

        return pedido;

    }

    public Iterator<Pedido> ListarIterator() throws Exception {
        List<Pedido> pedidoList = new ArrayList();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from pedido";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            Pedido pedido = new Pedido();

            pedido.setNumero(resul.getInt("num_ped"));
            ClienteDao clienteDAO = new ClienteDao();
            pedido.setCliente(clienteDAO.ConsultarPorCodigo(resul.getInt("cod_cli")));
            pedido.setValorTotal(Double.parseDouble(resul.getString("valortot_ped")));

            pedidoList.add(pedido);
        }
        return pedidoList.iterator();
    }
}
