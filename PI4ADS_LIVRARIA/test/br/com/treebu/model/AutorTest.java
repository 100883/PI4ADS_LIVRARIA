/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.model;

import br.com.treebu.dao.AutorDao;
import java.sql.Date;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinicius caetano
 */
public class AutorTest {
    
    public AutorTest() {
    }

    /**
     * Test of getCodigo method, of class Autor.
     * @throws java.sql.SQLException
     */
    
    @Test(expected = SQLException.class )
    public void casoDeTest1_ExcederCampoNome() throws SQLException, Exception{
        System.out.println("Exceder campo nome autor com (51 caracteres)");
        
        Autor autor = new Autor("Terroracaocomediiopoooooooooooooooooooooooooooooooo", "comediakkkkk");
        AutorDao pers = new AutorDao();
        
        pers.Cadastrar(autor);
        
        fail("Era experada uma excessão do BD!!Teste falhou");
        
    }
    
    /**
     *
     * @throws SQLException
     * @throws Exception
     */
    @Test(expected = SQLException.class )
    public void casoDeTest3_DataDeNascimentoInvalida() throws SQLException, Exception{
        System.out.println("Campo data de nascimento autor com data invalida(30/02/1998)");
        
        Autor autor = new Autor("teste", "brasileiro", new Date(30/02/1998), true, "nada");
        AutorDao pers = new AutorDao();
        
        pers.Cadastrar(autor);
        
        fail("Era experada uma excessão do BD!!Teste falhou");
        
    }
    
    @Test(expected = SQLException.class )
    public void casoDeTest4_DataDeNascimentoInvalida() throws SQLException, Exception{
        System.out.println("Campo data de nascimento autor com data invalida(30/13/1998)");
        
        Autor autor = new Autor("teste", "brasileiro", new Date(30/13/1998), true, "nada");
        AutorDao pers = new AutorDao();
        
        pers.Cadastrar(autor);
        
        fail("Era experada uma excessão do BD!!Teste falhou");
        
    }
    
    @Test(expected = SQLException.class )
    public void casoDeTest9_ExederCampoNacionalidade() throws SQLException, Exception{
        System.out.println("Exceder campo nacionalidade autor com (31 caracteres)");
        
        Autor autor = new Autor("Teste", "Terroracaocomediiopoooooooooooo", "teste");
        AutorDao pers = new AutorDao();
        
        pers.Cadastrar(autor);
        
        fail("Era experada uma excessão do BD!!Teste falhou");
        
    }
    
    @Test(expected = SQLException.class )
    public void casoDeTest10_ExederCampoDescrição() throws SQLException, Exception{
        System.out.println("Exceder campo descrição autor com (501 caracteres)");
        
        Autor autor = new Autor("teste", "Terroracaocomediiopooooooooooooooooooooo"
                + "oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooTerror"
                + "acaocomediiopooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"
                + "oooooooooooooooooooooooooooTerroracaocomediiopooooooooooooooooooooooooooooo"
                + "oooooooooooooooooooooooooooooooooooooooooooooooooooooooooTerroracaocomedi"
                + "iopoooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"
                + "ooooooooooooooooTerroracaocomediiopoooooooooooooooooooooooooooTerroracaocomediiopoooooooooooooooo");
        AutorDao pers = new AutorDao();
        
        pers.Cadastrar(autor);
        
        fail("Era experada uma excessão do BD!!Teste falhou");
        
    }
    
}
