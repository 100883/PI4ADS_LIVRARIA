/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.model;

import br.com.treebu.dao.GeneroDao;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinicius caetano
 */
public class GeneroTest {
    
    public GeneroTest() {
    }
 
    /**
     * Test of getCodigo method, of class Genero.
     * @throws java.sql.SQLException     
     */
    @Test(expected = SQLException.class )
    public void casoDeTest9_ExcederCampoNome() throws SQLException, Exception{
        System.out.println("Exceder campo nome genero com (36 caracteres)");
        
        Genero genero = new Genero("Terroracaocomediiopooooooooooooooooo", "descricao");
        GeneroDao pers = new GeneroDao();
        
        pers.Cadastrar(genero);
        
        fail("Era experada uma excessão do BD!!Teste falhou");
        
    }
    
    @Test(expected = SQLException.class )
    public void casoDeTest10_ExcederCampoDescricao() throws SQLException, Exception{
        System.out.println("Exceder campo Descrição genero com (51 caracteres)");
        
        Genero genero = new Genero("nome","dfsjhfjskfhjskfhjskdfhsjkfhsjkhdfsjkfhsjkfhksjfhsjk");
        GeneroDao pers = new GeneroDao();
        
        pers.Cadastrar(genero);
        
        fail("Era experada uma excessão do BD!!Teste falhou");
        
    }
    
}
