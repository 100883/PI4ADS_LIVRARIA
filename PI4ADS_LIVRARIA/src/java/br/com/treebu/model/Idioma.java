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
public class Idioma {
    
     //Atributos
      private int codigo;
      private String nome;
      
      
      //Teste Lista
       private Idioma proximo;
     
       public Idioma getProximo() {
        return proximo;
    }

    public void setProximo(Idioma proximo) {
        this.proximo = proximo;
    }
    
    //Construtores
      
       public Idioma() {}

       //Para  teste JUnit
    public Idioma(String nome) {
        this.nome = nome;
    }
       
       
       
       public Idioma(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
       
    
    //Getters e Setters
       
       public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //toString
    @Override
    public String toString() {
        return "Idioma{" + "codigo=" + codigo 
                + ", nome=" + nome + '}';
    }
    
    //Metodos

    
    
}
