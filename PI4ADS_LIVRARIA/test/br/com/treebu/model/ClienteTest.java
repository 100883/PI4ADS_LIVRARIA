/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.model;

import br.com.treebu.dao.ClienteDao;
import java.sql.Date;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinicius caetano
 */
public class ClienteTest {
    
    public ClienteTest() {
    }
    
    /**
     * Test of getCodigo method, of class Autor.
     * @throws java.sql.SQLException
     */
    
   @Test(expected = SQLException.class)
    public void casoDeTest1_ExcederCampoNome() throws SQLException, Exception {
        System.out.println("Exceder campo nome cliente com (51 caracteres)");
        Cliente cliente = new Cliente("email", "senha", "nomenomenomenomenomenomenomenomenomenomenomenomenom", "telefone", "cpf", new Date(20 / 02 / 1998), new Date(20 / 02 / 1998), "logradouro", "complemento", "bairro", "cidade", "estado", "cep");

        ClienteDao pers = new ClienteDao();

        pers.Cadastrar(cliente);

        fail("Era experada uma excessão do BD!!Teste falhou");

    }

    @Test(expected = SQLException.class)
    public void casoDeTest2_ExcederCampoEmail() throws SQLException, Exception {
        System.out.println("Exceder campo email cliente com (31 caracteres)");
        Cliente cliente = new Cliente("emailemailemailemailemailemaill", "senha", "nome", "telefone", "cpf", new Date(20 / 02 / 1998), new Date(20 / 02 / 1998), "logradouro", "complemento", "bairro", "cidade", "estado", "cep");

        ClienteDao pers = new ClienteDao();

        pers.Cadastrar(cliente);

        fail("Era experada uma excessão do BD!!Teste falhou");

    }

    @Test(expected = SQLException.class)
    public void casoDeTest3_ExcederDataNascimento() throws SQLException, Exception {
        System.out.println("Campo data de nascimento cliente com data invalida(30/02/1998))");

        Cliente cliente = new Cliente("email", "senha", "nome", "telefone", "cpf", new Date(30 / 02 / 1998), new Date(20 / 02 / 1998), "logradouro", "complemento", "bairro", "cidade", "estado", "cep");

        ClienteDao pers = new ClienteDao();

        pers.Cadastrar(cliente);

        fail("Era experada uma excessão do BD!!Teste falhou");

    }

    @Test(expected = SQLException.class)
    public void casoDeTest4_DataNascimentoInvalida() throws SQLException, Exception {
        System.out.println("Campo data de nascimento cliente com data invalida(30/13/1998))");

        Cliente cliente = new Cliente("email", "senha", "nome", "telefone", "cpf", new Date(30 / 13/ 1998), new Date(20 / 02 / 1998), "logradouro", "complemento", "bairro", "cidade", "estado", "cep");

        ClienteDao pers = new ClienteDao();

        pers.Cadastrar(cliente);

        fail("Era experada uma excessão do BD!!Teste falhou");

    }

    @Test(expected = SQLException.class)
    public void casoDeTest12_ExcederCampoSenha() throws SQLException, Exception {
        System.out.println("Exceder campo senha cliente com (17 caracteres)");

        Cliente cliente = new Cliente("email", "40021Sheadpoeijgd", "nome", "telefone", "cpf", new Date(20 / 02 / 1998), new Date(20 / 02 / 1998), "logradouro", "complemento", "bairro", "cidade", "estado", "cep");

        ClienteDao pers = new ClienteDao();

        pers.Cadastrar(cliente);

        fail("Era experada uma excessão do BD!!Teste falhou");

    }
    
}
