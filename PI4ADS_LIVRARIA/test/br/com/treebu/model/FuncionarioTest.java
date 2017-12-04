/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.model;

import br.com.treebu.dao.FuncionarioDao;
import java.sql.Date;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinicius caetano
 */
public class FuncionarioTest {
    
    public FuncionarioTest() {
    }

    /**
     * Test of getCodigo method, of class Funcionario.
     * @throws java.sql.SQLException
     */
    
    @Test(expected = SQLException.class )
    public void casoDeTest1_ExcederCampoNome() throws SQLException, Exception{
        System.out.println("Exceder campo nome funcionario com (51 caracteres)");
        
        Funcionario funcionario = new Funcionario("email", "senha", "Terroracaocomediiopoooooooooooooooooooooooooooooooo", "telefone", "cpf", new Date(20/02/1998), 
                new Date(20/02/1998), "ctps", "logradouro", "complemento", "bairro", "cidade", "estado", "cep");
        FuncionarioDao pers = new FuncionarioDao();
        
        pers.Cadastrar(funcionario);
        
        fail("Era experada uma excessão do BD!!Teste falhou");
        
    }
    
    @Test(expected = SQLException.class )
    public void casoDeTest2_ExcederCampoEmail() throws SQLException, Exception{
        System.out.println("Exceder campo email funcionario com (31 caracteres)");
        
        Funcionario funcionario = new Funcionario("Terroracaocomediiopoooooooooooo", "senha", "Terroracaocomediiopooooooooo", "telefone", "cpf", new Date(20/02/1998), 
                new Date(20/02/1998), "ctps", "logradouro", "complemento", "bairro", "cidade", "estado", "cep");
        FuncionarioDao pers = new FuncionarioDao();
        
        pers.Cadastrar(funcionario);
        
        fail("Era experada uma excessão do BD!!Teste falhou");
        
    }
    
    @Test(expected = SQLException.class )
    public void casoDeTest3_DataNascimentoInvalida() throws SQLException, Exception{
        System.out.println("Campo data de nascimento funcionario com data invalida(30/02/1998))");
        
        Funcionario funcionario = new Funcionario("Terroracaocomediiopooooooo", "senha", "Terroracaocomediiopoooo", "telefone", "cpf", new Date(20/02/1998), 
                new Date(30/02/1998), "ctps", "logradouro", "complemento", "bairro", "cidade", "estado", "cep");
        FuncionarioDao pers = new FuncionarioDao();
        
        pers.Cadastrar(funcionario);
        
        fail("Era experada uma excessão do BD!!Teste falhou");
        
    }
    
    @Test(expected = SQLException.class )
    public void casoDeTest4_DataNascimentoInvalida() throws SQLException, Exception{
        System.out.println("Campo data de nascimento funcionario com data invalida(30/13/1998))");
        
        Funcionario funcionario = new Funcionario("Terroracaocomediiopooooooo", "senha", "Terroracaocomediiopoooo", "telefone", "cpf", new Date(20/02/1998), 
                new Date(30/13/1998), "ctps", "logradouro", "complemento", "bairro", "cidade", "estado", "cep");
        FuncionarioDao pers = new FuncionarioDao();
        
        pers.Cadastrar(funcionario);
        
        fail("Era experada uma excessão do BD!!Teste falhou");
        
    }
    
     @Test(expected = SQLException.class )
    public void casoDeTest12_ExcederCampoSenha() throws SQLException, Exception{
        System.out.println("Exceder campo senha funcionario com (17 caracteres)");
        
        Funcionario funcionario = new Funcionario("Terroracaocomediiopooooooooo", "40021Sheadpoeijgd", "Terroracmediiopooooooooo", "telefone", "cpf", new Date(20/02/1998), 
                new Date(20/02/1998), "ctps", "logradouro", "complemento", "bairro", "cidade", "estado", "cep");
        FuncionarioDao pers = new FuncionarioDao();
        
        pers.Cadastrar(funcionario);
        
        fail("Era experada uma excessão do BD!!Teste falhou");
        
    }
}
