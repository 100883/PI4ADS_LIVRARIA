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
public class Inferno extends Produto {
    
  private Produto livro;
    public Inferno(Produto carrinho){
        this.livro = carrinho;
    }
    @Override
    public String getDescricao(){
        return livro.getDescricao() + ", Inferno. Uma Nova Aventura de Robert Langdon";
    }
    @Override
    public double preco(){
        return 49.99 + livro.preco();
    }
    
    
}
