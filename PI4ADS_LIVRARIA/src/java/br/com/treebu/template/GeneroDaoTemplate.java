/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.template;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author vinicius caetano
 */
public abstract class GeneroDaoTemplate {

    private String Arquivo;

    public GeneroDaoTemplate(String nome) {
        Arquivo = nome;
    }

    public abstract boolean ePrimeiro(GeneroTemplate info1, GeneroTemplate info2);

    public Iterator<GeneroTemplate> listagem() throws Exception {
        try {
            final ArrayList<GeneroTemplate> ArrayGeneros = new ArrayList<>();
            FileReader fr = new FileReader(Arquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            int posicao = 0;
            while ((linha = br.readLine()) != null) {
                GeneroTemplate aux = new GeneroTemplate(linha);
                ArrayGeneros.add(aux);
                posicao++;
            }
            br.close();

            final int meio = ArrayGeneros.size() / 2;

            Thread thread_1 = new Thread() {
                @Override
                public void run() {
                    for (int i = 0; i < meio; i++) {
                        for (int j = i; j < ArrayGeneros.size(); j++) {

                            if (!ePrimeiro(ArrayGeneros.get(i), ArrayGeneros.get(j))) {
                                GeneroTemplate temp = ArrayGeneros.get(j);
                                ArrayGeneros.set(j, ArrayGeneros.get(i));
                                ArrayGeneros.set(i, temp);
                            }
                        }
                    }
                }
            };
            Thread thread_2 = new Thread() {
                @Override
                public void run() {
                    for (int i = meio + 1; i < ArrayGeneros.size(); i++) {
                        for (int j = i; j < ArrayGeneros.size(); j++) {

                            if (!ePrimeiro(ArrayGeneros.get(i), ArrayGeneros.get(j))) {
                                GeneroTemplate temp = ArrayGeneros.get(j);
                                ArrayGeneros.set(j, ArrayGeneros.get(i));
                                ArrayGeneros.set(i, temp);
                            }
                        }
                    }
                }
            };
            thread_1.start();
            thread_2.start();
            try {
                thread_1.join();
                thread_2.join();
            } catch (InterruptedException e) {
                System.out.println("Erro" + e.getMessage());
            }

            return ArrayGeneros.iterator();
        } catch (IOException erro) {
            System.out.println("Erro" + erro.getMessage());
            throw erro;
        }
    }

}
