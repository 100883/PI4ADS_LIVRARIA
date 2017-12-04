/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author vinicius caetano
 * @param <T>
 */
public interface GenericDao <T> {
    
    void Cadastrar(T entidade) throws Exception,SQLException;

    void Deletar(int codigo) throws Exception,SQLException;

    void Atualizar(T entidade)throws Exception,SQLException;
    
    List<T> Listar() throws Exception,SQLException;

    T ConsultarPorCodigo(int codigo) throws Exception,SQLException;
    
}
