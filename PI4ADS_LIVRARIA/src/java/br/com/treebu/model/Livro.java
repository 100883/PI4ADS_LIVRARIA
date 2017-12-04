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
public class Livro {

    //Atributos
    private int codigo;
    private Editora editora;
    private Autor autor;
    private Genero genero;
    private Idioma idioma;
    private Date dataPublicacao;
    private String nome;
    private String descricao;
    private int numeroPaginas;
    private int ano;
    private Double preco;
    private String isbn;
    private String capa;
    private int qtd_livro;

    //Construtores
    public Livro() {}

    
    //Para  teste JUnit
    public Livro(Editora editora, Autor autor, Genero genero, Idioma idioma, Date dataPublicacao, String nome, String descricao, int numeroPaginas, int ano, Double preco, String isbn, String capa, int qtd_livro) {
        this.editora = editora;
        this.autor = autor;
        this.genero = genero;
        this.idioma = idioma;
        this.dataPublicacao = dataPublicacao;
        this.nome = nome;
        this.descricao = descricao;
        this.numeroPaginas = numeroPaginas;
        this.ano = ano;
        this.preco = preco;
        this.isbn = isbn;
        this.capa = capa;
        this.qtd_livro = qtd_livro;
    }

    public Livro(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    
    
   
    public Livro(int codigo, Editora editora, Autor autor, Genero genero, Idioma idioma, Date dataPublicacao, String nome, String descricao, int numeroPaginas, int ano, Double preco, String isbn, String capa, int qtd_livro) {
        this.codigo = codigo;
        this.editora = editora;
        this.autor = autor;
        this.genero = genero;
        this.idioma = idioma;
        this.dataPublicacao = dataPublicacao;
        this.nome = nome;
        this.descricao = descricao;
        this.numeroPaginas = numeroPaginas;
        this.ano = ano;
        this.preco = preco;
        this.isbn = isbn;
        this.capa = capa;
        this.qtd_livro = qtd_livro;
    }

    //Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
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

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public int getQtd_livro() {
        return qtd_livro;
    }

    public void setQtd_livro(int qtd_livro) {
        this.qtd_livro = qtd_livro;
    }

    //toString  
    @Override
    public String toString() {
        return "Livro{" + "codigo=" + codigo
                + ", editora=" + editora
                + ", autor=" + autor
                + ", genero=" + genero
                + ", idioma=" + idioma
                + ", dataPublicacao=" + dataPublicacao
                + ", nome=" + nome
                + ", descricao=" + descricao
                + ", numeroPaginas=" + numeroPaginas
                + ", ano=" + ano
                + ", preco=" + preco
                + ", isbn=" + isbn
                + ", capa=" + capa
                + ", qtd_livro=" + qtd_livro + '}';
    }

    //Metodos 
}
