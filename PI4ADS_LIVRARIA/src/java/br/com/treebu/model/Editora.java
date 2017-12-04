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
public class Editora {

    //Atributos
    private int codigo;
    private String razaoSocial;
    private String cnpj;
    private String telefone;
    private String email;
    private String representante;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    //Construtores
    public Editora() {
    }

    public Editora(int codigo, String razaoSocial, String cnpj, String telefone, String email, String representante, String logradouro, String complemento, String bairro, String cidade, String estado, String cep) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.representante = representante;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    //Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
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
        return "Editora{" + "codigo=" + codigo
                + ", razaoSocial=" + razaoSocial
                + ", cnpj=" + cnpj
                + ", telefone=" + telefone
                + ", email=" + email
                + ", representante=" + representante
                + ", logradouro=" + logradouro
                + ", complemento=" + complemento
                + ", bairro=" + bairro
                + ", cidade=" + cidade
                + ", estado=" + estado
                + ", cep=" + cep + '}';
    }

    //Metodos
}
