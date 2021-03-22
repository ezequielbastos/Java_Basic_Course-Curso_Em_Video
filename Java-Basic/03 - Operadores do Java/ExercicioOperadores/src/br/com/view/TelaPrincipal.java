/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

/**
 *
 * @author Ezequiel Bastos
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() { //Contrutor
        initComponents();
        panCalc.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txtRecebeNumero = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        panCalc = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblRaizQuadrada = new javax.swing.JLabel();
        lblRaizCubica = new javax.swing.JLabel();
        lblValorAbs = new javax.swing.JLabel();
        lblRestoDaDivisao = new javax.swing.JLabel();
        lblElevadoAoCubo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TelaPrincipal");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 255));
        jLabel1.setText("Super Calculadora");

        txtRecebeNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 153, 255));
        jLabel2.setText("Digite um numero:");

        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(204, 153, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 7, 103));
        jLabel5.setText("Raiz Quadrada");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(6, 7, 103));
        jLabel6.setText("Raiz Cúbica");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(6, 7, 103));
        jLabel7.setText("Valor Absoluto");

        lblRaizQuadrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRaizQuadrada.setForeground(new java.awt.Color(204, 153, 255));
        lblRaizQuadrada.setText("0");

        lblRaizCubica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRaizCubica.setForeground(new java.awt.Color(204, 153, 255));
        lblRaizCubica.setText("0");

        lblValorAbs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorAbs.setForeground(new java.awt.Color(204, 153, 255));
        lblValorAbs.setText("0");

        lblRestoDaDivisao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRestoDaDivisao.setForeground(new java.awt.Color(204, 153, 255));
        lblRestoDaDivisao.setText("0");

        lblElevadoAoCubo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblElevadoAoCubo.setForeground(new java.awt.Color(204, 153, 255));
        lblElevadoAoCubo.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(6, 7, 103));
        jLabel3.setText("Resto da Divisão por 2");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(6, 7, 103));
        jLabel4.setText("Elevado ao Cubo");

        javax.swing.GroupLayout panCalcLayout = new javax.swing.GroupLayout(panCalc);
        panCalc.setLayout(panCalcLayout);
        panCalcLayout.setHorizontalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblRestoDaDivisao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(lblRaizCubica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRaizQuadrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblElevadoAoCubo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValorAbs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panCalcLayout.setVerticalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblRestoDaDivisao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblElevadoAoCubo))
                .addGap(32, 32, 32)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblRaizQuadrada))
                .addGap(31, 31, 31)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblRaizCubica))
                .addGap(33, 33, 33)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lblValorAbs))
                .addGap(24, 24, 24))
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/calculadoras.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(panCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtRecebeNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRecebeNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnCalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(629, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // Pegando o numero do Spinner e convertendo de String para int
        int numeroPraConversao = Integer.parseInt(txtRecebeNumero.getValue().toString());
        
        // As Linhas abaixo fazem as operações de conversão do numero
        int restoDiv = numeroPraConversao %2;
        float cubo = (float) Math.pow(numeroPraConversao, 3);
        float rQuadrada = (float) Math.sqrt(numeroPraConversao);
        float rCubica = (float) Math.cbrt(numeroPraConversao);
        int valorAbs = Math.abs(numeroPraConversao);
        
        // setando as informações dos resultados das operações
        lblRestoDaDivisao.setText(Integer.toString(restoDiv));
        
        //Maneira de mostra os resultados dos Numeros Reais sem esta formatado
        /*
        lblElevadoAoCubo.setText(Float.toString(cubo));
        lblRaizQuadrada.setText(Float.toString(rQuadrada));
        lblRaizCubica.setText(Float.toString(rCubica));
        */
        //Maneira com formatação dos Numeros Reais
        lblElevadoAoCubo.setText(String.format("%.2f", cubo));
        lblRaizQuadrada.setText(String.format("%.2f", rQuadrada));
        lblRaizCubica.setText(String.format("%.2f", rCubica));
        lblValorAbs.setText(Integer.toString(valorAbs));
        
        panCalc.setVisible(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

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
    private javax.swing.JButton btnCalcular;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblElevadoAoCubo;
    private javax.swing.JLabel lblRaizCubica;
    private javax.swing.JLabel lblRaizQuadrada;
    private javax.swing.JLabel lblRestoDaDivisao;
    private javax.swing.JLabel lblValorAbs;
    private javax.swing.JPanel panCalc;
    private javax.swing.JSpinner txtRecebeNumero;
    // End of variables declaration//GEN-END:variables
}
