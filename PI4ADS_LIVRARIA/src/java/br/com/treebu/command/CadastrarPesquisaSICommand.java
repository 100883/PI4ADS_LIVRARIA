/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.command;

import br.com.treebu.dao.PesquisaSIDao;
import br.com.treebu.model.PesquisaSI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author vinicius caetano
 */
public class CadastrarPesquisaSICommand implements Command {

    @Override
    public String execute(HttpServletRequest request) {
       
        String PAGINA = InfoPaginacao.CADASTRO_PESQUISASI;
        String codigo = request.getParameter(InfoVariaveis.CODIGO);  
        String acao = request.getParameter(InfoVariaveis.ACAO);
       
        
       
        if(acao.equals("SalvarPesquisaSI")){
            
            
            try {
                PesquisaSIDao dao = new PesquisaSIDao();
                PesquisaSI pesquisasi = new PesquisaSI();
                
                //Herois
                boolean herois;
                String status = request.getParameter(InfoVariaveis.HEROIS);
                if (status.equals("s")) {
                    herois = true;
                } else {
                    herois = false;
                }
                pesquisasi.setHerois(herois);
                
                //CONFIANCA
                boolean conf;
                String confianca = request.getParameter(InfoVariaveis.CONFIANCA);
                if (confianca.equals("s")) {
                    conf = true;
                } else {
                    conf = false;
                }
                pesquisasi.setConfianca(conf);
                
                //AMOR
                boolean amor;
                String status2 = request.getParameter(InfoVariaveis.AMOR);
                if (status2.equals("s")) {
                    amor = true;
                } else {
                    amor = false;
                }
                pesquisasi.setAmor(amor);
                
                //COMIDA
                boolean comida;
                String status3 = request.getParameter(InfoVariaveis.COMIDA);
                if (status3.equals("s")) {
                    comida = true;
                } else {
                    comida = false;
                }
                pesquisasi.setComida(comida);
                
                //MEDO
                boolean medo;
                String status4 = request.getParameter(InfoVariaveis.MEDO);
                if (status4.equals("s")) {
                    medo = true;
                } else {
                    medo = false;
                }
                pesquisasi.setMedo(medo);
                
                
                //DEUS
                boolean deus;
                String status5 = request.getParameter(InfoVariaveis.DEUS);
                if (status5.equals("s")) {
                    deus = true;
                } else {
                    deus = false;
                }
                pesquisasi.setDeus(deus);
                
                //IMAGINARIO
                boolean imaginario;
                String status6 = request.getParameter(InfoVariaveis.IMAGINARIO);
                if (status6.equals("s")) {
                    imaginario = true;
                } else {
                    imaginario = false;
                }
                pesquisasi.setImaginario(imaginario);
                
                //DESENHO
                boolean desenho;
                String status7 = request.getParameter(InfoVariaveis.DESENHO);
                if (status7.equals("s")) {
                    desenho = true;
                } else {
                    desenho = false;
                }
                pesquisasi.setDesenho(desenho);
                
                
                
                
                if(request.getParameter("codigo").equalsIgnoreCase("")) {
                    
                    try {
                        dao.Cadastrar(pesquisasi);
                    } catch (Exception ex) {
                        Logger.getLogger(CadastrarPesquisaSICommand.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    
                    try {
                        pesquisasi.setCodigo(Integer.parseInt(codigo));
                        dao.Atualizar(pesquisasi);
                    } catch (Exception ex) {
                        Logger.getLogger(CadastrarPesquisaSICommand.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                request.setAttribute("pesquisasi", new PesquisaSIDao().Listar());
                PAGINA =  InfoPaginacao.PGLISTAPESQUISASI;
            } catch (Exception ex) {
                Logger.getLogger(CadastrarPesquisaSICommand.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         
        return PAGINA;
    }
}
