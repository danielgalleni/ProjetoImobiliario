/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.DaoFuncionario;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Telefone;

/**
 *
 * @author Gonzalez
 */
public class CadastroFuncionario extends javax.swing.JFrame {
    int btnSalvar = 0, btnNovo = 0;
    /**
     * Creates new form CadastroCorretor
     */

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
            jCBCargo.setEnabled(false);
            jCBSetor.setEnabled(false);
            jCBHora_Entrada.setEnabled(false);
            jCBHora_Saida.setEnabled(false);
            jTFSalario.setEditable(false);
            jBTNCadastro_Cargo.setEnabled(false);
            jBTNCadastrar_Setor.setEnabled(false);
            jBTNCadastrar_Hora_Entrada.setEnabled(false);
            jBTNCadastrar_Hora_Saida.setEnabled(false);
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
            jCBCargo.setEnabled(true);
            jCBSetor.setEnabled(true);
            jCBHora_Entrada.setEnabled(true);
            jCBHora_Saida.setEnabled(true);
            jTFSalario.setEditable(true);
            jBTNCadastro_Cargo.setEnabled(true);
            jBTNCadastrar_Setor.setEnabled(true);
            jBTNCadastrar_Hora_Entrada.setEnabled(true);
            jBTNCadastrar_Hora_Saida.setEnabled(true);
        }
    }
    public CadastroFuncionario() {
        initComponents();
        this.ValidarBotoes(0);
    }

    CadastroFuncionario(Menu aThis, boolean b) {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTFCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCBEstado = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jTFBairro = new javax.swing.JTextField();
        jTFNumero = new javax.swing.JTextField();
        jTFEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFTFCPF = new javax.swing.JFormattedTextField();
        jFTFRG = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jFTFTelefone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jCBTipo = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jBTNCancelar = new javax.swing.JButton();
        jBTNSalvar = new javax.swing.JButton();
        jBTNNovo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jCBCargo = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jBTNCadastro_Cargo = new javax.swing.JButton();
        jBTNCadastrar_Setor = new javax.swing.JButton();
        jCBSetor = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jCBHora_Entrada = new javax.swing.JComboBox();
        jBTNCadastrar_Hora_Entrada = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jCBHora_Saida = new javax.swing.JComboBox();
        jBTNCadastrar_Hora_Saida = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTFSalario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Funcionário");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jTFCodigo.setEditable(false);

        jLabel1.setText("Código Funcionário:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Cidade:");

        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel16.setText("Estado:");

        jTFBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBairroActionPerformed(evt);
            }
        });

        jLabel5.setText("Número:");

        jLabel6.setText("Endereço:");

        jLabel4.setText("Bairro:");

        try {
            jFTFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFTFRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setText("RG:");

        jLabel9.setText("CPF:");

        jLabel17.setText("E-mail:");

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

        jLabel7.setText("Telefone:");

        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Celular", "Empresarial", "Residêncial" }));

        jLabel18.setText("Tipo:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFEmail)
                    .addComponent(jTFBairro)
                    .addComponent(jTFNome)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFEndereco))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jFTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFTFRG, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel17)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jFTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jBTNCancelar.setText("Cancelar");
        jBTNCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNCancelarActionPerformed(evt);
            }
        });

        jBTNSalvar.setText("Salvar");
        jBTNSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNSalvarActionPerformed(evt);
            }
        });

        jBTNNovo.setText("Novo");
        jBTNNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBTNNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBTNSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBTNCancelar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTNSalvar)
                    .addComponent(jBTNCancelar)
                    .addComponent(jBTNNovo))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Cadastro de Dados Pessoais", jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Empresariais"));

        jCBCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Cargo:");

        jBTNCadastro_Cargo.setText("Cadastrar Cargo");

        jBTNCadastrar_Setor.setText("Cadastrar Setor");
        jBTNCadastrar_Setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNCadastrar_SetorActionPerformed(evt);
            }
        });

        jCBSetor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSetorActionPerformed(evt);
            }
        });

        jLabel12.setText("Setor:");

        jCBHora_Entrada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBTNCadastrar_Hora_Entrada.setText("Cadastrar Hora Entrada");
        jBTNCadastrar_Hora_Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNCadastrar_Hora_EntradaActionPerformed(evt);
            }
        });

        jLabel13.setText("Hora de Entrada:");

        jCBHora_Saida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBTNCadastrar_Hora_Saida.setText("Cadastrar Hora Saída");
        jBTNCadastrar_Hora_Saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNCadastrar_Hora_SaidaActionPerformed(evt);
            }
        });

        jLabel14.setText("Hora de Saída:");

        jLabel15.setText("Salário:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCBHora_Saida, 0, 270, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBSetor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBHora_Entrada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBTNCadastro_Cargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBTNCadastrar_Setor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBTNCadastrar_Hora_Entrada, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBTNCadastrar_Hora_Saida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jTFSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTNCadastro_Cargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTNCadastrar_Setor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBHora_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTNCadastrar_Hora_Entrada))
                .addGap(13, 13, 13)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBHora_Saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTNCadastrar_Hora_Saida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTFSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cadastro de Dados Empresariais", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBairroActionPerformed

    private void jFTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFTelefoneActionPerformed

    private void jBTNCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair?", "Atenção", JOptionPane.YES_NO_OPTION) == 0)
        this.dispose();
    }//GEN-LAST:event_jBTNCancelarActionPerformed

    private void jBTNSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNSalvarActionPerformed
        if(btnSalvar == 0){
            //HABILITA CAMPOS
            this.ValidarBotoes(1);
        }else if (btnSalvar == 1){   
            Funcionario funcionario = null;
            try {
                funcionario = new Funcionario();
                funcionario.setNome(jTFNome.getText());
                funcionario.setCidade(jTFCidade.getText());
                funcionario.setEstado(jCBEstado.getSelectedItem().toString());
                funcionario.setBairro(jTFBairro.getText());
                funcionario.setEndereco(jTFEndereco.getText());
                funcionario.setNumero(jTFNumero.getText());
                funcionario.setCpf(jFTFCPF.getText());
                funcionario.setRg(jFTFRG.getText());
                funcionario.setEmail(jTFEmail.getText());            
                Telefone telefone = new Telefone();
                telefone.setTelefone(jFTFTelefone.getText());
                telefone.setTipo(jCBTipo.getSelectedItem().toString());
                funcionario.getTelefones().add(telefone);

                //CONTINUAR CADASTROS DE DADOS EMPRESARIAIS

                DaoFuncionario dFuncionario = new DaoFuncionario();
                dFuncionario.persistir(funcionario);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Houve um erro ao tentar criar o cadastro de um novo funcionário. Verifique o log abaixo: " + "\n\n" + ex);
                //Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                this.ValidarBotoes(0);
            }
        }
    }//GEN-LAST:event_jBTNSalvarActionPerformed

    private void jBTNCadastrar_SetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNCadastrar_SetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTNCadastrar_SetorActionPerformed

    private void jCBSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSetorActionPerformed

    private void jBTNCadastrar_Hora_EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNCadastrar_Hora_EntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTNCadastrar_Hora_EntradaActionPerformed

    private void jBTNCadastrar_Hora_SaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNCadastrar_Hora_SaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTNCadastrar_Hora_SaidaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTNCadastrar_Hora_Entrada;
    private javax.swing.JButton jBTNCadastrar_Hora_Saida;
    private javax.swing.JButton jBTNCadastrar_Setor;
    private javax.swing.JButton jBTNCadastro_Cargo;
    private javax.swing.JButton jBTNCancelar;
    private javax.swing.JButton jBTNNovo;
    private javax.swing.JButton jBTNSalvar;
    private javax.swing.JComboBox jCBCargo;
    private javax.swing.JComboBox jCBEstado;
    private javax.swing.JComboBox jCBHora_Entrada;
    private javax.swing.JComboBox jCBHora_Saida;
    private javax.swing.JComboBox jCBSetor;
    private javax.swing.JComboBox jCBTipo;
    private javax.swing.JFormattedTextField jFTFCPF;
    private javax.swing.JFormattedTextField jFTFRG;
    private javax.swing.JFormattedTextField jFTFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFEndereco;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFSalario;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables

    private void formWindowClosing(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
