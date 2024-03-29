/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.InstrutorController;
import Model.CadastroInstrutorModel;
import javax.swing.JOptionPane;

/**
 *
 * @author tylui
 */
public class CadastroInstrutores extends javax.swing.JFrame {

    /**
     * Creates new form CadastroInstrutores
     */
    int CodigoEditInstrutor = 0;
    boolean Editar = false;
    
    public CadastroInstrutores() {
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

        grupoSexoInstrutor = new javax.swing.ButtonGroup();
        Painel4 = new javax.swing.JPanel();
        jlNome = new javax.swing.JLabel();
        jtxNomeDadoInstrutor = new javax.swing.JTextField();
        jrMasculinoDadoInstrutor = new javax.swing.JRadioButton();
        jrFemininoDadoInstrutor = new javax.swing.JRadioButton();
        jtxCpfDadoInstrutor = new javax.swing.JFormattedTextField();
        jlCPF = new javax.swing.JLabel();
        jlRua = new javax.swing.JLabel();
        jtxRuaDadoInstrutor = new javax.swing.JTextField();
        jlBairro = new javax.swing.JLabel();
        jtxBairroDadoInstrutor = new javax.swing.JTextField();
        jtxNumeroDadoInstrutor = new javax.swing.JTextField();
        jlNumero = new javax.swing.JLabel();
        jlCidade = new javax.swing.JLabel();
        jtxCidadeDadoInstrutor = new javax.swing.JTextField();
        jcbEstadoDadoInstrutor = new javax.swing.JComboBox<>();
        jlEstado = new javax.swing.JLabel();
        jcbHorarioDadoInstrutor = new javax.swing.JComboBox<>();
        jlHorario = new javax.swing.JLabel();
        jbSalvarDadoInstrutor = new javax.swing.JButton();
        jbLimparDadoInstrutor = new javax.swing.JButton();
        jbSairDadoInstrutor = new javax.swing.JButton();
        jlSalario = new javax.swing.JLabel();
        jtxSalarioDadoInstrutor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Fabrica de Monstros - Cadastro do instrutor");

        jlNome.setText("Nome:");

        jtxNomeDadoInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxNomeDadoInstrutorActionPerformed(evt);
            }
        });

        grupoSexoInstrutor.add(jrMasculinoDadoInstrutor);
        jrMasculinoDadoInstrutor.setText("Masculino");

        grupoSexoInstrutor.add(jrFemininoDadoInstrutor);
        jrFemininoDadoInstrutor.setText("Feminino");
        jrFemininoDadoInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrFemininoDadoInstrutorActionPerformed(evt);
            }
        });

        try {
            jtxCpfDadoInstrutor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtxCpfDadoInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxCpfDadoInstrutorActionPerformed(evt);
            }
        });

        jlCPF.setText("CPF:");

        jlRua.setText("Rua: ");

        jtxRuaDadoInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxRuaDadoInstrutorActionPerformed(evt);
            }
        });

        jlBairro.setText("Bairro: ");

        jlNumero.setText("Número:");

        jlCidade.setText("Cidade:");

        jcbEstadoDadoInstrutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));

        jlEstado.setText("Estado:");

        jcbHorarioDadoInstrutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manha", "Tarde", "Noite", " " }));

        jlHorario.setText("Horário:");

        jbSalvarDadoInstrutor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbSalvarDadoInstrutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/salvar.png"))); // NOI18N
        jbSalvarDadoInstrutor.setText("Salvar ");
        jbSalvarDadoInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarDadoInstrutorActionPerformed(evt);
            }
        });

        jbLimparDadoInstrutor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbLimparDadoInstrutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/limpar.png"))); // NOI18N
        jbLimparDadoInstrutor.setText("Limpar campos");
        jbLimparDadoInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparDadoInstrutorActionPerformed(evt);
            }
        });

        jbSairDadoInstrutor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbSairDadoInstrutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/sair.png"))); // NOI18N
        jbSairDadoInstrutor.setText("Sair ");
        jbSairDadoInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairDadoInstrutorActionPerformed(evt);
            }
        });

        jlSalario.setText("Salário:");

        jtxSalarioDadoInstrutor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        javax.swing.GroupLayout Painel4Layout = new javax.swing.GroupLayout(Painel4);
        Painel4.setLayout(Painel4Layout);
        Painel4Layout.setHorizontalGroup(
            Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel4Layout.createSequentialGroup()
                        .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNome)
                            .addComponent(jlCPF))
                        .addGap(18, 18, 18)
                        .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel4Layout.createSequentialGroup()
                                .addComponent(jtxNomeDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrMasculinoDadoInstrutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrFemininoDadoInstrutor))
                            .addComponent(jtxCpfDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxRuaDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Painel4Layout.createSequentialGroup()
                        .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel4Layout.createSequentialGroup()
                                .addComponent(jbSalvarDadoInstrutor)
                                .addGap(18, 18, 18)
                                .addComponent(jbLimparDadoInstrutor)
                                .addGap(18, 18, 18)
                                .addComponent(jbSairDadoInstrutor)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel4Layout.createSequentialGroup()
                                .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlRua)
                                    .addGroup(Painel4Layout.createSequentialGroup()
                                        .addComponent(jlBairro)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxBairroDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jlNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxNumeroDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Painel4Layout.createSequentialGroup()
                                        .addComponent(jlHorario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbHorarioDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jlSalario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxSalarioDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Painel4Layout.createSequentialGroup()
                                        .addComponent(jlEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbEstadoDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Painel4Layout.createSequentialGroup()
                                        .addComponent(jlCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxCidadeDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(25, 25, 25))))
        );
        Painel4Layout.setVerticalGroup(
            Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jlNome))
                    .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrMasculinoDadoInstrutor)
                        .addComponent(jtxNomeDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrFemininoDadoInstrutor)))
                .addGap(18, 18, 18)
                .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCPF)
                    .addComponent(jtxCpfDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRua)
                    .addComponent(jtxRuaDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBairro)
                    .addComponent(jtxBairroDadoInstrutor)
                    .addComponent(jlNumero)
                    .addComponent(jtxNumeroDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCidade)
                    .addComponent(jtxCidadeDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEstado)
                    .addComponent(jcbEstadoDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHorario)
                    .addComponent(jcbHorarioDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSalario)
                    .addComponent(jtxSalarioDadoInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvarDadoInstrutor)
                    .addComponent(jbSairDadoInstrutor)
                    .addComponent(jbLimparDadoInstrutor))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxNomeDadoInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxNomeDadoInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxNomeDadoInstrutorActionPerformed

    private void jrFemininoDadoInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrFemininoDadoInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrFemininoDadoInstrutorActionPerformed

    private void jtxCpfDadoInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxCpfDadoInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxCpfDadoInstrutorActionPerformed

    private void jtxRuaDadoInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxRuaDadoInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxRuaDadoInstrutorActionPerformed

    private void jbSalvarDadoInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarDadoInstrutorActionPerformed
        // TODO add your handling code here:
        if (!Editar){
            if((!jtxNomeDadoInstrutor.getText().trim().equals(""))&&
                    (jrMasculinoDadoInstrutor.isSelected() || jrFemininoDadoInstrutor.isSelected())){
                CadastroInstrutorModel instrutor = new CadastroInstrutorModel();
                instrutor.setNomeInstrutor(jtxNomeDadoInstrutor.getText());
                if (jrMasculinoDadoInstrutor.isSelected())
                    instrutor.setSexoInstrutor(jrMasculinoDadoInstrutor.getText());
                if (jrFemininoDadoInstrutor.isSelected())
                    instrutor.setSexoInstrutor(jrFemininoDadoInstrutor.getText());
                instrutor.setCpfInstrutor(jtxCpfDadoInstrutor.getText());
                instrutor.setRuaInstrutor(jtxRuaDadoInstrutor.getText());
                instrutor.setBairroInstrutor(jtxBairroDadoInstrutor.getText());
                instrutor.setNumeroInstrutor(Integer.parseInt(jtxNumeroDadoInstrutor.getText()));
                instrutor.setCidadeInstrutor(jtxCidadeDadoInstrutor.getText());
                instrutor.setHorarioInstrutor((String)jcbHorarioDadoInstrutor.getSelectedItem());
                instrutor.setSalarioInstrutor(jtxSalarioDadoInstrutor.getText());
                instrutor.setEstadoInstrutor((String)jcbEstadoDadoInstrutor.getSelectedItem());
                InstrutorController controle = new InstrutorController();
                if(controle.inserirInstrutor(instrutor)){
                    JOptionPane.showMessageDialog(this, "Instrutor salvo com sucesso!");
                    jbLimparDadoInstrutorActionPerformed(evt);
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao salvar Instrutor!", 
                            "Retorno", JOptionPane.ERROR_MESSAGE);
                }       
           }else{
                JOptionPane.showMessageDialog(this, "Erro ao Cadastrar Instrutor! Campos Incompletos", 
                            "Retorno", JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            if((!jtxNomeDadoInstrutor.getText().trim().equals(""))&&
                    (jrMasculinoDadoInstrutor.isSelected() || jrFemininoDadoInstrutor.isSelected())){
                CadastroInstrutorModel instrutor = new CadastroInstrutorModel();
                instrutor.setCodigoInstrutor(CodigoEditInstrutor);
                instrutor.setNomeInstrutor(jtxNomeDadoInstrutor.getText());
                instrutor.setCpfInstrutor(jtxCpfDadoInstrutor.getText());
                instrutor.setRuaInstrutor(jtxRuaDadoInstrutor.getText());
                instrutor.setBairroInstrutor(jtxBairroDadoInstrutor.getText());
                instrutor.setNumeroInstrutor(Integer.parseInt(jtxNumeroDadoInstrutor.getText()));
                instrutor.setCidadeInstrutor(jtxCidadeDadoInstrutor.getText());
                instrutor.setSalarioInstrutor(jtxSalarioDadoInstrutor.getText());
                instrutor.setEstadoInstrutor((String)jcbEstadoDadoInstrutor.getSelectedItem());
                instrutor.setHorarioInstrutor((String)jcbHorarioDadoInstrutor.getSelectedItem());
                if (jrMasculinoDadoInstrutor.isSelected())
                    instrutor.setSexoInstrutor(jrMasculinoDadoInstrutor.getText());
                if (jrFemininoDadoInstrutor.isSelected())
                    instrutor.setSexoInstrutor(jrFemininoDadoInstrutor.getText());
                InstrutorController controle = new InstrutorController();
                if(controle.editarInstrutor(instrutor)){
                    JOptionPane.showMessageDialog(this, "Instrutor editado com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao Editar Instrutor!", 
                            "Retorno", JOptionPane.ERROR_MESSAGE);
                }       
           }else{
                JOptionPane.showMessageDialog(this, "Erro ao Cadastrar Instrutor! Campos Incompletos", 
                            "Retorno", JOptionPane.ERROR_MESSAGE);
            }
            dispose();
            InstrutoresView instrutor = new InstrutoresView();
            instrutor.setVisible(true);
            Editar = false;
            CodigoEditInstrutor = 0;
        }
    }//GEN-LAST:event_jbSalvarDadoInstrutorActionPerformed

    private void jbLimparDadoInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparDadoInstrutorActionPerformed
        // TODO add your handling code here:
        jtxNomeDadoInstrutor.setText("");
        grupoSexoInstrutor.clearSelection();
        jtxCpfDadoInstrutor.setText("");
        jtxRuaDadoInstrutor.setText("");
        jtxBairroDadoInstrutor.setText("");
        jtxNumeroDadoInstrutor.setText("");
        jtxCidadeDadoInstrutor.setText("");
        jtxSalarioDadoInstrutor.setText("");
    }//GEN-LAST:event_jbLimparDadoInstrutorActionPerformed

    private void jbSairDadoInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairDadoInstrutorActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Se você sair irá perder todos os dados informados, deseja continuar?")==0){
            dispose();
            InstrutoresView instrutor = new InstrutoresView();
            instrutor.setVisible(true);
        } 
        
    }//GEN-LAST:event_jbSairDadoInstrutorActionPerformed

    /**
     * @param args the command line arguments
     */
    void recebeDados(int CodigoInstrutor, boolean EditarInstrutor){
        CodigoEditInstrutor = CodigoInstrutor;
        Editar = EditarInstrutor;
        CadastroInstrutorModel instrutor = new CadastroInstrutorModel();
        instrutor.setCodigoInstrutor(CodigoEditInstrutor);
        InstrutorController controle = new InstrutorController();
        instrutor = controle.selecionarInstrutor(instrutor);
        if(instrutor != null){
            jtxNomeDadoInstrutor.setText(instrutor.getNomeInstrutor());
            jtxCpfDadoInstrutor.setText(instrutor.getCpfInstrutor());
            jtxRuaDadoInstrutor.setText(instrutor.getRuaInstrutor());
            jtxBairroDadoInstrutor.setText(instrutor.getBairroInstrutor());
            jtxNumeroDadoInstrutor.setText(String.valueOf(instrutor.getNumeroInstrutor()));
            jtxCidadeDadoInstrutor.setText(instrutor.getCidadeInstrutor());
            jtxSalarioDadoInstrutor.setText(instrutor.getSalarioInstrutor());
        }else{
            JOptionPane.showMessageDialog(this, "Instrutor não encontrado!", 
                        "Retorno", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel4;
    private javax.swing.ButtonGroup grupoSexoInstrutor;
    private javax.swing.JButton jbLimparDadoInstrutor;
    private javax.swing.JButton jbSairDadoInstrutor;
    private javax.swing.JButton jbSalvarDadoInstrutor;
    private javax.swing.JComboBox<String> jcbEstadoDadoInstrutor;
    private javax.swing.JComboBox<String> jcbHorarioDadoInstrutor;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlHorario;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlRua;
    private javax.swing.JLabel jlSalario;
    private javax.swing.JRadioButton jrFemininoDadoInstrutor;
    private javax.swing.JRadioButton jrMasculinoDadoInstrutor;
    private javax.swing.JTextField jtxBairroDadoInstrutor;
    private javax.swing.JTextField jtxCidadeDadoInstrutor;
    private javax.swing.JFormattedTextField jtxCpfDadoInstrutor;
    private javax.swing.JTextField jtxNomeDadoInstrutor;
    private javax.swing.JTextField jtxNumeroDadoInstrutor;
    private javax.swing.JTextField jtxRuaDadoInstrutor;
    private javax.swing.JFormattedTextField jtxSalarioDadoInstrutor;
    // End of variables declaration//GEN-END:variables
}
