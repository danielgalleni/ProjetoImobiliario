/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.TableModel;
import java.lang.reflect.Field;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Galleni
 */
public abstract class BuscaPrincipal extends TelaPrincipal {

    public BuscaPrincipal() {
    }

    public BuscaPrincipal(Menu aThis, boolean b) {
        super(aThis, b);
    }

    // <editor-fold defaultstate="collapsed" desc="Gets e Sets">
    public TableModel getJTLIsta() {
        return (TableModel) this.jTLista.getModel();
    }

    public void setJTLista(TableModel dtm) {
        this.jTLista.setModel(dtm);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Código do Formulário">
    @Override
    public void initComponents() {
        super.initComponents();

        // <editor-fold defaultstate="collapsed" desc="Layout do Formulário">
        // Desenhar o formulário aqui
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCBBuscar = new javax.swing.JComboBox();
        jTFBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBSairSelecionar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTLista = new javax.swing.JTable();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca de Cadastro"));

        jLabel1.setText("Buscar por");

        jLabel2.setText("Digite aqui o termo da busca:");

        jBSairSelecionar.setText("Sair");
        jBSairSelecionar.setMaximumSize(new java.awt.Dimension(83, 23));
        jBSairSelecionar.setMinimumSize(new java.awt.Dimension(83, 23));
        jBSairSelecionar.setPreferredSize(new java.awt.Dimension(83, 23));
        jBSairSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairSelecionarActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.setMaximumSize(new java.awt.Dimension(83, 23));
        jBBuscar.setMinimumSize(new java.awt.Dimension(83, 23));
        jBBuscar.setPreferredSize(new java.awt.Dimension(83, 23));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 101, Short.MAX_VALUE))
                                .addComponent(jTFBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSairSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBSairSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE))
        );

        jTLista.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{}
        ));
        jScrollPane1.setViewportView(jTLista);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 226, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
        );
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Propriedades do Formulário">
        //Chama o evento para configurar as propriedades do formulário
        // </editor-fold>
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Métodos do Formulário">
    @Override
    public void formWindowClosing(java.awt.event.WindowEvent evt) {
        if (jTLista.getRowCount() == 0) {
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente sair sem selecionar um registro?", "Atenção", JOptionPane.YES_NO_OPTION) == 0) {
                this.dispose();
            } else {
                jBSairSelecionar.setSelected(false);
            }
        } else {
            this.dispose();
        }
    }

    public void jBSairSelecionarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here
        this.formWindowClosing(null);
    }

    public void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Métodos Próprios">
    @Override
    public void setPropriedades() {
        // TODO inserir aqui as propriedades do formulário
        setTitle("Busca de Cadastro");
        setLarguraForm(602);
        setAlturaForm(342);
        super.setPropriedades();
    }

    public void ValidarBotoes() {
        jBBuscar.setSelected(false);
        jBSairSelecionar.setSelected(false);

        if (jTLista.getRowCount() != 0) {
            jBSairSelecionar.setText("Selecionar");
        } else {
            jBSairSelecionar.setText("Sair");
        }
    }

    public void CarregarGrade(Object[] object) throws Exception {
        // TODO: Sobrecarregar o método na classe herdada, caso precise
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
            this.setJTLista(dtm);
        }
    }
    
    public void CarregarComboBox(Class classe) throws Exception {
    // TODO: Sobrecarregar o método na classe herdada, caso precise
        classe = Class.class;

        Object[] object = null;
        
        for (Field f : classe.getDeclaredFields()){
            
        }
        
       Class<Object> classe = Negocio.class;
       for (Field atributo : classe.getDeclaredFields()) {
         System.out.println(atributo.getName());      
        }
       
  Class<?> classe = lista.get(0).getClass();
  Field[] atributos = classe.getDeclaredFields();
  return atributos.length;
    }
    // </editor-fold>

// Variables declaration - do not modify                     
private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBSairSelecionar;
    private javax.swing.JComboBox jCBBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTable jTLista;
    // End of variables declaration    
}
