/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;

/**
 *
 * @author Ricky
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPFundo = new javax.swing.JPanel();
        JLLogo = new javax.swing.JLabel();
        JPLoginSenha = new javax.swing.JPanel();
        jPasswordField_senha = new javax.swing.JPasswordField();
        jLabel_senha = new javax.swing.JLabel();
        jLabel_login = new javax.swing.JLabel();
        jTextField_login = new javax.swing.JTextField();
        JBEntrar = new javax.swing.JButton();
        JLEsqueceu = new javax.swing.JLabel();
        JLStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(320, 430));
        setMinimumSize(new java.awt.Dimension(320, 430));
        setPreferredSize(new java.awt.Dimension(320, 430));
        setResizable(false);
        setSize(new java.awt.Dimension(320, 420));

        JPFundo.setPreferredSize(new java.awt.Dimension(320, 420));

        JLLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLLogo.setText("Icone Biblisoft");
        JLLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JPLoginSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JPLoginSenha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPLoginSenha.add(jPasswordField_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 87, 170, -1));

        jLabel_senha.setText("Senha");
        JPLoginSenha.add(jLabel_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 93, -1, -1));

        jLabel_login.setText("Login");
        JPLoginSenha.add(jLabel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 35, -1, -1));

        jTextField_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_loginActionPerformed(evt);
            }
        });
        JPLoginSenha.add(jTextField_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 29, 170, -1));

        JBEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBEntrar.setText("Entar");

        JLEsqueceu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLEsqueceu.setForeground(new java.awt.Color(0, 0, 153));
        JLEsqueceu.setText("Esqueceu sua senha?");

        JLStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLStatus.setForeground(new java.awt.Color(0, 153, 0));
        JLStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLStatus.setText("Online");

        javax.swing.GroupLayout JPFundoLayout = new javax.swing.GroupLayout(JPFundo);
        JPFundo.setLayout(JPFundoLayout);
        JPFundoLayout.setHorizontalGroup(
            JPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPFundoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(JPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPFundoLayout.createSequentialGroup()
                        .addComponent(JLEsqueceu)
                        .addGap(48, 48, 48)
                        .addComponent(JBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JPLoginSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLStatus)
                .addGap(143, 143, 143))
        );
        JPFundoLayout.setVerticalGroup(
            JPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPFundoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(JLStatus)
                .addGap(18, 18, 18)
                .addComponent(JLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLEsqueceu))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEntrar;
    private javax.swing.JLabel JLEsqueceu;
    private javax.swing.JLabel JLLogo;
    private javax.swing.JLabel JLStatus;
    private javax.swing.JPanel JPFundo;
    private javax.swing.JPanel JPLoginSenha;
    private javax.swing.JLabel jLabel_login;
    private javax.swing.JLabel jLabel_senha;
    private javax.swing.JPasswordField jPasswordField_senha;
    private javax.swing.JTextField jTextField_login;
    // End of variables declaration//GEN-END:variables
}
