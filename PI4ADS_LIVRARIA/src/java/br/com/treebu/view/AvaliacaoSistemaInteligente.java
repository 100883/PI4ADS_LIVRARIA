/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.view;

import br.com.treebu.intelligence.IndicaAutoAjuda;
import br.com.treebu.intelligence.IndicaFiccao;
import br.com.treebu.intelligence.IndicaGastronomia;
import br.com.treebu.intelligence.IndicaHQs;
import br.com.treebu.intelligence.IndicaInfantil;
import br.com.treebu.intelligence.IndicaReligioso;
import br.com.treebu.intelligence.IndicaRomance;
import br.com.treebu.intelligence.IndicaSuspense;
import br.com.treebu.model.PesquisaSI;
import org.easyrules.api.RulesEngine;
import static org.easyrules.core.RulesEngineBuilder.aNewRulesEngine;

/**
 *
 * @author vinicius caetano
 */
public class AvaliacaoSistemaInteligente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("************Inicio da Avaliação*******************");

        IndicaAutoAjuda autoajuda = new IndicaAutoAjuda();
        
        IndicaFiccao ficcao = new IndicaFiccao();
        
        IndicaGastronomia gastronomia = new IndicaGastronomia();
        
        IndicaHQs hqs = new IndicaHQs();
        
        IndicaInfantil infantil = new IndicaInfantil();
        
        IndicaReligioso religioso = new IndicaReligioso();
        
        IndicaRomance romance = new IndicaRomance();
        
        IndicaSuspense suspense = new IndicaSuspense();

        //Simulação para IndicacaoTrue
      //   PesquisaSI pesquisasi = new PesquisaSI(true, true, true, true, true, true, true, true);
        //Simulação para IndicacaoFalse
        //  PesquisaSI pesquisasi = new PesquisaSI(false, false, false, false, false, false, false, false);
        //Simulação para HQs
       // PesquisaSI pesquisasi = new PesquisaSI(true, false, false, false, false, false, false, false);

        //Simulação para Auto Ajuda
       PesquisaSI pesquisasi = new PesquisaSI(false,true,false,false,false,false,false,false);
        //Simulação para Romance
      // PesquisaSI pesquisasi = new PesquisaSI(false,false,true,false,false,false,false,false);
        //Simulação para Suspense
        // PesquisaSI pesquisasi = new PesquisaSI(false, false, false, true, false, false, false, false);
        //Simulação para Relgioso
       //  PesquisaSI pesquisasi = new PesquisaSI(false, false, false, false, true, false, false, false);
        //Simulação para Ficcao
        // PesquisaSI pesquisasi = new PesquisaSI(false, false, false, false, false, false, true, false);
        //Simulação para Infantil
         //PesquisaSI pesquisasi = new PesquisaSI(false, false, false, false, false, false, false, true);
        
        
        autoajuda.setPesquisasi(pesquisasi);
        ficcao.setPesquisasi(pesquisasi);
        gastronomia.setPesquisasi(pesquisasi);
        hqs.setPesquisasi(pesquisasi);
        infantil.setPesquisasi(pesquisasi);
        religioso.setPesquisasi(pesquisasi);
        romance.setPesquisasi(pesquisasi);
        suspense.setPesquisasi(pesquisasi);

        RulesEngine mi = aNewRulesEngine().withSilentMode(true).build();

        mi.registerRule(autoajuda);
        mi.registerRule(ficcao);
        mi.registerRule(gastronomia);
        mi.registerRule(hqs);
        mi.registerRule(infantil);
        mi.registerRule(religioso);
        mi.registerRule(romance);
        mi.registerRule(suspense);

        mi.fireRules();

        System.out.println("****************Fim da Avaliaçao******************");
    }
}
