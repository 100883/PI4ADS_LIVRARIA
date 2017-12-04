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
public class LivroDecorator extends Produto{
    
      public LivroDecorator(){
        descricao = "Livro";
    }
      @Override
    public double preco(){
        return 0.00;
    }
    
}
