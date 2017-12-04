/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.dao;

import br.com.treebu.model.PesquisaSI;
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
public class PesquisaSIDao implements GenericDao<PesquisaSI> {

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
    public void Cadastrar(PesquisaSI pesquisasi) throws Exception, SQLException {
        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "insert into pesquisasi "
                + "(herois,"
                + "confianca,"
                + "amor,"
                + "comida,"
                + "medo,"
                + "deus,"
                + "imaginario,"
                + "desenho) "
                + "values "
                + "(?,?,?,?,?,?,?,?)";
        pstmt = connect.prepareStatement(sql);

        pstmt.setBoolean(1, pesquisasi.isHerois());
        pstmt.setBoolean(2, pesquisasi.isConfianca());
        pstmt.setBoolean(3, pesquisasi.isAmor());
        pstmt.setBoolean(4, pesquisasi.isComida());
        pstmt.setBoolean(5, pesquisasi.isMedo());
        pstmt.setBoolean(6, pesquisasi.isDeus());
        pstmt.setBoolean(7, pesquisasi.isImaginario());
        pstmt.setBoolean(8, pesquisasi.isDesenho());

        pstmt.executeUpdate();
    }

    @Override
    public void Deletar(int codigo) throws Exception, SQLException {
        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "delete from pesquisasi "
                + "where cod_pes=?";
        pstmt = connect.prepareStatement(sql);
        pstmt.setInt(1, codigo);
        pstmt.executeUpdate();
    }

    @Override
    public void Atualizar(PesquisaSI pesquisasi) throws Exception, SQLException {
        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "update pesquisasi set "
                + "herois=?"
                + "confianca=?"
                + "amor=?"
                + "comida=?"
                + "medo=?"
                + "deus=?"
                + "imaginario=?"
                + "desenho=?"
                + "where cod_pes=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setBoolean(1, pesquisasi.isHerois());
        pstmt.setBoolean(2, pesquisasi.isConfianca());
        pstmt.setBoolean(3, pesquisasi.isAmor());
        pstmt.setBoolean(4, pesquisasi.isComida());
        pstmt.setBoolean(5, pesquisasi.isMedo());
        pstmt.setBoolean(6, pesquisasi.isDeus());
        pstmt.setBoolean(7, pesquisasi.isImaginario());
        pstmt.setBoolean(8, pesquisasi.isDesenho());

        pstmt.setInt(9, pesquisasi.getCodigo());

        pstmt.executeUpdate();
    }

    @Override
    public List<PesquisaSI> Listar() throws Exception, SQLException {
        List<PesquisaSI> pesquisaSIList = new ArrayList<>();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from pesquisasi";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            PesquisaSI pesquisasi = new PesquisaSI();

            pesquisasi.setCodigo(resul.getInt("cod_pes"));
            pesquisasi.setHerois(resul.getBoolean("herois"));
            pesquisasi.setHerois(resul.getBoolean("confianca"));
            pesquisasi.setHerois(resul.getBoolean("amor"));
            pesquisasi.setHerois(resul.getBoolean("comida"));
            pesquisasi.setHerois(resul.getBoolean("medo"));
            pesquisasi.setHerois(resul.getBoolean("deus"));
            pesquisasi.setHerois(resul.getBoolean("imaginario"));
            pesquisasi.setHerois(resul.getBoolean("desenho"));

            pesquisaSIList.add(pesquisasi);
        }
        return pesquisaSIList;
    }

    @Override
    public PesquisaSI ConsultarPorCodigo(int codigo) throws Exception, SQLException {
        PesquisaSI pesquisasi = new PesquisaSI();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from pesquisasi"
                + " where cod_pes=?";
        pstmt = connect.prepareStatement(sql);

        pstmt.setInt(1, codigo);
        resul = pstmt.executeQuery();

        if (resul.next()) {

            pesquisasi.setCodigo(resul.getInt("cod_pes"));
            pesquisasi.setHerois(resul.getBoolean("herois"));
            pesquisasi.setHerois(resul.getBoolean("confianca"));
            pesquisasi.setHerois(resul.getBoolean("amor"));
            pesquisasi.setHerois(resul.getBoolean("comida"));
            pesquisasi.setHerois(resul.getBoolean("medo"));
            pesquisasi.setHerois(resul.getBoolean("deus"));
            pesquisasi.setHerois(resul.getBoolean("imaginario"));
            pesquisasi.setHerois(resul.getBoolean("desenho"));
        }
        return pesquisasi;
    }

    public List<PesquisaSI> list(PesquisaSI obj) {
        List<PesquisaSI> list = new ArrayList<>();
        StringBuilder sql = new StringBuilder().append("select * from pesquisasi where 1=1 ");
        if (obj.getCodigo() != 0) {
            sql.append(" and codigo=" + obj.getCodigo());
        }
        try {
            connect = FabricadeConexao.getInstancia().getConexao();
            PreparedStatement statement = connect.prepareStatement(sql.toString());
            ResultSet set = statement.executeQuery();

            while (set.next()) {
                list.add(setRest(set));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void setStatement(PreparedStatement statement, PesquisaSI obj) {

        try {

            statement.setBoolean(1, obj.isHerois());
            statement.setBoolean(2, obj.isConfianca());
            statement.setBoolean(3, obj.isAmor());
            statement.setBoolean(4, obj.isComida());
            statement.setBoolean(5, obj.isMedo());
            statement.setBoolean(6, obj.isDeus());
            statement.setBoolean(7, obj.isImaginario());
            statement.setBoolean(8, obj.isDesenho());
            ;

            if (obj.getCodigo() != 0) {
                statement.setInt(9, obj.getCodigo());
            }
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public PesquisaSI setRest(ResultSet set) {
        PesquisaSI pesquisasi = new PesquisaSI();
        try {

            pesquisasi.setCodigo(set.getInt("codigo"));
            pesquisasi.setHerois(set.getBoolean("herois"));
            pesquisasi.setConfianca(set.getBoolean("confianca"));
            pesquisasi.setAmor(set.getBoolean("amor"));
            pesquisasi.setComida(set.getBoolean("comida"));
            pesquisasi.setMedo(set.getBoolean("medo"));
            pesquisasi.setDeus(set.getBoolean("deus"));
            pesquisasi.setImaginario(set.getBoolean("imaginario"));
            pesquisasi.setDesenho(set.getBoolean("desenho"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pesquisasi;
    }

    public Iterator<PesquisaSI> ListarIterator() throws Exception {
        List<PesquisaSI> pesquisaSIList = new ArrayList();

        connect = FabricadeConexao.getInstancia().getConexao();
        String sql = "select * from pesquisasi";
        stmt = connect.createStatement();
        resul = stmt.executeQuery(sql);

        while (resul.next()) {

            PesquisaSI pesquisasi = new PesquisaSI();

            pesquisasi.setCodigo(resul.getInt("cod_pes"));
            pesquisasi.setHerois(resul.getBoolean("herois"));
            pesquisasi.setHerois(resul.getBoolean("confianca"));
            pesquisasi.setHerois(resul.getBoolean("amor"));
            pesquisasi.setHerois(resul.getBoolean("comida"));
            pesquisasi.setHerois(resul.getBoolean("medo"));
            pesquisasi.setHerois(resul.getBoolean("deus"));
            pesquisasi.setHerois(resul.getBoolean("imaginario"));
            pesquisasi.setHerois(resul.getBoolean("desenho"));

            pesquisaSIList.add(pesquisasi);
        }
        return pesquisaSIList.iterator();
    }
}
