package GUI;

//import CTRL.ModeloTabela;
import javax.swing.JOptionPane;
import DAO.BD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class GerenciarExemplares extends javax.swing.JFrame {

    private String titulo;
    private String editora;
    private String autor;
    private int edicao;
    private String isbn;
    private String ntombo;
    private String status;
    private String pesquisa;

    int flag = 0;

    BD banco = new BD();

    private void limpaVariaveis() {
        titulo = "";
        editora = "";
        autor = "";
        edicao = 0;
        isbn = "";
        ntombo = "";
        status = "";
    }

    private int verificarCampoPesquisa() {
        int flagi = 0;
        if (jtfPesquisar.getText().isEmpty() && jcobTipoPesquisa.getSelectedIndex()!=3) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de pesquisa!");
            flagi = 1;
        }
        return flagi;
    }

    public int verificarCampos() {
        int flagi = 0;
        if (jtfNTombo.getText().isEmpty() || jtfISBN.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Nº Tombo e o ISBN!");
            flagi = 1;
        }
        return flagi;
    }

    private void limpaCampos() {
        jcebStatus.setSelected(false);
        jcobStatusC.setSelectedIndex(0);
        jcobStatusG.setSelectedIndex(0);
        jcobTipoPesquisa.setSelectedIndex(0);
        jtLivro.clearSelection();
        jtfEdicao.setText("");
        jtfAutor.setText("");
        jtfISBN.setText("");
        jtfNTombo.setText("");
        jtfPesquisar.setText("");
        jtfTitulo.setText("");
    }

    private void ativarCampos() {
        jcobStatusG.setEnabled(true);
        jtfEdicao.setEnabled(true);
        jtfAutor.setEnabled(true);
        jtfISBN.setEnabled(true);
        jtfNTombo.setEnabled(true);
        jtfTitulo.setEnabled(true);
        jbLivros.setEnabled(true);
    }

    private void desativarCampos() {
        jcobStatusG.setEnabled(false);
        jtfEdicao.setEnabled(false);
        jtfAutor.setEnabled(false);
        jtfISBN.setEnabled(false);
        jtfNTombo.setEnabled(false);
        jtfTitulo.setEnabled(false);
        jbLivros.setEnabled(false);
    }

    public GerenciarExemplares() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFundo = new javax.swing.JPanel();
        jcebStatus = new javax.swing.JCheckBox();
        jcobStatusC = new javax.swing.JComboBox<>();
        jSPainelTabela = new javax.swing.JScrollPane();
        jtLivro = new javax.swing.JTable();
        jlPesquisar = new javax.swing.JLabel();
        jcobTipoPesquisa = new javax.swing.JComboBox<>();
        jtfPesquisar = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jpGerenciar = new javax.swing.JPanel();
        jtfEdicao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfISBN = new javax.swing.JTextField();
        jtfAutor = new javax.swing.JTextField();
        jtfTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNTombo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbInserir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jbConfirmar = new javax.swing.JButton();
        jbLivros = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jcobStatusG = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpFundo.setMaximumSize(new java.awt.Dimension(800, 400));
        jpFundo.setMinimumSize(new java.awt.Dimension(800, 400));
        jpFundo.setPreferredSize(new java.awt.Dimension(800, 400));

        jcebStatus.setText("Status");
        jcebStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcebStatusActionPerformed(evt);
            }
        });

        jcobStatusC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Emprestado", "Em Restaução", "Indisponível" }));
        jcobStatusC.setEnabled(false);

        jtLivro.setAutoCreateRowSorter(true);
        jtLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nº Tombo", "Título", "Autor", "Edição", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtLivro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtLivroFocusLost(evt);
            }
        });
        jtLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtLivroMouseClicked(evt);
            }
        });
        jSPainelTabela.setViewportView(jtLivro);
        jtLivro.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jlPesquisar.setText("Pesquisar por:");

        jcobTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nº Tombo", "ISBN", "Título", "Todos" }));
        jcobTipoPesquisa.setSelectedIndex(3);
        jcobTipoPesquisa.setToolTipText("");
        jcobTipoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcobTipoPesquisaActionPerformed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jpGerenciar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtfEdicao.setEnabled(false);

        jLabel5.setText("Edição");

        jLabel2.setText("ISBN");

        jtfISBN.setEnabled(false);

        jtfAutor.setEnabled(false);

        jtfTitulo.setEnabled(false);

        jLabel4.setText("Título");

        jLabel3.setText("Autor");

        jtfNTombo.setEnabled(false);

        jLabel6.setText("Nº Tombo");

        jbInserir.setText("Inserir");
        jbInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInserirActionPerformed(evt);
            }
        });

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

        jBCancelar.setText("Cancelar");
        jBCancelar.setEnabled(false);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jbConfirmar.setText("Confirmar");
        jbConfirmar.setEnabled(false);
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jbLivros.setText("Buscar ISBN de Livro");
        jbLivros.setEnabled(false);

        jLabel8.setText("Status");

        jcobStatusG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Emprestado", "Em Restaução", "Indisponível" }));
        jcobStatusG.setEnabled(false);

        javax.swing.GroupLayout jpGerenciarLayout = new javax.swing.GroupLayout(jpGerenciar);
        jpGerenciar.setLayout(jpGerenciarLayout);
        jpGerenciarLayout.setHorizontalGroup(
            jpGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGerenciarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNTombo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(jpGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpGerenciarLayout.createSequentialGroup()
                        .addComponent(jtfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpGerenciarLayout.createSequentialGroup()
                        .addComponent(jtfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)))
                .addGroup(jpGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcobStatusG, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(jpGerenciarLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jbInserir)
                .addGap(75, 75, 75)
                .addComponent(jbExcluir)
                .addGap(30, 30, 30)
                .addComponent(jbAlterar)
                .addGap(164, 164, 164)
                .addComponent(jBCancelar)
                .addGap(45, 45, 45)
                .addComponent(jbConfirmar)
                .addGap(82, 82, 82))
        );
        jpGerenciarLayout.setVerticalGroup(
            jpGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGerenciarLayout.createSequentialGroup()
                .addGroup(jpGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpGerenciarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6))
                    .addGroup(jpGerenciarLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jtfNTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpGerenciarLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jpGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLivros)
                            .addComponent(jLabel2))))
                .addGap(21, 21, 21)
                .addGroup(jpGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jtfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jcobStatusG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jpGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpGerenciarLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(jtfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jpGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbInserir)
                    .addComponent(jbExcluir)
                    .addComponent(jbAlterar)
                    .addGroup(jpGerenciarLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jpGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBCancelar)
                            .addComponent(jbConfirmar)))))
        );

        javax.swing.GroupLayout jpFundoLayout = new javax.swing.GroupLayout(jpFundo);
        jpFundo.setLayout(jpFundoLayout);
        jpFundoLayout.setHorizontalGroup(
            jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpGerenciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpFundoLayout.createSequentialGroup()
                        .addComponent(jlPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcobTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbPesquisar)
                        .addGap(58, 58, 58)
                        .addComponent(jcebStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcobStatusC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSPainelTabela, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jpFundoLayout.setVerticalGroup(
            jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSPainelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlPesquisar)
                    .addComponent(jcobTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar)
                    .addComponent(jcebStatus)
                    .addComponent(jcobStatusC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jpGerenciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLivroMouseClicked
        if (jtLivro.getSelectedRow() != -1) {
            ativarCampos();
            jtfNTombo.setText(jtLivro.getValueAt(jtLivro.getSelectedRow(), 0).toString());
            jtfTitulo.setText(jtLivro.getValueAt(jtLivro.getSelectedRow(), 1).toString());
            jtfAutor.setText(jtLivro.getValueAt(jtLivro.getSelectedRow(), 2).toString());
            jtfEdicao.setText(jtLivro.getValueAt(jtLivro.getSelectedRow(), 3).toString());
            jcobStatusG.setSelectedItem(jtLivro.getValueAt(jtLivro.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_jtLivroMouseClicked

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed

        if (verificarCampoPesquisa() == 0) {
            pesquisa = jtfPesquisar.getText();
            JOptionPane.showMessageDialog(null, "Selecionado index = " + jcobTipoPesquisa.getSelectedIndex() + " - " + jcobTipoPesquisa.getSelectedItem().toString());
            JOptionPane.showMessageDialog(rootPane, jcebStatus.isSelected());
            switch (jcobTipoPesquisa.getSelectedIndex()) {
                case 3:
                    // CASO SELECIONADO TODOS
                    if (jcebStatus.isSelected()) {
                        banco.executar("SELECT  exemplares.numeroTombo, livros.titulo, livros.autor,"
                                + "livros.edicao, exemplares.status FROM exemplares INNER JOIN livros ON"
                                + " livros.isbn = exemplares.isbn  AND exemplares.status = '" 
                                + jcobStatusC.getSelectedItem().toString() + "'");

                    } else {
                        banco.executar("SELECT  exemplares.numeroTombo, livros.titulo, livros.autor,"
                                + "livros.edicao, exemplares.status FROM exemplares INNER JOIN livros ON"
                                + " livros.isbn = exemplares.isbn");
                    }
                    break;
                case 2:
                    //CASO SELECIONADO O TITULO
                    if (jcebStatus.isSelected()) {
                        banco.executar("SELECT  exemplares.numeroTombo, livros.titulo, livros.autor,"
                                + "livros.edicao, exemplares.status FROM exemplares INNER JOIN livros ON"
                                + " livros.isbn = exemplares.isbn AND livros.titulo LIKE '%" + pesquisa + "%'"
                                + " AND exemplares.status = '" + jcobStatusC.getSelectedItem().toString() + "'");

                    } else {
                        banco.executar("SELECT  exemplares.numeroTombo, livros.titulo, livros.autor,"
                                + "livros.edicao, exemplares.status FROM exemplares INNER JOIN livros ON"
                                + " livros.isbn = exemplares.isbn AND livros.titulo LIKE '%" + pesquisa + "%'");
                    }
                    break;
                case 1:////CASO SELECIONADO O ISBN
                    if (jcebStatus.isSelected()) {//// CASO STATUS ESTEJA MARCADO
                        banco.executar("SELECT  exemplares.numeroTombo, livros.titulo, livros.autor,"
                                + "livros.edicao, exemplares.status FROM livros INNER JOIN exemplares ON"
                                + " livros.isbn = '" + pesquisa + "' AND exemplares.isbn = '" + pesquisa + "' AND "
                                + "exemplares.status = '" + jcobStatusC.getSelectedItem().toString() + "'");

                    } else {
                        banco.executar("SELECT  exemplares.numeroTombo, livros.titulo, livros.autor,"
                                + "livros.edicao, exemplares.status FROM livros INNER JOIN exemplares ON"
                                + " livros.isbn = '" + pesquisa + "' AND exemplares.isbn = '" + pesquisa + "'");
                    }
                    break;
                case 0: ////CASO SELECIONADO O NUMERO DE TOMBO
                    banco.executar("SELECT  exemplares.numeroTombo, livros.titulo, livros.autor,"
                            + "livros.edicao, exemplares.status FROM livros INNER JOIN exemplares ON"
                            + " livros.isbn = exemplares.isbn AND exemplares.numeroTombo ='" + pesquisa + "'");
                    break;
            }

            jbAlterar.setEnabled(true);
            jbExcluir.setEnabled(true);
            jbInserir.setEnabled(!true);
            jBCancelar.setEnabled(true);
            pesquisa = "";
            jtfPesquisar.setText("");
            preencherTabela();
            /*jtfNTombo.setText(String.valueOf(model.getNumeroDeTombo()));
            jtfTitulo.setText(model.getTitulo());
            jtfISBN.setText(model.getAutor());
            jtfAutor.setText(model.getEditora());
            jtfEdicao.setText(String.valueOf(model.getEdicao()));
            jcobStatusG.setSelectedItem(model.getStatus());*/

        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInserirActionPerformed
        flag = 1;
        jbConfirmar.setEnabled(true);
        jtfNTombo.setEnabled(true);
        jtfTitulo.setEnabled(true);
        jtfISBN.setEnabled(true);
        jtfAutor.setEnabled(true);
        jtfEdicao.setEnabled(true);
        jcobStatusG.setEnabled(true);
        jBCancelar.setEnabled(true);
    }//GEN-LAST:event_jbInserirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        flag = 2;
        jtLivro.setEnabled(false);
        jbConfirmar.setEnabled(true);
        jtfNTombo.setEnabled(!true);
        jtfTitulo.setEnabled(true);
        jtfISBN.setEnabled(true);
        jtfAutor.setEnabled(true);
        jtfEdicao.setEnabled(true);
        jcobStatusG.setEnabled(true);
        jBCancelar.setEnabled(true);
        jbAlterar.setEnabled(false);
        jbInserir.setEnabled(false);
        jbExcluir.setEnabled(false);
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        flag = 3;
        jbConfirmar.setEnabled(true);
        jtfNTombo.setEnabled(false);
        jtfTitulo.setEnabled(false);
        jtfISBN.setEnabled(false);
        jtfAutor.setEnabled(false);
        jtfEdicao.setEnabled(false);
        jcobStatusG.setEnabled(false);
        jBCancelar.setEnabled(true);
        jbAlterar.setEnabled(false);
        jbInserir.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbConfirmar.setEnabled(true);

    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed

        jbConfirmar.setEnabled(!true);
        jtfNTombo.setEnabled(!true);
        jtfTitulo.setEnabled(!true);
        jtfISBN.setEnabled(!true);
        jtfAutor.setEnabled(!true);
        jtfEdicao.setEnabled(!true);
        jcobStatusG.setEnabled(!true);
        jBCancelar.setEnabled(!true);
        jbInserir.setEnabled(true);
        jbAlterar.setEnabled(!true);
        jbExcluir.setEnabled(!true);
        limpaCampos();

        /*if(jtLivro.getSelectedRow()!= -1){
            jtLivro.setValueAt(txtNumeroDeTombo.getText(),jtLivro.getSelectedRow(), 0);
            jtLivro.setValueAt(txtAutor.getText(),jtLivro.getSelectedRow(), 1);
            jtLivro.setValueAt(txtEditora.getText(),jtLivro.getSelectedRow(), 2);

        }*/
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        int r = verificarCampos();
        /*livro.setPesquisa(jtfPesquisar.getText());
        BeansLivro model =  dao.buscaLivro(livro);*/
        if (flag == 1 && r != 1) {
            /*
            livro.setNumeroDeTombo((Integer.parseInt(txtNumeroDeTombo.getText())));
            livro.setTitulo(jtfTitulo.getText());
            livro.setAutor(jtfISBN.getText());
            livro.setEditora(jtfAutor.getText());
            livro.setEdicao((Integer.parseInt(jtfEdicao.getText())));
            livro.setStatus("Ativo");
             */

            //INCLUIR();
            limpaCampos();
            //preencherTabela("select * from livros order by numeroDeTombo");
            jtfNTombo.setEnabled(false);
            jtfTitulo.setEnabled(false);
            jtfISBN.setEnabled(false);
            jtfAutor.setEnabled(false);
            jtfEdicao.setEnabled(false);
            jcobStatusG.setEnabled(false);
            jbConfirmar.setEnabled(false);

        } else if (flag == 2 && r != 1) {
            /*
            livro.setNumeroDeTombo((Integer.parseInt(txtNumeroDeTombo.getText())));
            livro.setTitulo(jtfTitulo.getText());
            livro.setAutor(jtfISBN.getText());
            livro.setEditora(jtfAutor.getText());
            livro.setEdicao((Integer.parseInt(jtfEdicao.getText())));
            livro.setStatus((String)jcStatus.getSelectedItem());*/
            //EDITAR();
            limpaCampos();
            //preencherTabela("select * from livros order by numeroDeTombo");
            jtfNTombo.setEnabled(false);
            jtfTitulo.setEnabled(false);
            jtfISBN.setEnabled(false);
            jtfAutor.setEnabled(false);
            jtfEdicao.setEnabled(false);
            jcobStatusG.setEnabled(false);
            jbConfirmar.setEnabled(false);
            jbInserir.setEnabled(true);
        } else if (flag == 3 && r != 1) {

            //EXCLUIR();
            limpaCampos();

            //preencherTabela("select * from livros order by numeroDeTombo");
            jtfNTombo.setEnabled(false);
            jtfTitulo.setEnabled(false);
            jtfISBN.setEnabled(false);
            jtfAutor.setEnabled(false);
            jtfEdicao.setEnabled(false);
            jcobStatusG.setEnabled(false);
            jbConfirmar.setEnabled(false);
            jbInserir.setEnabled(true);
            jbAlterar.setEnabled(true);
            jbExcluir.setEnabled(true);

        }

    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jcebStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcebStatusActionPerformed
        if (jcebStatus.isSelected()) {
            jcobStatusC.setEnabled(true);
        } else {
            jcobStatusC.setEnabled(false);
        }
    }//GEN-LAST:event_jcebStatusActionPerformed

    private void jcobTipoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcobTipoPesquisaActionPerformed
        // TODO add your handling code here:
        if (jcobTipoPesquisa.getSelectedIndex() == 0) {
            jcebStatus.setEnabled(false);
            jcebStatus.setSelected(false);
            jcobStatusC.setEnabled(false);
        }else if(jcobTipoPesquisa.getSelectedIndex() == 3){
            jtfPesquisar.setText("");
        }else {
            jcebStatus.setEnabled(true);
            jcebStatus.setSelected(false);
            jcobStatusC.setEnabled(false);
        }
    }//GEN-LAST:event_jcobTipoPesquisaActionPerformed

    private void jtLivroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtLivroFocusLost
        // TODO add your handling code here:
        //desativarCampos();
    }//GEN-LAST:event_jtLivroFocusLost

    public void preencherTabela() {
        
        List<String[]> dados = new ArrayList<>();
        //DefaultTableModel modelo = (DefaultTableModel) jtLivro.getModel();
        String [] colunas = { "Nº Tombo","Título","Autor","Edição","Status" };
        try {
            if (banco.resultado.first()) {
                do {
                    dados.add(new String[]{banco.resultado.getString("numeroTombo"), banco.resultado.getString("titulo"),
                        banco.resultado.getString("autor"), banco.resultado.getString("edicao"), banco.resultado.getString("status")});
                    

                } while (banco.resultado.next());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Nenhum Resultado para esta pesquisa!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "SQL ERRO: " + ex);

        }
        
        DefaultTableModel modelo = new DefaultTableModel(dados.toArray(new String[dados.size()][]), colunas);
        
        jtLivro.setModel(modelo);
        jtLivro.setDefaultEditor(Object.class, null);
        TableColumn coluna = null;
        for (int i = 0; i < 5; i++) {
            coluna = jtLivro.getColumnModel().getColumn(i);
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
            }
        }
        banco.fechar(0);
    }

    @SuppressWarnings("Convert2Lambda")
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarExemplares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GerenciarExemplares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jSPainelTabela;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbInserir;
    private javax.swing.JButton jbLivros;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JCheckBox jcebStatus;
    private javax.swing.JComboBox<String> jcobStatusC;
    private javax.swing.JComboBox<String> jcobStatusG;
    private javax.swing.JComboBox<String> jcobTipoPesquisa;
    private javax.swing.JLabel jlPesquisar;
    private javax.swing.JPanel jpFundo;
    private javax.swing.JPanel jpGerenciar;
    private javax.swing.JTable jtLivro;
    private javax.swing.JTextField jtfAutor;
    private javax.swing.JTextField jtfEdicao;
    private javax.swing.JTextField jtfISBN;
    private javax.swing.JTextField jtfNTombo;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JTextField jtfTitulo;
    // End of variables declaration//GEN-END:variables
}
