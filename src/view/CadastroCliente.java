/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.DaoCliente;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Telefone;

/**
 *
 * @author Gonzalez
 */
public class CadastroCliente extends javax.swing.JFrame {
    int btnSalvar = 0, btnNovo = 0;
    /**
     * Creates new form CadastroCorretor
     */
    
    public CadastroCliente() {
        initComponents();
        this.ValidarBotoes(0);
        this.setLocationRelativeTo(null);
        //setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    /* TERMINAR A PROGRAMAÇÃO DA ORDEM DE BOTÕES*/
    public void ValidarBotoes(int funcao){
    //FUNÇÃO  = 0 TELA LIMPA
    //FUNÇÃO = 1 NOVO CADASTRO
        
        switch(funcao){
            case 0: //TELA LIMPA, SEM CADASTRO
            {
                LimpaCampos();
                BloqueiaDesbloqueiaCampos(0);
                btnSalvar = 0;
                btnNovo = 0;
                jBTNNovo.setEnabled(true);
                jBTNNovo.setSelected(true);
		//jBTNSalvar.setSelected(false);
                jBTNSalvar.setEnabled(false);
                jBTNCancelar.setEnabled(true);
                jBTNCancelar.setSelected(true);
                break;
            }
            case 1: //TELA LIBERADA PARA NOVO CADASTRO
            {
                LimpaCampos();
                BloqueiaDesbloqueiaCampos(1);
                jTFCodigo.setText("NOVO");
                jBTNNovo.setText("Limpar");
                jBTNNovo.setEnabled(true);
                jBTNNovo.setSelected(true);                
                btnSalvar = 1;
                btnNovo = 1;
                jBTNSalvar.setEnabled(true);
                jBTNSalvar.setSelected(true);
                jBTNCancelar.setEnabled(true);
                jBTNCancelar.setSelected(true);
                jTFNome.requestFocus();
                break;
            }
        }	
    }
    
    public void LimpaCampos(){
        jTFNome.setText(null);
        jTFCidade.setText(null);
        jCBEstado.setSelectedItem(null);
        jTFEndereco.setText(null);
        jTFNumero.setText(null);
        jTFBairro.setText(null);
        jFTFCPF.setText(null);
        jFTFRG.setText(null);
        jTFEmail.setText(null);
        jFTFTelefone.setText(null);
        jCBTipo.setSelectedItem(null);
    }
    
    public void BloqueiaDesbloqueiaCampos(int funcao){
        //FUNÇÃO = 0, BLOQUEIA OS CAMPOS
        //FUNÇÃO = 1, DESBLOQUEIA OS CAMPOS
        if (funcao == 0){
            //BLOQUEIA CAMPOS
            jTFNome.setEditable(false);
            jTFCidade.setEditable(false);
            jCBEstado.setEnabled(false);
            jTFEndereco.setEditable(false);
            jTFNumero.setEditable(false);
            jTFBairro.setEditable(false);
            jFTFCPF.setEditable(false);
            jFTFRG.setEditable(false);
            jTFEmail.setEditable(false);
            jFTFTelefone.setEditable(false);
            jCBTipo.setEnabled(false);
        }else{
            //DESBLOQUEIA CAMPOS
            jTFNome.setEditable(true);
            jTFCidade.setEditable(true);
            jCBEstado.setEnabled(true);
            jTFEndereco.setEditable(true);
            jTFNumero.setEditable(true);
            jTFBairro.setEditable(true);
            jFTFCPF.setEditable(true);
            jFTFRG.setEditable(true);
            jTFEmail.setEditable(true);
            jFTFTelefone.setEditable(true);
            jCBTipo.setEnabled(true);
        }
    }

    CadastroCliente(Menu aThis, boolean b) {
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

        jBTNSalvar = new javax.swing.JButton();
        jBTNCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTFEmail = new javax.swing.JTextField();
        jFTFRG = new javax.swing.JFormattedTextField();
        jFTFTelefone = new javax.swing.JFormattedTextField();
        jFTFCPF = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jCBEstado = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFBairro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFEndereco = new javax.swing.JTextField();
        jTFNumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jCBTipo = new javax.swing.JComboBox();
        jBTNNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setBackground(new java.awt.Color(239, 239, 239));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jBTNSalvar.setText("Salvar");
        jBTNSalvar.setIconTextGap(10);
        jBTNSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNSalvarActionPerformed(evt);
            }
        });

        jBTNCancelar.setText("Cancelar");
        jBTNCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBTNCancelar.setIconTextGap(10);
        jBTNCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jTFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmailActionPerformed(evt);
            }
        });

        try {
            jFTFRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFTFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFTelefoneActionPerformed(evt);
            }
        });

        try {
            jFTFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setText("RG:");

        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel16.setText("Estado:");

        jLabel9.setText("Bairro:");

        jLabel10.setText("Telefone:");

        jTFCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCidadeActionPerformed(evt);
            }
        });

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jTFBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBairroActionPerformed(evt);
            }
        });

        jLabel1.setText("Código do Cliente:");

        jTFCodigo.setEnabled(false);

        jLabel2.setText("Nome:");

        jLabel3.setText("Cidade:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("CPF:");

        jLabel6.setText("Número:");

        jLabel7.setText("Email:");

        jTFEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEnderecoActionPerformed(evt);
            }
        });

        jTFNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumeroActionPerformed(evt);
            }
        });

        jLabel11.setText("Tipo:");

        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Celular", "Empresarial", "Residêncial" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFEmail)
                    .addComponent(jTFBairro)
                    .addComponent(jTFNome)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTFEndereco)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFCidade))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jFTFCPF))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jFTFRG, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(248, 248, 248)
                                .addComponent(jLabel6))
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTFCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(159, 159, 159)
                                .addComponent(jLabel11)))
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jFTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCBTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel16))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBTNNovo.setText("Novo");
        jBTNNovo.setIconTextGap(10);
        jBTNNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBTNNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBTNSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTNCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTNCancelar)
                    .addComponent(jBTNSalvar)
                    .addComponent(jBTNNovo))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair?", "Atenção", JOptionPane.YES_NO_OPTION) == 0)
            this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jBTNCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair?", "Atenção", JOptionPane.YES_NO_OPTION) == 0)
        this.dispose();
    }//GEN-LAST:event_jBTNCancelarActionPerformed

    private void jBTNSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNSalvarActionPerformed
        if(btnSalvar == 0){
            //HABILITA CAMPOS
            this.ValidarBotoes(1);
        }else if (btnSalvar == 1){   
            Cliente cliente = null;
                try {
                    cliente = new Cliente();
                    cliente.setNome(jTFNome.getText());
                    cliente.setCidade(jTFCidade.getText());
                    cliente.setEstado(jCBEstado.getSelectedItem().toString());
                    cliente.setEndereco(jTFEndereco.getText());
                    cliente.setNumero(jTFNumero.getText());
                    cliente.setBairro(jTFBairro.getText());
                    cliente.setCpf(jFTFCPF.getText());
                    cliente.setRg(jFTFRG.getText());
                    cliente.setEmail(jTFEmail.getText());

                    Telefone telefone = new Telefone();
                    telefone.setTelefone(jFTFTelefone.getText());
                    telefone.setTipo(jCBTipo.getSelectedItem().toString());
                    telefone.setPessoa(cliente);
                    cliente.getTelefones().add(telefone);

                    DaoCliente dCliente = new DaoCliente();
                    dCliente.persistir(cliente);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "Houve um erro ao tentar criar o cadastro de um novo cliente. Verifique o log abaixo: " + "\n\n" + ex);
                    //Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
                    this.ValidarBotoes(0);
                }
        }
    }//GEN-LAST:event_jBTNSalvarActionPerformed

    private void jFTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFTelefoneActionPerformed

    private void jTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmailActionPerformed

    private void jTFNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNumeroActionPerformed

    private void jTFBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBairroActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCidadeActionPerformed

    private void jTFEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEnderecoActionPerformed

    private void jBTNNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNNovoActionPerformed
        // TODO add your handling code here:
        this.ValidarBotoes(1);
        if(btnNovo == 0){
            this.ValidarBotoes(0);
        }
    }//GEN-LAST:event_jBTNNovoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTNCancelar;
    private javax.swing.JButton jBTNNovo;
    private javax.swing.JButton jBTNSalvar;
    private javax.swing.JComboBox jCBEstado;
    private javax.swing.JComboBox jCBTipo;
    private javax.swing.JFormattedTextField jFTFCPF;
    private javax.swing.JFormattedTextField jFTFRG;
    private javax.swing.JFormattedTextField jFTFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFEndereco;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNumero;
    // End of variables declaration//GEN-END:variables


}