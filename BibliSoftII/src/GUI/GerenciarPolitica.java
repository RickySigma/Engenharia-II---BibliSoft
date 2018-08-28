package GUI;

import DAO.BD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Ricky
 */
public class GerenciarPolitica extends javax.swing.JFrame {

    private BD banco = new BD();
    private String nome;
    private int flag;

    public GerenciarPolitica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtfPesquisar = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jSPainelTabela = new javax.swing.JScrollPane();
        jtPolitica = new javax.swing.JTable();
        jcobStatusC = new javax.swing.JComboBox<>();
        jcebStatusC = new javax.swing.JCheckBox();
        jpGer = new javax.swing.JPanel();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbInserir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfMultaPorDinheiro = new javax.swing.JTextField();
        jtfQtdItens = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfNomePolitica = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfQtdDia = new javax.swing.JTextField();
        jtfMultaEmDias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jbConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 400));

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jtPolitica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome da Politica", "Qtd. Máx. de Dias", "Qtd. Máx. de Itens", "Multa em Dias", "Valor Multa em R$", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPolitica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPoliticaMouseClicked(evt);
            }
        });
        jSPainelTabela.setViewportView(jtPolitica);

        jcobStatusC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativa", "Inativa" }));
        jcobStatusC.setSelectedIndex(1);
        jcobStatusC.setEnabled(false);

        jcebStatusC.setText("Status");

        jpGer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbInserir.setText("Inserir");
        jbInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInserirActionPerformed(evt);
            }
        });

        jLabel3.setText("Multa em diinheiro:");

        jtfMultaPorDinheiro.setEnabled(false);

        jtfQtdItens.setEnabled(false);

        jLabel2.setText("Quantidade de itens:");

        jLabel1.setText("Nome da Politica:");

        jtfNomePolitica.setEnabled(false);

        jLabel4.setText("Quantidade de dias:");

        jtfQtdDia.setEnabled(false);

        jtfMultaEmDias.setEnabled(false);

        jLabel6.setText("Multa em dias:");

        jbCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbConfirmar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbConfirmar.setText("Confirmar");
        jbConfirmar.setEnabled(false);
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpGerLayout = new javax.swing.GroupLayout(jpGer);
        jpGer.setLayout(jpGerLayout);
        jpGerLayout.setHorizontalGroup(
            jpGerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpGerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addGroup(jpGerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfMultaPorDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfQtdItens, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNomePolitica, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpGerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpGerLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jpGerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(3, 3, 3)
                        .addGroup(jpGerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMultaEmDias, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfQtdDia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCancelar)
                        .addGap(45, 45, 45)
                        .addComponent(jbConfirmar)
                        .addGap(150, 150, 150))))
            .addGroup(jpGerLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jbInserir)
                .addGap(70, 70, 70)
                .addComponent(jbExcluir)
                .addGap(18, 18, 18)
                .addComponent(jbAlterar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpGerLayout.setVerticalGroup(
            jpGerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpGerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtfNomePolitica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtfQtdDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jpGerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jtfQtdItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtfMultaEmDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpGerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpGerLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jpGerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jtfMultaPorDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jpGerLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jpGerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbCancelar)
                            .addComponent(jbConfirmar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jpGerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbInserir)
                    .addComponent(jbExcluir)
                    .addComponent(jbAlterar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jbPesquisar)
                                .addGap(131, 131, 131)
                                .addComponent(jcebStatusC)
                                .addGap(33, 33, 33)
                                .addComponent(jcobStatusC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSPainelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpGer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jSPainelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar)
                    .addComponent(jcebStatusC)
                    .addComponent(jcobStatusC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpGer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        int p = verificarCampoPesquisar();

        System.out.println(p + " p");

        if (p == 0) {

            nome = jtfPesquisar.getText();
            banco.executar("SELECT * FROM `politicas` WHERE Nome LIKE '%" + nome + "%'");
            preencherTabela();
            jtPolitica.setVisible(true);
            jbAlterar.setEnabled(true);
            jbExcluir.setEnabled(true);
            jbInserir.setEnabled(false);
            jbCancelar.setEnabled(true);
            jtPolitica.setRowSelectionAllowed(true);
            nome = "";
            jtfPesquisar.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Item não encontrado!");
            jtPolitica.setVisible(false);
            jtfPesquisar.setText("");

        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jtPoliticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPoliticaMouseClicked
        if (jtPolitica.getSelectedRow() != -1) {
            jtfNomePolitica.setText(jtPolitica.getValueAt(jtPolitica.getSelectedRow(), 0).toString());
            jtfQtdDia.setText(jtPolitica.getValueAt(jtPolitica.getSelectedRow(), 1).toString());
            jtfQtdItens.setText(jtPolitica.getValueAt(jtPolitica.getSelectedRow(), 2).toString());
            jtfMultaEmDias.setText(jtPolitica.getValueAt(jtPolitica.getSelectedRow(), 3).toString());
            jtfMultaPorDinheiro.setText(jtPolitica.getValueAt(jtPolitica.getSelectedRow(), 4).toString());

        }
    }//GEN-LAST:event_jtPoliticaMouseClicked

    private void jbInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInserirActionPerformed
        flag = 1;
        jbConfirmar.setEnabled(true);
        jtfNomePolitica.setEnabled(true);
        jtfQtdDia.setEnabled(true);
        jtfQtdItens.setEnabled(true);
        jtfMultaPorDinheiro.setEnabled(true);
        jtfPesquisar.setEnabled(false);
        jbPesquisar.setEnabled(false);
        jbCancelar.setEnabled(true);
        jtfMultaEmDias.setEnabled(true);
    }//GEN-LAST:event_jbInserirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        flag = 2;
        jtPolitica.setEnabled(false);
        jbConfirmar.setEnabled(true);
        jtfNomePolitica.setEnabled(!true);
        jtfQtdDia.setEnabled(true);
        jtfQtdItens.setEnabled(true);
        jtfMultaPorDinheiro.setEnabled(true);
        jtfMultaEmDias.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbAlterar.setEnabled(false);
        jbInserir.setEnabled(false);
        jbExcluir.setEnabled(false);
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        flag = 3;
        jbConfirmar.setEnabled(true);
        jtfNomePolitica.setEnabled(false);
        jtfQtdDia.setEnabled(false);
        jtfQtdItens.setEnabled(false);
        jtfMultaPorDinheiro.setEnabled(false);

        jbCancelar.setEnabled(true);
        jbAlterar.setEnabled(false);
        jbInserir.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbConfirmar.setEnabled(true);
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        jbConfirmar.setEnabled(!true);
        jtfNomePolitica.setEnabled(!true);
        jtfQtdDia.setEnabled(!true);
        jtfQtdItens.setEnabled(!true);
        jtfMultaPorDinheiro.setEnabled(!true);
        jtfMultaEmDias.setEnabled(false);
        jtfPesquisar.setEnabled(true);
        jbPesquisar.setEnabled(true);
        jbCancelar.setEnabled(!true);
        limparCampos();
        jbInserir.setEnabled(true);
        jbAlterar.setEnabled(!true);
        jbExcluir.setEnabled(!true);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        int r = verificarCampos();

        if (flag == 1 && r != 1) {

            nome = jtfNomePolitica.getText();
            politica.setQtdDeDia(Integer.parseInt(jtfQtdDia.getText().toString()));
            politica.setQtdDeLivro(Integer.parseInt(jtfQtdItens.getText().toString()));
            politica.setMultaEmDinheiro(Float.parseFloat(jtfMultaPorDinheiro.getText()));
            politica.setStatus("Inativa");
            politica.setMultaPorDia(Integer.parseInt(jtfMultaEmDias.getText()));
            System.out.println(politica.getMultaPorDia());
            banco.inserir(nome, nome, nome);

            limparCampos();
            // preencherTabela("SELECT Nome, Qtddias, Qtdlivros, multaEmDias, multaDinheiro, Status " + "FROM politicas " +"WHERE " +"(nome ='" + politica.getPesquisa() + "')");
            preencherTabela();
            jtfNomePolitica.setEnabled(false);
            jtfQtdDia.setEnabled(false);
            jtfQtdItens.setEnabled(false);
            jtfMultaPorDinheiro.setEnabled(false);
            jtfPesquisar.setEnabled(true);
            jbPesquisar.setEnabled(true);
            jbConfirmar.setEnabled(false);
            jtfMultaEmDias.setEnabled(false);
        } else if (flag == 2 && r != 1) {
            politica.setNome(jtfNomePolitica.getText());
            politica.setQtdDeDia(Integer.parseInt(jtfQtdDia.getText()));
            politica.setQtdDeLivro(Integer.parseInt(jtfQtdItens.getText()));
            politica.setMultaEmDinheiro(Float.parseFloat(jtfMultaPorDinheiro.getText()));
            politica.setStatus(jtPolitica.getValueAt(jtPolitica.getSelectedRow(), 5).toString());
            daoPolitica.editar(politica);
            jbInserir.setEnabled(true);
            limparCampos();
            //preencherTabela("SELECT Nome, Qtddias, Qtdlivros, multaEmDias, multaDinheiro, Status " + "FROM politicas " +"WHERE " +"(nome ='" + politica.getPesquisa() + "')");
            preencherTabela();
            jtfNomePolitica.setEnabled(false);
            jtfQtdDia.setEnabled(false);
            jtfQtdItens.setEnabled(false);
            jtfMultaPorDinheiro.setEnabled(false);
            jtfMultaEmDias.setEnabled(false);
            jbConfirmar.setEnabled(false);
        } else if (flag == 3) {
            nome = jtfNomePolitica.getText();
            banco.consultar("politicas", nome, nome, nome);

            if ("Inativa".equals(nome)) {
                limparCampos();

                preencherTabela();
                jtfNomePolitica.setEnabled(false);
                jtfQtdDia.setEnabled(false);
                jtfQtdItens.setEnabled(false);
                jtfMultaPorDinheiro.setEnabled(false);

                jbConfirmar.setEnabled(false);
                jbInserir.setEnabled(true);
                jbAlterar.setEnabled(false);
                jbExcluir.setEnabled(false);

            } else if ("Ativa".equals(nome)) {

                JOptionPane.showMessageDialog(null, "Politica de emprestimo em uso! exclusão não realizada ");
            }

        }
    }//GEN-LAST:event_jbConfirmarActionPerformed
    private void limparCampos() {
        
    }

    private void preencherTabela() {

        List<String[]> dados = new ArrayList<>();
        String[] colunas = {"Nome da Politica", "Qtd. Máx. Dias", "Qtd. Máx. Itens", "Multa em Dias", "Multa Valor em R$", "Status"};
        try {
            if (banco.resultado.first()) {
                do {
                    dados.add(new String[]{banco.resultado.getString("numeroTombo"), banco.resultado.getString("titulo"),
                        banco.resultado.getString("autor"), banco.resultado.getString("edicao"), banco.resultado.getString("status"),
                        banco.resultado.getString("isbn")});

                } while (banco.resultado.next());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Nenhum Resultado para esta pesquisa!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "SQL ERRO: " + ex);

        }

        DefaultTableModel modelo = new DefaultTableModel(dados.toArray(new String[dados.size()][]), colunas);

        jtPolitica.setModel(modelo);
        jtPolitica.setDefaultEditor(Object.class, null);//DESABILITA EDIÇÂO DE CELULAS NA TABELA
        TableColumn coluna;
        for (int i = 0; i < 6; i++) {
            coluna = jtPolitica.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    coluna.setPreferredWidth(10);
                    coluna.setResizable(false);
                    break;
                case 1:
                    coluna.setPreferredWidth(130);
                    coluna.setResizable(false);
                    break;
                case 2:
                    coluna.setPreferredWidth(115);
                    coluna.setResizable(false);
                    break;
                case 3:
                    coluna.setPreferredWidth(5);
                    coluna.setResizable(false);
                    break;
                case 4:
                    coluna.setPreferredWidth(30);
                    coluna.setResizable(false);
                    break;
                case 5:
                    coluna.setPreferredWidth(0);
                    coluna.setWidth(0);
                    coluna.setMinWidth(0);
                    coluna.setMaxWidth(0);
                    coluna.setResizable(false);
                    break;
            }
        }
        banco.fechar(0);
    }

    private int verificarCampoPesquisar() {
        int flagi = 0;
        if (jtfPesquisar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de pesquisa!");
            flagi = 1;
        }
        return flagi;
    }
    
   private int verificarCampos(){
        return 0;
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciarPolitica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarPolitica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarPolitica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarPolitica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarPolitica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jSPainelTabela;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbInserir;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JCheckBox jcebStatusC;
    private javax.swing.JComboBox<String> jcobStatusC;
    private javax.swing.JPanel jpGer;
    private javax.swing.JTable jtPolitica;
    private javax.swing.JTextField jtfMultaEmDias;
    private javax.swing.JTextField jtfMultaPorDinheiro;
    private javax.swing.JTextField jtfNomePolitica;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JTextField jtfQtdDia;
    private javax.swing.JTextField jtfQtdItens;
    // End of variables declaration//GEN-END:variables

}