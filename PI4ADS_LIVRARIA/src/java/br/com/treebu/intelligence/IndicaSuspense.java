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
@Rule(name = "Define inficacao do Genero Literario", description = "regra para definir se o perfil para o genero Suspense")
public class IndicaSuspense {
    
     private PesquisaSI pesquisasi;
    private String Suspense;
    
    @Condition
     public boolean when() {
        if (!pesquisasi.isHerois()) { //false
            if (!pesquisasi.isConfianca()) {// false
                if (!pesquisasi.isAmor()) { //false
                    if (!pesquisasi.isComida()) { //false
                        if (pesquisasi.isMedo()) { //true
                            if (!pesquisasi.isDeus()) { //false
                                if (!pesquisasi.isImaginario()) { //false
                                    if (!pesquisasi.isDesenho()) { //false
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
        System.out.println("Indicação do Genero Literario é : Suspense");
    }

   public void setPesquisasi(PesquisaSI pesquisasi) {
        this.pesquisasi = pesquisasi;
    }
    
}
