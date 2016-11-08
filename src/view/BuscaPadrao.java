/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.TableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author Galleni
 */
public class BuscaPadrao extends javax.swing.JFrame {
    // Variables declaration - do not modify
    private javax.swing.JToggleButton jBBuscar;
    private javax.swing.JToggleButton jBSair;
    private javax.swing.JComboBox jCBBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBusca;
    private javax.swing.JTable jTLista;
    private String titulo = "Busca";
    // End of variables declaration
    
    /**
     * Creates new form BuscaPadrao
     */
    public BuscaPadrao() {
        initComponents();
    }
    
    public BuscaPadrao(Menu aThis, boolean b){
        initComponents();
    }

// <editor-fold defaultstate="collapsed" desc="Código do Formulário">                          
    private void initComponents() {
        
        jScrollPane1 = new javax.swing.JScrollPane();
        jTLista = new javax.swing.JTable();
        jBSair = new javax.swing.JToggleButton();
        jBBuscar = new javax.swing.JToggleButton();
        jTFBusca = new javax.swing.JTextField();
        jCBBusca = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }

            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTLista.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{}
        ));
        jTLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTLista);

        jBSair.setText("Sair");
        jBSair.setName("btnSair"); // NOI18N
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.setName("btnNovo"); // NOI18N
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTFBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBuscaActionPerformed(evt);
            }
        });
        
        jLabel2.setText("Digite o termo da busca:");

        jLabel1.setText("Buscar por");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(47, 47, 47))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jCBBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jTFBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCBBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBBuscar)
                                .addComponent(jBSair))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                        .addContainerGap())
        );
        
        pack();

        // Chama o método setPropriedades para setar as propriedades do formulário
        this.setPropriedades();
    }// </editor-fold>   

    // <editor-fold desc="Eventos do Formulário">
    private void jTFBuscaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.jBSairActionPerformed(null);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        this.ValidarBotoes();
        List<Object> object = null;
        try {
            CarregarGrade(object);
            this.ValidarBotoes();
        } catch (Exception ex) {
            Logger.getLogger(BuscaPadrao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTLista.getRowCount() == 0) {
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente sair sem selecionar uma linha?", "Atenção", JOptionPane.YES_NO_OPTION) == 0) {
                this.dispose();
            } else {
                jBSair.setSelected(false);
            }
        } else {
            this.dispose();
        }
    }

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO
    }

    private void jTListaMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO
    }

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
            java.util.logging.Logger.getLogger(BuscaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaPadrao().setVisible(true);
            }
        });
    }
    // </editor-fold>

    // <editor-fold desc="Métodos de Propriedades">
    public void setPropriedades() {
        // TODO
    }
    // </editor-fold>

    // <editor-fold desc="Métodos de Controle">
    public void ValidarBotoes() {
        jBBuscar.setSelected(false);
        jBSair.setSelected(false);

        if (jTLista.getRowCount() != 0) {
            jBSair.setText("Selecionar");
        } else {
            jBSair.setText("Sair");
        }
    }

    public void CarregarGrade(List<?> object) throws Exception {
        // TODO: Sobrecarregar o método na classe herdada
        TableModel dtm = new TableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        if (object != null) {
            for (Object c : object) {
                dtm.addRow(c);
            }
        }

        jTLista.setModel(dtm);
    }
    // </editor-fold>
}
