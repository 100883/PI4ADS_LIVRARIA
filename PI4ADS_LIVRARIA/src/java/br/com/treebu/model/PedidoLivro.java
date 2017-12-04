/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.model;

/**
 *
 * @author vinicius caetano
 */
public class PedidoLivro {
    
     //Atributos
    
    private Pedido pedido;
    private Livro livro;
    private int quantidadeLivro;
    private Double valorUnitario;
    
    //Construtores
    
     public PedidoLivro() {
    }

     //Para  teste JUnit
    public PedidoLivro(Livro livro, int quantidadeLivro, Double valorUnitario) {
        this.livro = livro;
        this.quantidadeLivro = quantidadeLivro;
        this.valorUnitario = valorUnitario;
    }
     
     

    public PedidoLivro(Pedido pedido, Livro livro, int quantidadeLivro, Double valorUnitario) {
        this.pedido = pedido;
        this.livro = livro;
        this.quantidadeLivro = quantidadeLivro;
        this.valorUnitario = valorUnitario;
    }
    
    //Getters e Setters
    
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQuantidadeLivro() {
        return quantidadeLivro;
    }

    public void setQuantidadeLivro(int quantidadeLivro) {
        this.quantidadeLivro = quantidadeLivro;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    //toString
    @Override
    public String toString() {
        return "PedidoLivro{" + "pedido=" + pedido 
                + ", livro=" + livro 
                + ", quantidadeLivro=" + quantidadeLivro 
                + ", valorUnitario=" + valorUnitario + '}';
    }
    
    //Metodos
    
}
