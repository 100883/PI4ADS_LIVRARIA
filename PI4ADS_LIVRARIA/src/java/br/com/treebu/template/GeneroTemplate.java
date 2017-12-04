/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.template;

/**
 *
 * @author vinicius caetano
 */
public class GeneroTemplate {

    private int codigo;
    private String nome;
    private String descricao;

    public GeneroTemplate() {
    }

    public GeneroTemplate(int codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public GeneroTemplate(String str){
        String[] vetor = str.split(";");
        this.codigo = Integer.parseInt(vetor[0]);
        this.nome = vetor[1];
        this.descricao = vetor[2];
    }
    

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "GeneroTemplate{" + "codigo=" + codigo + ", nome=" + nome + ", descricao=" + descricao + '}';
    }

}
