package br.com.treebu.util;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Guilherme Freitas
 */
public class JavaMailApp {

    public static void enviarEmail(String nome, String email, String assunto, String messangem) {
        Properties props = new Properties();
        /**
         * Parâmetros de conexão com servidor Gmail
         */
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("livrariatreebu@gmail.com", "29102017");
            }
        });
        /**
         * Ativa Debug para sessão
         */
        session.setDebug(true);
        try {   
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("livrariatreebu@gmail.com")); //Remetente

            Address[] toUser = InternetAddress //Destinatário(s)
                    .parse(email);
            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject(assunto);//Assunto
            message.setText(messangem);
            /**
             * Método para enviar a mensagem criada
             */
            Transport.send(message);
            System.out.println("Feito!!!");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
