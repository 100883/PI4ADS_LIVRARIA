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
public class Funcionario {

    //Atributos
    private int codigo;
    private String email;
    private String senha;
    private String nome;
    private String telefone;
    private String cpf;
    private Date DataNascimento;
    private Date dataAdmissao;
    private String ctps;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    //Construtores
    public Funcionario() {
    }
    
    //Para  teste JUnit
    public Funcionario(String email, String senha, String nome, String telefone, String cpf, Date DataNascimento, Date dataAdmissao, String ctps, String logradouro, String complemento, String bairro, String cidade, String estado, String cep) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.DataNascimento = DataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.ctps = ctps;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    
    

    public Funcionario(int codigo, String email, String senha, String nome, String telefone, String cpf, Date DataNascimento, Date dataAdmissao, String ctps, String logradouro, String complemento, String bairro, String cidade, String estado, String cep) {
        this.codigo = codigo;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.DataNascimento = DataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.ctps = ctps;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    Funcionario(String nome) {
        this.nome = nome;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    //toString  
    @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + codigo
                + ", email=" + email
                + ", senha=" + senha
                + ", nome=" + nome
                + ", telefone=" + telefone
                + ", cpf=" + cpf
                + ", DataNascimento=" + DataNascimento
                + ", dataAdmissao=" + dataAdmissao
                + ", ctps=" + ctps
                + ", logradouro=" + logradouro
                + ", complemento=" + complemento
                + ", bairro=" + bairro
                + ", cidade=" + cidade
                + ", estado=" + estado
                + ", cep=" + cep + '}';
    }

    //Metodos
}
