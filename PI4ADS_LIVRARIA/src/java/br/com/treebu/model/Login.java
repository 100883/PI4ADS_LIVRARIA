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
public class Login {
    
     //Atributos
    
    private int codigo;
    private String email;
    private String senha;
    private Date dataAutenticacao;
    
    //Construtores
    
    public Login() {
    }

    //Para  teste JUnit
    public Login(String email, String senha, Date dataAutenticacao) {
        this.email = email;
        this.senha = senha;
        this.dataAutenticacao = dataAutenticacao;
    }
    
    

    public Login(int codigo, String email, String senha, Date dataAutenticacao) {
        this.codigo = codigo;
        this.email = email;
        this.senha = senha;
       this.dataAutenticacao = dataAutenticacao;
    }
    
    //Getters e Setters
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataAutenticacao() {
        return dataAutenticacao;
    }

    public void setDataAutenticacao(Date dataAutenticacao) {
        this.dataAutenticacao = dataAutenticacao;
    }
    //toString
    
    
  
    
    //Metodos

    @Override
    public String toString() {
        return "Login{" + "codigo=" + codigo + ", email=" + email + ", senha=" + senha + ", dataAutenticacao=" + dataAutenticacao + '}';
    }
    
}
