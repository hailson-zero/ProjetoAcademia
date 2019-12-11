/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.InstrutorController;
import Model.CadastroInstrutorModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tylui
 */
public class InstrutoresView extends javax.swing.JFrame {

    /**
     * Creates new form InstrutoresView
     */
    private static int id = 1;
    private int linha = 0;
    private int CodigoEdit = 0;
    private boolean Editar = true;
    
    public InstrutoresView() {
        initComponents();
        jbEditarInstrutor.setEnabled(false);
        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel2 = new javax.swing.JPanel();
        jbCancelarInstrutor = new javax.swing.JButton();
        jbNovoInstrutor = new javax.swing.JButton();
        jbEditarInstrutor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaInstrutor = new javax.swing.JTable();
        PainelPesquisa = new javax.swing.JPanel();
        jtxPesquisaInstrutor = new javax.swing.JTextField();
        jbPesquisarInstrutor = new javax.swing.JButton();
        Lampada = new javax.swing.JLabel();
        Warning = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenu = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiAluno = new javax.swing.JMenuItem();
        jmiInstrutores = new javax.swing.JMenuItem();
        jmiTreinos = new javax.swing.JMenuItem();
        jmiEquipamentos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Fabrica de Monstros - Dados dos Instrutores");
        setResizable(false);

        javax.swing.GroupLayout Painel2Layout = new javax.swing.GroupLayout(Painel2);
        Painel2.setLayout(Painel2Layout);
        Painel2Layout.setHorizontalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Painel2Layout.setVerticalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        jbCancelarInstrutor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbCancelarInstrutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/cancelar.png"))); // NOI18N
        jbCancelarInstrutor.setText("Cancelar ");
        jbCancelarInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarInstrutorActionPerformed(evt);
            }
        });

        jbNovoInstrutor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbNovoInstrutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/novo.png"))); // NOI18N
        jbNovoInstrutor.setText("Novo ");
        jbNovoInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoInstrutorActionPerformed(evt);
            }
        });

        jbEditarInstrutor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbEditarInstrutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/editar.png"))); // NOI18N
        jbEditarInstrutor.setText("Editar ");
        jbEditarInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarInstrutorActionPerformed(evt);
            }
        });

        TabelaInstrutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Sexo", "CPF", "Logadouro", "Bairro", "Numero", "Cidade", "Horario", "Salário", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaInstrutor.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabelaInstrutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaInstrutorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaInstrutor);
        if (TabelaInstrutor.getColumnModel().getColumnCount() > 0) {
            TabelaInstrutor.getColumnModel().getColumn(4).setResizable(false);
            TabelaInstrutor.getColumnModel().getColumn(6).setResizable(false);
        }

        PainelPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        PainelPesquisa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbPesquisarInstrutor.setText("Pesquisar");
        jbPesquisarInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarInstrutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelPesquisaLayout = new javax.swing.GroupLayout(PainelPesquisa);
        PainelPesquisa.setLayout(PainelPesquisaLayout);
        PainelPesquisaLayout.setHorizontalGroup(
            PainelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxPesquisaInstrutor, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbPesquisarInstrutor))
        );
        PainelPesquisaLayout.setVerticalGroup(
            PainelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPesquisaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxPesquisaInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisarInstrutor))
                .addContainerGap())
        );

        Lampada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/alerta.png"))); // NOI18N

        Warning.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Warning.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Voce no momento esta \nno cadastro dos\ninstrutores");
        Warning.setViewportView(jTextArea1);

        jmCadastro.setText("Cadastro");

        jmiAluno.setText("Alunos");
        jmiAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlunoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiAluno);

        jmiInstrutores.setText("Instrutores");
        jmiInstrutores.setEnabled(false);
        jmCadastro.add(jmiInstrutores);

        jmiTreinos.setText("Treinos");
        jmiTreinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTreinosActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiTreinos);

        jmiEquipamentos.setText("Equipamentos");
        jmiEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEquipamentosActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiEquipamentos);

        jMenu.add(jmCadastro);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNovoInstrutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEditarInstrutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCancelarInstrutor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PainelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lampada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Warning, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14)
                .addComponent(Painel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PainelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lampada)
                                    .addComponent(Warning, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbNovoInstrutor)
                            .addComponent(jbEditarInstrutor)
                            .addComponent(jbCancelarInstrutor)))
                    .addComponent(Painel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlunoActionPerformed
        // TODO add your handling code here:
        AlunoView aluno = new AlunoView();
        aluno.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmiAlunoActionPerformed

    private void jbCancelarInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarInstrutorActionPerformed
        // TODO add your handling code here:
        dispose();
        Principal inicio = new Principal();
        inicio.setVisible(true);
    }//GEN-LAST:event_jbCancelarInstrutorActionPerformed

    private void jmiTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTreinosActionPerformed
        // TODO add your handling code here:
        TreinoView treino = new TreinoView();
        treino.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmiTreinosActionPerformed

    private void jmiEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEquipamentosActionPerformed
        // TODO add your handling code here:
        EquipamentosView equipamentos = new EquipamentosView();
        equipamentos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmiEquipamentosActionPerformed

    private void jbNovoInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoInstrutorActionPerformed
        // TODO add your handling code here:
        dispose();
        CadastroInstrutores newInstrutor = new CadastroInstrutores();
        newInstrutor.setVisible(true);
    }//GEN-LAST:event_jbNovoInstrutorActionPerformed

    private void jbPesquisarInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarInstrutorActionPerformed
        // TODO add your handling code here:
        if (!jtxPesquisaInstrutor.getText().trim().equals("")){
            CadastroInstrutorModel instrutor = new CadastroInstrutorModel();
            instrutor.setNomeInstrutor(jtxPesquisaInstrutor.getText());
            InstrutorController controller = new InstrutorController();
            ArrayList<CadastroInstrutorModel> lista = controller.selecionarTodosNomesInstrutores(instrutor);
            if(!lista.isEmpty()){
                DefaultTableModel modelo = (DefaultTableModel)TabelaInstrutor.getModel();
                modelo.setRowCount(0);
                for(CadastroInstrutorModel i: lista){
                    modelo.addRow(new String[]{
                        String.valueOf(i.getCodigoInstrutor()),
                        i.getNomeInstrutor(),
                        i.getSexoInstrutor(),
                        i.getCpfInstrutor(),
                        i.getRuaInstrutor(),
                        i.getBairroInstrutor(),
                        String.valueOf(i.getNumeroInstrutor()),
                        i.getCidadeInstrutor(),
                        i.getHorarioInstrutor(),
                        i.getSalarioInstrutor(),
                        i.getEstadoInstrutor()
                    });
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao Pesquisar", 
                            "Retorno", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbPesquisarInstrutorActionPerformed

    private void TabelaInstrutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaInstrutorMouseClicked
        // TODO add your handling code here:
        linha = TabelaInstrutor.getSelectedRow();
        jbEditarInstrutor.setEnabled(true);
        CodigoEdit = Integer.parseInt((String)TabelaInstrutor.getValueAt(linha, 0));
    }//GEN-LAST:event_TabelaInstrutorMouseClicked

    private void jbEditarInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarInstrutorActionPerformed
        // TODO add your handling code here:
        dispose();
        CadastroInstrutores editeInstrutor = new CadastroInstrutores();
        editeInstrutor.setVisible(true);
        editeInstrutor.recebeDados(CodigoEdit, Editar);
    }//GEN-LAST:event_jbEditarInstrutorActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void atualizarTabela(){
        InstrutorController instrutor = new InstrutorController();
        ArrayList<CadastroInstrutorModel> lista = instrutor.selecionarTodosInstrutores();
        if(!lista.isEmpty()){
            DefaultTableModel modelo = (DefaultTableModel)TabelaInstrutor.getModel();
            modelo.setRowCount(0);
            for(CadastroInstrutorModel i: lista){
                modelo.addRow(new String[]{
                    String.valueOf(i.getCodigoInstrutor()),
                    i.getNomeInstrutor(),
                    i.getSexoInstrutor(),
                    i.getCpfInstrutor(),
                    i.getRuaInstrutor(),
                    i.getBairroInstrutor(),
                    String.valueOf(i.getNumeroInstrutor()),
                    i.getCidadeInstrutor(),
                    i.getHorarioInstrutor(),
                    i.getSalarioInstrutor(),
                    i.getEstadoInstrutor()
                });
            }
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lampada;
    private javax.swing.JPanel Painel2;
    private javax.swing.JPanel PainelPesquisa;
    private javax.swing.JTable TabelaInstrutor;
    private javax.swing.JScrollPane Warning;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbCancelarInstrutor;
    private javax.swing.JButton jbEditarInstrutor;
    private javax.swing.JButton jbNovoInstrutor;
    private javax.swing.JButton jbPesquisarInstrutor;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenuItem jmiAluno;
    private javax.swing.JMenuItem jmiEquipamentos;
    private javax.swing.JMenuItem jmiInstrutores;
    private javax.swing.JMenuItem jmiTreinos;
    private javax.swing.JTextField jtxPesquisaInstrutor;
    // End of variables declaration//GEN-END:variables
}
