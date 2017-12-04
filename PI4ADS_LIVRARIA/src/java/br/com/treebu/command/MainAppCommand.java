/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.command;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vinicius caetano
 */
public class MainAppCommand extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private Map<String, Command> comandos = new HashMap<>();
    private String action;
    private String next;

    @Override
    public void init() throws ServletException {

        // comandos que chaman as telas  vazia para nova acao 
        comandos.put("Principal", new PrincipalCommand());
        comandos.put("CadastrarPesquisaSI", new CadastrarPesquisaSICommand());
        comandos.put("SalvarPesquisaSI", new CadastrarPesquisaSICommand());
        comandos.put("RemovePesquisaSI", new ListaPesquisaSICommand());
        comandos.put("ListarPesquisaSI", new ListaPesquisaSICommand());

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        action = req.getParameter("action");

        Command command = isCommand(action);
        next = command.execute(req);
        req.getRequestDispatcher(next).forward(req, resp);

    }

    private Command isCommand(String action) {
        Command command = null;
        for (String key : comandos.keySet()) {
            if (key.equalsIgnoreCase(action)) {
                command = comandos.get(key);
            }

        }
        return command;
    }
}
