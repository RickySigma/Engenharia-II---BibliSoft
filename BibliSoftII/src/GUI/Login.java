package GUI;

import DAO.BD;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricky
 */
public class Login extends javax.swing.JFrame {

    private void testaServidor() {
        BD banco = new BD();
        if (banco.testar(false)) {
            String status = banco.consultarUmaColuna("server", "status", false);
            String msg = banco.consultarUmaColuna("server", "mensagem", false);
            jlStatus.setText(status);
            jlStatus.setToolTipText(msg);

            if (status.compareTo("Online") == 0) {
                jlStatus.setForeground(new Color(0, 153, 0));

                jtfLogin.setEnabled(true);
                jtfSenha.setEnabled(true);
                jbEntrar.setEnabled(true);
            } else if (status.compareTo("Manutenção") == 0) {
                jlStatus.setForeground(new Color(153, 0, 0));
            }
        }
        banco.fechar(0);
    }

    private void validaAcesso() {
        BD banco = new BD();

        String sql = "SELECT nome, nomePerfil, nomePolitica FROM usuarios WHERE matricula = '" + jtfLogin.getText() + "' AND senha = '"
                + new String(jtfSenha.getPassword()) + "'";
        banco.executar(sql);

        try {
            banco.resultado.next();

            String nome = banco.resultado.getString("nome");
            
            String perfil = banco.resultado.getString("nomePerfil");
            
            String politica = banco.resultado.getString("nomePolitica");
 
            banco.fechar(0);
            Menu menu = new Menu(nome, perfil, politica);
            menu.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao tentar recuperar perfil do usuario!\n"+ex.getMessage());
        }
    }

    public Login() {

        initComponents();
        testaServidor();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFundo = new javax.swing.JPanel();
        jlLogo = new javax.swing.JLabel();
        jpLoginSenha = new javax.swing.JPanel();
        jtfSenha = new javax.swing.JPasswordField();
        jlSenha = new javax.swing.JLabel();
        jlLogin = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jbEntrar = new javax.swing.JButton();
        jlEsqueceu = new javax.swing.JLabel();
        jlStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BibliiSoft");
        setMaximumSize(new java.awt.Dimension(320, 430));
        setMinimumSize(new java.awt.Dimension(320, 430));
        setPreferredSize(new java.awt.Dimension(320, 430));
        setResizable(false);
        setSize(new java.awt.Dimension(320, 420));

        jpFundo.setPreferredSize(new java.awt.Dimension(320, 420));

        jlLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogo.setText("Icone Biblisoft");
        jlLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpLoginSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpLoginSenha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfSenha.setText("123456");
        jtfSenha.setEnabled(false);
        jpLoginSenha.add(jtfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 87, 170, -1));

        jlSenha.setText("Senha");
        jpLoginSenha.add(jlSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 93, -1, -1));

        jlLogin.setText("Login");
        jpLoginSenha.add(jlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 35, -1, -1));

        jtfLogin.setText("123456");
        jtfLogin.setEnabled(false);
        jpLoginSenha.add(jtfLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 29, 170, -1));

        jbEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbEntrar.setText("Entar");
        jbEntrar.setEnabled(false);
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });

        jlEsqueceu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlEsqueceu.setForeground(new java.awt.Color(0, 0, 153));
        jlEsqueceu.setText("Esqueceu sua senha?");

        jlStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlStatus.setForeground(new java.awt.Color(53, 53, 53));
        jlStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlStatus.setText("Offline");
        jlStatus.setToolTipText("Sem acesso ao servidor!");

        javax.swing.GroupLayout jpFundoLayout = new javax.swing.GroupLayout(jpFundo);
        jpFundo.setLayout(jpFundoLayout);
        jpFundoLayout.setHorizontalGroup(
            jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFundoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlStatus)
                    .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpFundoLayout.createSequentialGroup()
                            .addComponent(jlEsqueceu)
                            .addGap(48, 48, 48)
                            .addComponent(jbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jpLoginSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
        );
        jpFundoLayout.setVerticalGroup(
            jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFundoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlStatus)
                .addGap(18, 18, 18)
                .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEsqueceu))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed

        validaAcesso();
    }//GEN-LAST:event_jbEntrarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton jbEntrar;
    private javax.swing.JLabel jlEsqueceu;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JPanel jpFundo;
    private javax.swing.JPanel jpLoginSenha;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables
}
