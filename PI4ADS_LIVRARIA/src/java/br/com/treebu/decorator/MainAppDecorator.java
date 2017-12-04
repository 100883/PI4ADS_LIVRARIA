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
public class MainAppDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Produto carrinho = new LivroDecorator();
        System.out.println("-------------------------------------------------");
        System.out.println("Livro:   "+ carrinho.getDescricao());
        System.out.println("Preco:  " + carrinho.preco());
        System.out.println("-------------------------------------------------");
        
        carrinho = new ACoisa(carrinho);
        System.out.println("Livro:   "+ carrinho.getDescricao());
        System.out.println("Preco:  " + carrinho.preco());
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        
        carrinho = new Cemiterio(carrinho);
        System.out.println("Livro:   "+ carrinho.getDescricao());
        System.out.println("Preco:  " + carrinho.preco());
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        
        carrinho = new Inferno(carrinho);
        System.out.println("Livro:   "+ carrinho.getDescricao());
        System.out.println("Preco:  " + carrinho.preco());
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        
        carrinho = new Narnia(carrinho);
        System.out.println("Livro:   "+ carrinho.getDescricao());
        System.out.println("Preco:  " + carrinho.preco());
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        
        carrinho = new LanternaVerde(carrinho);
        System.out.println("Livro:   "+ carrinho.getDescricao());
        System.out.println("Preco:  " + carrinho.preco());
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        
    }
    
}
