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
public class Pedido {
    
     //Atributos
    
    private int numero;
    private Cliente cliente;
    private Double valorTotal;
    
    
    //Construtores
    
    public Pedido() {
    }

    //Para  teste JUnit
    public Pedido(Cliente cliente, Double valorTotal) {
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }
    
    

    public Pedido(int numero, Cliente cliente, Double valorTotal) {
        this.numero = numero;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }
    
    //Getters e Setters
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numero=" + numero 
                + ", cliente=" + cliente 
                + ", valorTotal=" + valorTotal + '}';
    }
    
    //Metodos
    
}
