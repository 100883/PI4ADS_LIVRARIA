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
public class Genero {

    //Atributos
    private int codigo;
    private String nome;
    private String descricao;

    //Construtores
    public Genero() {
    }

    //Para  teste JUnit
    public Genero(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Genero(int codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
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

    public void setNome(String genero) {
        this.nome = genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

//toString
    @Override
    public String toString() {
        return "Genero{" + "codigo=" + codigo
                + ", nome=" + nome
                + ", descricao=" + descricao + '}';
    }

    //Metodos
}
