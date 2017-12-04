/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.decorator;

/**
 *
 * @author vinicius caetano
 */
public class ACoisa extends Produto {
    
     private Produto livro;
    public ACoisa(Produto carrinho){
        this.livro = carrinho;
    }
    @Override
    public String getDescricao(){
        return livro.getDescricao() + ", A Coisa";
    }
    @Override
    public double preco(){
        return 48.99 + livro.preco();
    }
    
}
