/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.model;

import java.util.Date;

/**
 *
 * @author vinicius caetano
 */
public class PagamentoCartao {

    //Atributos
    private int codigo;
    private String nomeTitular;
    private Long numerosCartao;
    private Date dataValidade;
    private int codSeguranca;
    private int qtdParcelas;

    //Construtores
    public PagamentoCartao() {
    }

    //Para  teste JUnit
    public PagamentoCartao(String nomeTitular, Long numerosCartao, Date dataValidade, int codSeguranca, int qtdParcelas) {
        this.nomeTitular = nomeTitular;
        this.numerosCartao = numerosCartao;
        this.dataValidade = dataValidade;
        this.codSeguranca = codSeguranca;
        this.qtdParcelas = qtdParcelas;
    }
     //Para  teste JUnit
      public PagamentoCartao(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
    
    
    

    public PagamentoCartao(int codigo, String nomeTitular, Long numerosCartao, Date dataValidade, int codSeguranca, int qtdParcelas) {
        this.codigo = codigo;
        this.nomeTitular = nomeTitular;
        this.numerosCartao = numerosCartao;
        this.dataValidade = dataValidade;
        this.codSeguranca = codSeguranca;
        this.qtdParcelas = qtdParcelas;
    }

    //Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Long getNumerosCartao() {
        return numerosCartao;
    }

    public void setNumerosCartao(Long numerosCartao) {
        this.numerosCartao = numerosCartao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(int codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    //toString
    @Override
    public String toString() {
        return "PagamentoCartao{" + "codigo=" + codigo
                + ", nomeTitular=" + nomeTitular
                + ", numerosCartao=" + numerosCartao
                + ", dataValidade=" + dataValidade
                + ", codSeguranca=" + codSeguranca
                + ", qtdParcelas=" + qtdParcelas + '}';
    }

    //Metodos
}
