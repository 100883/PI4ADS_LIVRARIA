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
public class PesquisaSI {
    
    private int codigo;
    private boolean herois;
    private boolean confianca;
    private boolean amor;
    private boolean comida;
    private boolean medo;
    private boolean deus;
    private boolean imaginario;
    private boolean desenho;

    public PesquisaSI() {
    }

    public PesquisaSI(boolean herois, boolean confianca, boolean amor, boolean comida, boolean medo, boolean deus, boolean imaginario, boolean desenho) {
        this.herois = herois;
        this.confianca = confianca;
        this.amor = amor;
        this.comida = comida;
        this.medo = medo;
        this.deus = deus;
        this.imaginario = imaginario;
        this.desenho = desenho;
    }
    
    

    public PesquisaSI(int codigo, boolean herois, boolean confianca, boolean amor, boolean comida, boolean medo, boolean deus, boolean imaginario, boolean desenho) {
        this.codigo = codigo;
        this.herois = herois;
        this.confianca = confianca;
        this.amor = amor;
        this.comida = comida;
        this.medo = medo;
        this.deus = deus;
        this.imaginario = imaginario;
        this.desenho = desenho;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isHerois() {
        return herois;
    }

    public void setHerois(boolean herois) {
        this.herois = herois;
    }

    public boolean isConfianca() {
        return confianca;
    }

    public void setConfianca(boolean confianca) {
        this.confianca = confianca;
    }

    public boolean isAmor() {
        return amor;
    }

    public void setAmor(boolean amor) {
        this.amor = amor;
    }

    public boolean isComida() {
        return comida;
    }

    public void setComida(boolean comida) {
        this.comida = comida;
    }

    public boolean isMedo() {
        return medo;
    }

    public void setMedo(boolean medo) {
        this.medo = medo;
    }

    public boolean isDeus() {
        return deus;
    }

    public void setDeus(boolean deus) {
        this.deus = deus;
    }

    public boolean isImaginario() {
        return imaginario;
    }

    public void setImaginario(boolean imaginario) {
        this.imaginario = imaginario;
    }

    public boolean isDesenho() {
        return desenho;
    }

    public void setDesenho(boolean desenho) {
        this.desenho = desenho;
    }

    @Override
    public String toString() {
        return "PesquisaSI{" + "codigo=" + codigo + ", herois=" + herois + ", confianca=" + confianca + ", amor=" + amor + ", comida=" + comida + ", medo=" + medo + ", deus=" + deus + ", imaginario=" + imaginario + ", desenho=" + desenho + '}';
    }

    
    
    
}
