/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Gonzalez
 */
public class BuscaCliente extends javax.swing.JFrame {

    /**
     * Creates new form BuscaCliente
     */
    public BuscaCliente() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTFBusca = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JToggleButton();
        jBSair = new javax.swing.JToggleButton();
        jCBBusca = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableBuscaCliente = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Busca Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca Cliente"));

        jLabel2.setText("Digite: Cidade, Endereço ou Nome");

        jTFBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBuscaActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.setName("btnNovo"); // NOI18N
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.setName("btnSair"); // NOI18N
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jCBBusca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "CPF", "Endereço", "Cidade" }));

        jLabel1.setText("Buscar por");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jCBBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTFBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar)
                    .addComponent(jBSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableBuscaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableBuscaCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBuscaActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        DaoCliente dClientes = new DaoCliente();
        Cliente clientes[] = null;
        if (!jTFBusca.getText().equals("")) {
            // Caso o usuário digite algum termo para a busca
            switch (jCBBusca.getSelectedIndex()){
                case 0:
                // Buscar por Nome
                try{
                    CarregarGrade(clientes = dClientes.buscarPorNome("%" + jTFBusca.getText() + "%"));
                }catch (Exception ex){
                    try {
                        JOptionPane.showMessageDialog(rootPane, "Erro.\nNão foi possível localizar o cadastro do cliente. Verifique o log abaixo: " + "\n\n" + ex);
                    } catch (Exception ex1) {
                        Logger.getLogger(ViewCliente.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
                break;
                case 1:
                // Buscar por CPF
                try{
                    CarregarGrade(clientes = dClientes.buscarPorCPF("%" + jTFBusca.getText() + "%"));
                }catch (Exception ex){
                    try {
                        JOptionPane.showMessageDialog(rootPane, "Erro.\nNão foi possível localizar o cadastro do cliente. Verifique o log abaixo: " + "\n\n" + ex);
                    } catch (Exception ex1) {
                        Logger.getLogger(ViewCliente.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
                break;
                case 2:
                // Buscar por endereço
                try{
                    CarregarGrade(clientes = dClientes.buscarPorEndereco("%" +  jTFBusca.getText() + "%"));
                }catch (Exception ex){
                    try {
                        JOptionPane.showMessageDialog(rootPane, "Erro.\nNão foi possível localizar o cadastro do cliente. Verifique o log abaixo: " + "\n\n" + ex);
                    } catch (Exception ex1) {
                        Logger.getLogger(ViewCliente.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
                break;
                case 3:
                // Buscar por Cidade
                try{
                    CarregarGrade(clientes = dClientes.buscarPorCidade("%" + jTFBusca.getText() + "%"));
                }catch (Exception ex){
                    try {
                        JOptionPane.showMessageDialog(rootPane, "Erro.\nNão foi possível localizar o cadastro do cliente. Verifique o log abaixo: " + "\n\n" + ex);
                    } catch (Exception ex1) {
                        Logger.getLogger(ViewCliente.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
                break;
            }
        } else {
            // Caso o usuário não digite nenhum termo para a busca, será feita a busca por todos os clientes
            try{
                CarregarGrade(clientes = dClientes.listarTodos());
            }catch (Exception ex){
                try {
                    JOptionPane.showMessageDialog(rootPane, "Erro.\nNão foi possível localizar o cadastro do cliente. Verifique o log abaixo: " + "\n\n" + ex);
                } catch (Exception ex1) {
                    Logger.getLogger(ViewCliente.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
        }

        this.ValidarBotoes();
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        if (jTListaClientes.getRowCount() == 0)
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente sair sem selecionar um cliente?", "Atenção", JOptionPane.YES_NO_OPTION) == 0)
        this.dispose();
        else
        jBSair.setSelected(false);
        else{
            this.dispose();
        }
    }//GEN-LAST:event_jBSairActionPerformed

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
            java.util.logging.Logger.getLogger(BuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jBBuscar;
    private javax.swing.JToggleButton jBSair;
    private javax.swing.JComboBox jCBBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFBusca;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableBuscaCliente;
    // End of variables declaration//GEN-END:variables
}
