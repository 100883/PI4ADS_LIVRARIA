/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author vinicius caetano
 */
public class FormatData {
    
     public static void  main(String[] args){
        
        FormatData fomrt = new FormatData();
        
        String data = "25/12/2007";
        String data1 = "12/25/2007";
        
        data = FormatData.formatDateJdbc(data);
        
        data1 = FormatData.formatDateUser(data1);
        
        System.out.println("Formato Banco " + data);
        
        System.out.println("Formato Usuario " + data);
        
    }
    
    public static String formatDateJdbc(String data){
        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
        Date d1 = null;
        try {
            d1 = f.parse(data);            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        
        data = format.format(d1);
        
        return data;        
       
    }
    
    
    public static String formatDateUser(String data){
        SimpleDateFormat f = new SimpleDateFormat("yyyy-mm-dd");
        Date d1 = null;
        try {
            d1 = f.parse(data);            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        
        data = format.format(d1);
        
        return data;       
        
    }
    
    
}
