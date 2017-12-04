/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.intelligence;

import br.com.treebu.model.PesquisaSI;
import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

/**
 *
 * @author vinicius caetano
 */
@Rule(name = "Define inficacao do Genero Literario", description = "regra para definir se o perfil para o genero auto ajuda")
public class IndicacaoTrue {
    
     private PesquisaSI pesquisasi;
    private String AutoAjuda;
    
    @Condition
     public boolean when() {
        if (pesquisasi.isHerois()) { //true
            if (pesquisasi.isConfianca()) {// true
                if (pesquisasi.isAmor()) { //true
                    if (pesquisasi.isComida()) { //true
                        if (pesquisasi.isMedo()) { //true
                            if (pesquisasi.isDeus()) { //true
                                if (pesquisasi.isImaginario()) { //true
                                    if (pesquisasi.isDesenho()) { //true
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Action(order = 1)
    public void primeiraReacao() throws Exception {
        System.out.println("Pela a forma que foi realizada a pesquisa o Leitor  gosta de todas opções ... Nao e destinada a indicação, porem podera acessar o Ecommerce e ser feliz, comprar de qualquer Genero");
    }

    public void setPesquisasi(PesquisaSI pesquisasi) {
        this.pesquisasi = pesquisasi;
    }
    
    
}
