/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.model;

import br.com.treebu.dao.IdiomaDao;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinicius caetano
 */
public class IdiomaTest {
    
    public IdiomaTest() {
    }

    /**
     * Test of getCodigo method, of class Idioma.
     * @throws java.sql.SQLException
     */
    
     @Test(expected = SQLException.class )
    public void casoDeTest1_ExcederCampoNome() throws SQLException, Exception{
        System.out.println("Exceder campo nome com (26 caracteres)");
        
        Idioma idi = new Idioma("era um garoto que como eu");
        IdiomaDao pers = new IdiomaDao();
        
        pers.Cadastrar(idi);
        
        fail("Era experada uma excess�o do BD!!Teste falhou");
        }
}
