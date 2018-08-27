package GUI;

import DAO.BD;
import static java.awt.SystemColor.window;
import java.awt.Window;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricky
 */
public class Menu extends javax.swing.JFrame {

    private GerenciarExemplares gerExemplares = new GerenciarExemplares();

    private BD banco = new BD();

    private void desativarGUI() {
        jpServerConfig.setVisible(false);
        jpGerEmprestimos.setVisible(false);
        jpGerExemplares.setVisible(false);
        jpGerLivros.setVisible(false);
        jpGerMultas.setVisible(false);
        jpGerPerfis.setVisible(false);
        jpGerPoliticas.setVisible(false);
        jpGerRestauracao.setVisible(false);
        jpGerUsuarios.setVisible(false);

    }

    private void ativarGUI(int acervo, int emprestimos, int perfis, int politicas, int usuarios) {

        if (acervo == 1) {
            jpGerExemplares.setVisible(true);
            jpGerLivros.setVisible(true);
            jpGerRestauracao.setVisible(true);
        }
        if (emprestimos == 1) {
            jpGerEmprestimos.setVisible(true);
            jpGerMultas.setVisible(true);
        }
        if (perfis == 1) {
            jpGerPerfis.setVisible(true);
        }
        if (politicas == 1) {
            jpGerPoliticas.setVisible(true);
        }
        if (politicas == 1) {
            jpGerUsuarios.setVisible(true);
        }

    }

    public Menu(String nome, String perfil, String politica) {
        initComponents();
        desativarGUI();
        try {
            banco.executar("SELECT * FROM perfis WHERE nome = '" + perfil + "'");
            jlNome.setText(nome);
            jlPerfil.setText(perfil);
            jlPolitica.setText(politica);
            banco.resultado.next();
            int acervo = banco.resultado.getInt("gerAcervo");
            int emprestimos = banco.resultado.getInt("gerEmprestimo");
            int perfis = banco.resultado.getInt("gerPerfil");
            int politicas = banco.resultado.getInt("gerPolitica");
            int usuarios = banco.resultado.getInt("gerUsuario");
            ativarGUI(acervo, emprestimos, perfis, politicas, usuarios);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao carregar perfil de acesso!\n" + ex);
        }
    }

    public Menu() {
        initComponents();
        desativarGUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo_principal = new javax.swing.JPanel();
        jpGerLivros = new javax.swing.JPanel();
        jbGerLivros = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jpGerUsuarios = new javax.swing.JPanel();
        jbGerUsuarios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jpGerEmprestimos = new javax.swing.JPanel();
        jbGerEmprestimos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jpServerConfig = new javax.swing.JPanel();
        jbDisable = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jpGerPoliticas = new javax.swing.JPanel();
        jbGerPoliticas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jpGerExemplares = new javax.swing.JPanel();
        jbGerExemplares = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jpGerPerfis = new javax.swing.JPanel();
        jbGerPerfis = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jpGerRestauracao = new javax.swing.JPanel();
        jbGerRestauracao = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jpGerMultas = new javax.swing.JPanel();
        jbGerMultas = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jlVersao = new javax.swing.JLabel();
        jlMercham = new javax.swing.JLabel();
        fundo_lateral = new javax.swing.JPanel();
        jlIcon = new javax.swing.JLabel();
        jlPerfil = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jbSair = new javax.swing.JButton();
        jbTrocarUsuario = new javax.swing.JButton();
        jlPolitica = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BibliSoft - Menu Principal");
        setMaximumSize(new java.awt.Dimension(800, 480));
        setMinimumSize(new java.awt.Dimension(800, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 480));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        fundo_principal.setMaximumSize(new java.awt.Dimension(800, 480));
        fundo_principal.setMinimumSize(new java.awt.Dimension(800, 480));
        fundo_principal.setName(""); // NOI18N
        fundo_principal.setPreferredSize(new java.awt.Dimension(800, 480));

        jpGerLivros.setBackground(new java.awt.Color(204, 255, 204));
        jpGerLivros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpGerLivros.setLayout(new java.awt.BorderLayout());

        jbGerLivros.setText("Icon");
        jpGerLivros.add(jbGerLivros, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerenciar Livros");
        jpGerLivros.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jpGerUsuarios.setBackground(new java.awt.Color(204, 255, 204));
        jpGerUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpGerUsuarios.setLayout(new java.awt.BorderLayout());

        jbGerUsuarios.setText("Icon");
        jpGerUsuarios.add(jbGerUsuarios, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gerenciar Usuarios");
        jpGerUsuarios.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jpGerEmprestimos.setBackground(new java.awt.Color(204, 255, 204));
        jpGerEmprestimos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpGerEmprestimos.setLayout(new java.awt.BorderLayout());

        jbGerEmprestimos.setText("Icon");
        jpGerEmprestimos.add(jbGerEmprestimos, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gerenciar Empréstimos");
        jpGerEmprestimos.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jpServerConfig.setBackground(new java.awt.Color(204, 255, 204));
        jpServerConfig.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpServerConfig.setEnabled(false);
        jpServerConfig.setLayout(new java.awt.BorderLayout());

        jbDisable.setText("Icon");
        jpServerConfig.add(jbDisable, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SERVER CONFIG");
        jpServerConfig.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jpGerPoliticas.setBackground(new java.awt.Color(204, 255, 204));
        jpGerPoliticas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpGerPoliticas.setLayout(new java.awt.BorderLayout());

        jbGerPoliticas.setText("Icon");
        jpGerPoliticas.add(jbGerPoliticas, java.awt.BorderLayout.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gerenciar Politicas");
        jpGerPoliticas.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jpGerExemplares.setBackground(new java.awt.Color(204, 255, 204));
        jpGerExemplares.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpGerExemplares.setPreferredSize(new java.awt.Dimension(164, 116));
        jpGerExemplares.setLayout(new java.awt.BorderLayout());

        jbGerExemplares.setText("Icon");
        jbGerExemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerExemplaresActionPerformed(evt);
            }
        });
        jpGerExemplares.add(jbGerExemplares, java.awt.BorderLayout.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gerenciar  Exemplares");
        jpGerExemplares.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        jpGerPerfis.setBackground(new java.awt.Color(204, 255, 204));
        jpGerPerfis.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpGerPerfis.setLayout(new java.awt.BorderLayout());

        jbGerPerfis.setText("Icon");
        jpGerPerfis.add(jbGerPerfis, java.awt.BorderLayout.CENTER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Gerenciar Perfis");
        jpGerPerfis.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        jpGerRestauracao.setBackground(new java.awt.Color(204, 255, 204));
        jpGerRestauracao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpGerRestauracao.setLayout(new java.awt.BorderLayout());

        jbGerRestauracao.setText("Icon");
        jpGerRestauracao.add(jbGerRestauracao, java.awt.BorderLayout.CENTER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Gerenciar Restauração");
        jpGerRestauracao.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        jpGerMultas.setBackground(new java.awt.Color(204, 255, 204));
        jpGerMultas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpGerMultas.setLayout(new java.awt.BorderLayout());

        jbGerMultas.setText("Icon");
        jpGerMultas.add(jbGerMultas, java.awt.BorderLayout.CENTER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Gerenciar Multas");
        jpGerMultas.add(jLabel9, java.awt.BorderLayout.PAGE_START);

        jlVersao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlVersao.setText("v2.0");

        jlMercham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMercham.setText("BibliSoft 2018");

        fundo_lateral.setBackground(new java.awt.Color(204, 204, 255));
        fundo_lateral.setMaximumSize(new java.awt.Dimension(176, 480));
        fundo_lateral.setMinimumSize(new java.awt.Dimension(176, 480));
        fundo_lateral.setName(""); // NOI18N
        fundo_lateral.setPreferredSize(new java.awt.Dimension(176, 480));

        jlIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIcon.setText("Icone_Nivel_Acesso");
        jlIcon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jlPerfil.setText("Perfil de Acesso");

        jlNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlNome.setText("Nome Usuario");

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jbTrocarUsuario.setText("Trocar Usuário");
        jbTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTrocarUsuarioActionPerformed(evt);
            }
        });

        jlPolitica.setText("(Politica)");

        javax.swing.GroupLayout fundo_lateralLayout = new javax.swing.GroupLayout(fundo_lateral);
        fundo_lateral.setLayout(fundo_lateralLayout);
        fundo_lateralLayout.setHorizontalGroup(
            fundo_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo_lateralLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(fundo_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbSair)
                    .addComponent(jbTrocarUsuario)
                    .addComponent(jlPerfil)
                    .addComponent(jlNome)
                    .addComponent(jlIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPolitica))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        fundo_lateralLayout.setVerticalGroup(
            fundo_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo_lateralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jlNome)
                .addGap(17, 17, 17)
                .addComponent(jlPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlPolitica)
                .addGap(149, 149, 149)
                .addComponent(jbTrocarUsuario)
                .addGap(18, 18, 18)
                .addComponent(jbSair)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fundo_principalLayout = new javax.swing.GroupLayout(fundo_principal);
        fundo_principal.setLayout(fundo_principalLayout);
        fundo_principalLayout.setHorizontalGroup(
            fundo_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo_principalLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(fundo_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpGerLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpGerUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpGerEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMercham, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fundo_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpGerExemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpGerPoliticas, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpServerConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(fundo_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpGerPerfis, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpGerRestauracao, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpGerMultas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fundo_principalLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jlVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(fundo_lateral, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        fundo_principalLayout.setVerticalGroup(
            fundo_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo_principalLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(fundo_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpGerLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpGerExemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpGerPerfis, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fundo_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpGerUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpGerPoliticas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpGerRestauracao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fundo_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpGerEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpServerConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpGerMultas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(fundo_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlMercham)
                    .addComponent(jlVersao))
                .addGap(26, 26, 26))
            .addComponent(fundo_lateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(fundo_principal, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTrocarUsuarioActionPerformed
        // TODO add your handling code here:
        //int i = JOptionPane.showConfirmDialog(rootPane, "Deseja encerrar a sessão atual e voltar a tela de Login?", "Atenção!", 0, 2);
        int cont = 0;
        for (Window window : Window.getWindows()) {
            cont++;
            window.dispose();
        }
        JOptionPane.showMessageDialog(rootPane, cont);
        new Login().setVisible(true);
        /*if (i == 0) {
            banco.fechar(0);
            new Login().setVisible(true);
            this.dispose();

        }*/

    }//GEN-LAST:event_jbTrocarUsuarioActionPerformed

    private void jbGerExemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerExemplaresActionPerformed
        // TODO add your handling code here:
        if (!gerExemplares.isEnabled()) {
            gerExemplares.setEnabled(true);
            gerExemplares.setVisible(true);
        } else {
            gerExemplares.setVisible(true);
        }

    }//GEN-LAST:event_jbGerExemplaresActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        banco.fechar(0);
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jbSairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        jbSairActionPerformed(null);
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fundo_lateral;
    private javax.swing.JPanel fundo_principal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbDisable;
    private javax.swing.JButton jbGerEmprestimos;
    private javax.swing.JButton jbGerExemplares;
    private javax.swing.JButton jbGerLivros;
    private javax.swing.JButton jbGerMultas;
    private javax.swing.JButton jbGerPerfis;
    private javax.swing.JButton jbGerPoliticas;
    private javax.swing.JButton jbGerRestauracao;
    private javax.swing.JButton jbGerUsuarios;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbTrocarUsuario;
    private javax.swing.JLabel jlIcon;
    private javax.swing.JLabel jlMercham;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPerfil;
    private javax.swing.JLabel jlPolitica;
    private javax.swing.JLabel jlVersao;
    private javax.swing.JPanel jpGerEmprestimos;
    private javax.swing.JPanel jpGerExemplares;
    private javax.swing.JPanel jpGerLivros;
    private javax.swing.JPanel jpGerMultas;
    private javax.swing.JPanel jpGerPerfis;
    private javax.swing.JPanel jpGerPoliticas;
    private javax.swing.JPanel jpGerRestauracao;
    private javax.swing.JPanel jpGerUsuarios;
    private javax.swing.JPanel jpServerConfig;
    // End of variables declaration//GEN-END:variables
}
