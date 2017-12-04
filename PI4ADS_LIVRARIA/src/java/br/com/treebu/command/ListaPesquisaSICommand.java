/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.command;

import br.com.treebu.dao.PesquisaSIDao;
import br.com.treebu.model.PesquisaSI;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author vinicius caetano
 */
public class ListaPesquisaSICommand  implements Command{

    @Override
    public String execute(HttpServletRequest request) {
         
           PesquisaSI pesquisasi = new PesquisaSI();      
           PesquisaSIDao dao = new PesquisaSIDao();
           String acao = request.getParameter(InfoVariaveis.ACAO);
           String PAGINA = InfoPaginacao.PGLISTAPESQUISASI; 
           String codigo = (request.getParameter(InfoVariaveis.CODIGO));
           
        if (acao.equalsIgnoreCase("RemovePesquisaSI")) {
               try {
                   dao.Deletar(Integer.parseInt(codigo));
               } catch (Exception ex) {
                   Logger.getLogger(ListaPesquisaSICommand.class.getName()).log(Level.SEVERE, null, ex);
               }

        }
        else if (acao.equalsIgnoreCase("EditarPesquisaSI")) {
            
           pesquisasi.setCodigo(Integer.parseInt(codigo));
            Iterator pesq = dao.list(pesquisasi).iterator();
            request.setAttribute("pesquisasi", pesq .next());
            PAGINA =   InfoPaginacao.CADASTRO_PESQUISASI;
        }
        
        request.setAttribute("pesquisasi", dao.list(new PesquisaSI()).iterator());   
      
        return  PAGINA;
        
        
    }
    
}
