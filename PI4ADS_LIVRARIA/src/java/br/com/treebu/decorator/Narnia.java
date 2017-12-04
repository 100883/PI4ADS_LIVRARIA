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
public class Narnia  extends Produto {
    
    private Produto livro;
    public Narnia(Produto carrinho){
        this.livro = carrinho;
    }
    @Override
    public String getDescricao(){
        return livro.getDescricao() + ", As Crônicas de Nárnia. Brochura";
    }
    @Override
    public double preco(){
        return 28.69 + livro.preco();
    }
    
}
