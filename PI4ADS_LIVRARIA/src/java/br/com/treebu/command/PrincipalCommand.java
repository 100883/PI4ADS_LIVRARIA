/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.command;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author vinicius caetano
 */
public class PrincipalCommand implements Command {

    @Override
    public String execute(HttpServletRequest request) {
        return InfoPaginacao.Home;
    }
    
}
