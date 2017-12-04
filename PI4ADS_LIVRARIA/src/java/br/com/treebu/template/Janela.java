/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treebu.template;

import javax.swing.JOptionPane;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author aluno
 */
public class Janela extends javax.swing.JFrame {
    
    public Janela() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGridGeneros = new javax.swing.JTable();
        btnPorNome = new javax.swing.JToggleButton();
        btnPorMatricula = new javax.swing.JButton();
        btnPorDptoeNome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Professores");

        jTableGridGeneros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Descricao"
            }
        ));
        jTableGridGeneros.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jTableGridGeneros);

        btnPorNome.setBackground(new java.awt.Color(204, 204, 255));
        btnPorNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPorNome.setText("Codigo");
        btnPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorNomeActionPerformed(evt);
            }
        });

        btnPorMatricula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPorMatricula.setText("Nome");
        btnPorMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorMatriculaActionPerformed(evt);
            }
        });

        btnPorDptoeNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPorDptoeNome.setText("Descricao");
        btnPorDptoeNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorDptoeNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnPorMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnPorDptoeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPorDptoeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPorMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void imprimirNaGrid(Iterator<GeneroTemplate> dados) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableGridGeneros.getModel();
            model.setNumRows(0);
            while (dados.hasNext()) {
                String[] linha = new String[7];
                GeneroTemplate obj = dados.next();
                linha[0] = "" + obj.getCodigo();
                linha[1] = obj.getNome();
                linha[2] = obj.getDescricao();
                model.addRow(linha);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }
    private void btnPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorNomeActionPerformed
        
        try {
            String arquivo = "src/java/br/com/treebu/arquivos/genero.csv";
            
           OrdenarCodigo objeto = new OrdenarCodigo(arquivo);
            imprimirNaGrid(objeto.listagem());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_btnPorNomeActionPerformed

    private void btnPorMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorMatriculaActionPerformed
        try {
            String arquivo = "src/java/br/com/treebu/arquivos/genero.csv";
            
            OrdenarNome objeto = new OrdenarNome(arquivo);
            imprimirNaGrid(objeto.listagem());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_btnPorMatriculaActionPerformed

    private void btnPorDptoeNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorDptoeNomeActionPerformed
        try {
            String arquivo = "src/java/br/com/treebu/arquivos/genero.csv";
            
            OrdenarDescricao objeto = new OrdenarDescricao(arquivo);
            imprimirNaGrid(objeto.listagem());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_btnPorDptoeNomeActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPorDptoeNome;
    private javax.swing.JButton btnPorMatricula;
    private javax.swing.JToggleButton btnPorNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGridGeneros;
    // End of variables declaration//GEN-END:variables
}
