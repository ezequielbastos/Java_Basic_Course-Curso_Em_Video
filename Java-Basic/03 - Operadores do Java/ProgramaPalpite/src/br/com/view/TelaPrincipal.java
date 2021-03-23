/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import java.awt.Font;

/**
 *
 * @author Zack ft Jeisy
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() { //Construtor
        initComponents();
        //Para quebrar linha de texto usamos a frase dentro de uma tag html <html></html>
        // Podemos usar Varias tags html ele para formatar nossas frases dentro de um progeto!
        lblFrase.setText("<html>Vou pensar em um valor entre <strong>1 a 5</strong>. Tente adivinhar!<html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblFrase = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValor = new javax.swing.JSpinner();
        btnAdvinhar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/genio.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 234, -1));

        lblFrase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setText("Frase");
        lblFrase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 74, 180, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/balao-de-fala.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 260, 228));

        jLabel4.setBackground(new java.awt.Color(195, 53, 113));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(195, 53, 113));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Valor");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 270, 70, 20));

        txtValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtValor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 60, -1));

        btnAdvinhar.setBackground(new java.awt.Color(255, 255, 255));
        btnAdvinhar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdvinhar.setForeground(new java.awt.Color(195, 53, 113));
        btnAdvinhar.setText("Advinhar");
        btnAdvinhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdvinharActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdvinhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(427, 475));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdvinharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdvinharActionPerformed
        // TODO add your handling code here:
        
        //Gerando o numero de 1 a 5
        double n = 1 + Math.random() * (6 - 1);
        int valor = (int) n;
        
        //Pegando o Numero de 1 a 5 do campo.
        int num = Integer.parseInt(txtValor.getValue().toString());
        
        //Definindo o que vai aparecer caso a pessoa acerte ou erre
        String f1 = "<html>ACERTOU!</html>";
        String f2 = "<html>ERROU! Eu pensei no valor " + valor + "</html>";
        
        //Programando a o acontecimento! para aparecer de fato!
        String res = (valor == num)?f1:f2;
        
        //Definindo font da frase que aparecera para o jogador
        lblFrase.setFont(new Font("Arial Black", Font.PLAIN, 14));
        
        //Mostrando a se acertou ou errou o numero para o jogador!
        lblFrase.setText(res);
    }//GEN-LAST:event_btnAdvinharActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdvinhar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner txtValor;
    // End of variables declaration//GEN-END:variables
}