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
public abstract class Produto {

    String descricao = "Livro";

    public String getDescricao() {
        return descricao;
    }

    /**
     *
     * @return
     */
    public abstract double preco();

}
