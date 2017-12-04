/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.template;

/**
 *
 * @author vinicius caetano
 */
public class OrdenarDescricao extends GeneroDaoTemplate {
    
     public OrdenarDescricao(String nome) {
        super(nome);
    }
    @Override
    public  boolean ePrimeiro(GeneroTemplate info1, GeneroTemplate info2){
        if(info1.getDescricao().compareToIgnoreCase(info2.getDescricao()) <= 0) return true;
        else return false;
    }
    
}
