/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author vinicius caetano
 */
public class FabricadeConexao implements Serializable {

    private static Connection connection;

    private static final long serialVersionUID = 1L;
    private static String user = "postgres";
    private static String password = "root";
    private static String url = "jdbc:postgresql://localhost:5432/livrariatreebu";
    private static String driver = "org.postgresql.Driver";

    private static FabricadeConexao instancia;

    public static synchronized FabricadeConexao getInstancia() {
        if (instancia == null) {
            instancia = new FabricadeConexao();
        }
        return instancia;
    }

    public Connection getConexao() throws Exception {
        Class.forName(driver);
        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public static void destroy() {
        try {
            connection = null;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
