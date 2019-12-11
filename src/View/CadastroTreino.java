/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AlunoController;
import Controller.InstrutorController;
import Controller.TreinoController;
import Model.CadastroAlunoModel;
import Model.CadastroInstrutorModel;
import Model.CadastroTreinoModel;
import javax.swing.JOptionPane;

/**
 *
 * @author tylui
 */
public class CadastroTreino extends javax.swing.JFrame {

    /**
     * Creates new form CadastroTreino
     */
    int CodigoEditTreino = 0;
    boolean Editar = false;
    
    public CadastroTreino() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel5 = new javax.swing.JPanel();
        jlModalidade = new javax.swing.JLabel();
        jlDescricao = new javax.swing.JLabel();
        jlDuracao = new javax.swing.JLabel();
        jlFreqCardiaca = new javax.swing.JLabel();
        jlEsforco = new javax.swing.JLabel();
        jlGastoCalorico = new javax.swing.JLabel();
        jtxModalidade = new javax.swing.JTextField();
        jtxFreqCardiaca = new javax.swing.JTextField();
        jtxEsforco = new javax.swing.JTextField();
        jtxGastoCalorico = new javax.swing.JTextField();
        jtxDuracao = new javax.swing.JFormattedTextField();
        jbSalvarDadoTreino = new javax.swing.JButton();
        jbLimparDadoTreino = new javax.swing.JButton();
        jbSairDadoTreino = new javax.swing.JButton();
        jspDescricao = new javax.swing.JScrollPane();
        jtxDescricao = new javax.swing.JTextArea();
        jtxCodigoAluno = new javax.swing.JTextField();
        jlCodigoAluno = new javax.swing.JLabel();
        jlNomeAluno = new javax.swing.JLabel();
        jtxNomeAluno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Fabrica de Monstros - Cadastro de treino");

        jlModalidade.setText("Modalidade:");

        jlDescricao.setText("Descrição:");

        jlDuracao.setText("Duração (HH:mm):");

        jlFreqCardiaca.setText("Frequência Cardíaca Media (bpm):");

        jlEsforco.setText("Esforço:");

        jlGastoCalorico.setText("Gasto Calórico:");

        jtxModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxModalidadeActionPerformed(evt);
            }
        });

        jtxFreqCardiaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxFreqCardiacaActionPerformed(evt);
            }
        });

        jtxEsforco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxEsforcoActionPerformed(evt);
            }
        });

        jtxGastoCalorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxGastoCaloricoActionPerformed(evt);
            }
        });

        jtxDuracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jtxDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxDuracaoActionPerformed(evt);
            }
        });

        jbSalvarDadoTreino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbSalvarDadoTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/salvar.png"))); // NOI18N
        jbSalvarDadoTreino.setText("Salvar ");
        jbSalvarDadoTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarDadoTreinoActionPerformed(evt);
            }
        });

        jbLimparDadoTreino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbLimparDadoTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/limpar.png"))); // NOI18N
        jbLimparDadoTreino.setText("Limpar campos");
        jbLimparDadoTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparDadoTreinoActionPerformed(evt);
            }
        });

        jbSairDadoTreino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbSairDadoTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/sair.png"))); // NOI18N
        jbSairDadoTreino.setText("Sair ");
        jbSairDadoTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairDadoTreinoActionPerformed(evt);
            }
        });

        jspDescricao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtxDescricao.setColumns(20);
        jtxDescricao.setRows(5);
        jspDescricao.setViewportView(jtxDescricao);

        jtxCodigoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxCodigoAlunoActionPerformed(evt);
            }
        });
        jtxCodigoAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxCodigoAlunoKeyReleased(evt);
            }
        });

        jlCodigoAluno.setText("Código do Aluno:");

        jlNomeAluno.setText("Nome do Aluno:");

        jtxNomeAluno.setText("O nome sera preenchido de acordo com o codigo do aluno.");
        jtxNomeAluno.setEnabled(false);
        jtxNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxNomeAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel5Layout = new javax.swing.GroupLayout(Painel5);
        Painel5.setLayout(Painel5Layout);
        Painel5Layout.setHorizontalGroup(
            Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel5Layout.createSequentialGroup()
                        .addComponent(jbSalvarDadoTreino)
                        .addGap(18, 18, 18)
                        .addComponent(jbLimparDadoTreino)
                        .addGap(18, 18, 18)
                        .addComponent(jbSairDadoTreino))
                    .addGroup(Painel5Layout.createSequentialGroup()
                        .addComponent(jlDuracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jlEsforco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxEsforco, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel5Layout.createSequentialGroup()
                        .addComponent(jlFreqCardiaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxFreqCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel5Layout.createSequentialGroup()
                        .addComponent(jlModalidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel5Layout.createSequentialGroup()
                        .addComponent(jlCodigoAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxCodigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel5Layout.createSequentialGroup()
                        .addComponent(jlDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jspDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel5Layout.createSequentialGroup()
                        .addComponent(jlNomeAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel5Layout.createSequentialGroup()
                        .addComponent(jlGastoCalorico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxGastoCalorico, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        Painel5Layout.setVerticalGroup(
            Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigoAluno)
                    .addComponent(jtxCodigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomeAluno)
                    .addComponent(jtxNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlModalidade)
                    .addComponent(jtxModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel5Layout.createSequentialGroup()
                        .addComponent(jlDescricao)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel5Layout.createSequentialGroup()
                        .addComponent(jspDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDuracao)
                    .addComponent(jtxDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEsforco)
                    .addComponent(jtxEsforco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxFreqCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFreqCardiaca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGastoCalorico)
                    .addComponent(jtxGastoCalorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvarDadoTreino)
                    .addComponent(jbSairDadoTreino)
                    .addComponent(jbLimparDadoTreino))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Painel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxModalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxModalidadeActionPerformed

    private void jtxFreqCardiacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxFreqCardiacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxFreqCardiacaActionPerformed

    private void jtxEsforcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxEsforcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEsforcoActionPerformed

    private void jtxGastoCaloricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxGastoCaloricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxGastoCaloricoActionPerformed

    private void jtxDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxDuracaoActionPerformed

    private void jbSalvarDadoTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarDadoTreinoActionPerformed
        // TODO add your handling code here:
        if (!Editar){
            if((!jtxModalidade.getText().trim().equals("")) && (!jtxDescricao.getText().trim().equals("")) &&
                    (!jtxCodigoAluno.getText().trim().equals(""))){
                CadastroTreinoModel treino = new CadastroTreinoModel();
                treino.getIdaluno_fk().setCodigoAluno(Integer.parseInt(jtxCodigoAluno.getText()));
                treino.setModalidade(jtxModalidade.getText());
                treino.setDescricao(jtxDescricao.getText());
                treino.setDuracao(jtxDuracao.getText());
                treino.setEsforço(jtxEsforco.getText());
                treino.setFreqCardiaca(Float.parseFloat(jtxFreqCardiaca.getText()));
                treino.setGastoCalorico(Float.parseFloat(jtxGastoCalorico.getText()));
                TreinoController controle = new TreinoController();
                if(controle.inserirTreino(treino)){
                    JOptionPane.showMessageDialog(this, "Treino salvo com sucesso!");
                    jbLimparDadoTreinoActionPerformed(evt);
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao salvar Treino!", 
                            "Retorno", JOptionPane.ERROR_MESSAGE);
                }       
           }else{
                JOptionPane.showMessageDialog(this, "Erro ao Cadastrar Treino! Campos Incompletos", 
                            "Retorno", JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            if((!jtxModalidade.getText().trim().equals("")) && (!jtxCodigoAluno.getText().trim().equals("")) &&
                    (!jtxDescricao.getText().trim().equals(""))){
                CadastroTreinoModel treino = new CadastroTreinoModel();
                treino.setCodigoTreino(CodigoEditTreino);
                treino.setModalidade(jtxModalidade.getText());
                treino.setDescricao(jtxDescricao.getText());
                treino.setDuracao(jtxDuracao.getText());
                treino.setEsforço(jtxEsforco.getText());
                treino.setFreqCardiaca(Float.parseFloat(jtxFreqCardiaca.getText()));
                treino.setGastoCalorico(Float.parseFloat(jtxGastoCalorico.getText()));
                treino.getIdaluno_fk().setCodigoAluno(Integer.parseInt(jtxCodigoAluno.getText()));
                TreinoController controle = new TreinoController();
                if(controle.editarTreino(treino)){
                    JOptionPane.showMessageDialog(this, "Treino editado com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao Editar Treino!", 
                            "Retorno", JOptionPane.ERROR_MESSAGE);
                }       
           }else{
                JOptionPane.showMessageDialog(this, "Erro ao Cadastrar Treino! Campos Incompletos", 
                            "Retorno", JOptionPane.ERROR_MESSAGE);
            }
            dispose();
            TreinoView treino = new TreinoView();
            treino.setVisible(true);
            Editar = false;
            CodigoEditTreino = 0;
        }
    }//GEN-LAST:event_jbSalvarDadoTreinoActionPerformed

    private void jbLimparDadoTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparDadoTreinoActionPerformed
        // TODO add your handling code here:
        jtxDescricao.setText("");
        jtxModalidade.setText("");
        jtxDuracao.setText("");
        jtxEsforco.setText("");
        jtxFreqCardiaca.setText("");
        jtxGastoCalorico.setText("");
    }//GEN-LAST:event_jbLimparDadoTreinoActionPerformed

    private void jbSairDadoTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairDadoTreinoActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Se você sair irá perder todos os dados informados, deseja continuar?")==0){
            dispose();
            TreinoView treino = new TreinoView();
            treino.setVisible(true);
        }
    }//GEN-LAST:event_jbSairDadoTreinoActionPerformed

    private void jtxCodigoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxCodigoAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxCodigoAlunoActionPerformed

    private void jtxNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxNomeAlunoActionPerformed

    private void jtxCodigoAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxCodigoAlunoKeyReleased
        // TODO add your handling code here:
        if(!jtxCodigoAluno.getText().trim().equals("")){
            CadastroAlunoModel aluno = new CadastroAlunoModel();
            aluno.setCodigoAluno(Integer.parseInt(jtxCodigoAluno.getText()));
            AlunoController controle = new AlunoController();
            aluno = controle.selecionarAluno(aluno);
            if(aluno != null) {
                jtxNomeAluno.setText(aluno.getNomeAluno());
            }else{
                JOptionPane.showMessageDialog(this, "Aluno não encontrado favor digitar um código valido!", 
                            "Retorno", JOptionPane.ERROR_MESSAGE);
            }
        }else{
                JOptionPane.showMessageDialog(this, "O campo não possui valor!", 
                            "Retorno", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jtxCodigoAlunoKeyReleased

    /**
     * @param args the command line arguments
     */
    
    void recebeDados(int CodigoTreino, boolean EditarTreino){
        CodigoEditTreino = CodigoTreino;
        Editar = EditarTreino;
        CadastroTreinoModel treino = new CadastroTreinoModel();
        treino.setCodigoTreino(CodigoEditTreino);
        TreinoController controle = new TreinoController();
        treino = controle.selecionarTreino(treino);
        if(treino != null){
            jtxCodigoAluno.setText(String.valueOf(treino.getIdaluno_fk().getCodigoAluno()));
            jtxNomeAluno.setText(treino.getIdaluno_fk().getNomeAluno());
            jtxModalidade.setText(treino.getModalidade());
            jtxDescricao.setText(treino.getDescricao());
            jtxDuracao.setText(treino.getDuracao());
            jtxEsforco.setText(treino.getEsforço());
            jtxFreqCardiaca.setText(String.valueOf(treino.getFreqCardiaca()));
            jtxGastoCalorico.setText(String.valueOf(treino.getGastoCalorico()));
        }else{
            JOptionPane.showMessageDialog(this, "Treino não encontrado!", 
                        "Retorno", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel5;
    private javax.swing.JButton jbLimparDadoTreino;
    private javax.swing.JButton jbSairDadoTreino;
    private javax.swing.JButton jbSalvarDadoTreino;
    private javax.swing.JLabel jlCodigoAluno;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlDuracao;
    private javax.swing.JLabel jlEsforco;
    private javax.swing.JLabel jlFreqCardiaca;
    private javax.swing.JLabel jlGastoCalorico;
    private javax.swing.JLabel jlModalidade;
    private javax.swing.JLabel jlNomeAluno;
    private javax.swing.JScrollPane jspDescricao;
    private javax.swing.JTextField jtxCodigoAluno;
    private javax.swing.JTextArea jtxDescricao;
    private javax.swing.JFormattedTextField jtxDuracao;
    private javax.swing.JTextField jtxEsforco;
    private javax.swing.JTextField jtxFreqCardiaca;
    private javax.swing.JTextField jtxGastoCalorico;
    private javax.swing.JTextField jtxModalidade;
    private javax.swing.JTextField jtxNomeAluno;
    // End of variables declaration//GEN-END:variables
}
