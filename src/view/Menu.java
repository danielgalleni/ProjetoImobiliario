/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import projetoimobiliario.ProjetoImobiliario;

/**
 *
 * @author Galleni
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }
    
    public Menu(ProjetoImobiliario aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jBTNCadastro_Cliente = new javax.swing.JButton();
        jBTNCadastro_Funcionario = new javax.swing.JButton();
        jBTNCadastro_Corretor = new javax.swing.JButton();
        jBTNCadastro_Imovel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBTNBusca_Pessoas = new javax.swing.JButton();
        jBTNBusca_Imovel = new javax.swing.JButton();
        jBTNBusca_Agenda = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jBTNEditar_Cliente = new javax.swing.JButton();
        jBTNEditar_Corretor = new javax.swing.JButton();
        jBTNEditar_Funcionario = new javax.swing.JButton();
        jBTNEditar_Imovel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jBTNSair_Do_Sistema = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Imobiliaria GG");
        setExtendedState(MAXIMIZED_BOTH);
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CADASTROS"));

        jBTNCadastro_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrarCliente.png"))); // NOI18N
        jBTNCadastro_Cliente.setText("Cliente");
        jBTNCadastro_Cliente.setContentAreaFilled(false);
        jBTNCadastro_Cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBTNCadastro_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNCadastro_ClienteActionPerformed(evt);
            }
        });

        jBTNCadastro_Funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrarFuncinario.png"))); // NOI18N
        jBTNCadastro_Funcionario.setText("Funcionário");
        jBTNCadastro_Funcionario.setContentAreaFilled(false);
        jBTNCadastro_Funcionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBTNCadastro_Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNCadastro_FuncionarioActionPerformed(evt);
            }
        });

        jBTNCadastro_Corretor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastroCorretor.png"))); // NOI18N
        jBTNCadastro_Corretor.setText("Corretor");
        jBTNCadastro_Corretor.setContentAreaFilled(false);
        jBTNCadastro_Corretor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBTNCadastro_Corretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNCadastro_CorretorActionPerformed(evt);
            }
        });

        jBTNCadastro_Imovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastroImovel.png"))); // NOI18N
        jBTNCadastro_Imovel.setText("Imóvel");
        jBTNCadastro_Imovel.setContentAreaFilled(false);
        jBTNCadastro_Imovel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBTNCadastro_Imovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNCadastro_ImovelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBTNCadastro_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBTNCadastro_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBTNCadastro_Corretor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBTNCadastro_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTNCadastro_Imovel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTNCadastro_Corretor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTNCadastro_Funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTNCadastro_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("CONSULTAR"));

        jBTNBusca_Pessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BUSCA PESSOAS.png"))); // NOI18N
        jBTNBusca_Pessoas.setText("Pessoas");
        jBTNBusca_Pessoas.setContentAreaFilled(false);
        jBTNBusca_Pessoas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBTNBusca_Pessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNBusca_PessoasActionPerformed(evt);
            }
        });

        jBTNBusca_Imovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscaImovel.png"))); // NOI18N
        jBTNBusca_Imovel.setText("Imóvel");
        jBTNBusca_Imovel.setContentAreaFilled(false);
        jBTNBusca_Imovel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBTNBusca_Imovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNBusca_ImovelActionPerformed(evt);
            }
        });

        jBTNBusca_Agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarAgenda.png"))); // NOI18N
        jBTNBusca_Agenda.setText("Agenda");
        jBTNBusca_Agenda.setContentAreaFilled(false);
        jBTNBusca_Agenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBTNBusca_Pessoas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBTNBusca_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBTNBusca_Agenda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTNBusca_Imovel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTNBusca_Pessoas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTNBusca_Agenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("ALTERAR"));

        jBTNEditar_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarCliente.png"))); // NOI18N
        jBTNEditar_Cliente.setText("Cliente");
        jBTNEditar_Cliente.setContentAreaFilled(false);
        jBTNEditar_Cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jBTNEditar_Corretor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarCorretor.png"))); // NOI18N
        jBTNEditar_Corretor.setText("Corretor");
        jBTNEditar_Corretor.setContentAreaFilled(false);
        jBTNEditar_Corretor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jBTNEditar_Funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarFuncionario.png"))); // NOI18N
        jBTNEditar_Funcionario.setText("Funcionário");
        jBTNEditar_Funcionario.setContentAreaFilled(false);
        jBTNEditar_Funcionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jBTNEditar_Imovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarImovel.png"))); // NOI18N
        jBTNEditar_Imovel.setText("Imóvel");
        jBTNEditar_Imovel.setContentAreaFilled(false);
        jBTNEditar_Imovel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBTNEditar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBTNEditar_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBTNEditar_Corretor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBTNEditar_Imovel))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTNEditar_Corretor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTNEditar_Funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTNEditar_Cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTNEditar_Imovel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHAR O SISTEMA"));

        jBTNSair_Do_Sistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sairSistema.png"))); // NOI18N
        jBTNSair_Do_Sistema.setText("Sair");
        jBTNSair_Do_Sistema.setContentAreaFilled(false);
        jBTNSair_Do_Sistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBTNSair_Do_Sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNSair_Do_SistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBTNSair_Do_Sistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBTNSair_Do_Sistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cadastro");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Funcionários");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Cliente");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        jMenuItem1.setText("Corretor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        jMenu1.setText("Busca");

        jMenuItem3.setText("Corretor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setText("Cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setText("Funcionário");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair?", "Atenção", JOptionPane.YES_NO_OPTION) == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        this.formWindowClosing(null);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
        CadastroCliente cadastroCliente = new CadastroCliente(this, true);
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario(this, true);
        cadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastroCorretor cadastroCorretor = new CadastroCorretor(this, true);
        cadastroCorretor.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        BuscaCliente buscaCliente = new BuscaCliente(this, true);
        buscaCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        BuscaCorretor buscaCorretor = new BuscaCorretor(this, true);
        buscaCorretor.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        BuscaFuncionario buscaFuncionario = new BuscaFuncionario(this, true);
        buscaFuncionario.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //INICIALIZA IMAGEM CENTRALIZADA NO BOTÃO COM DESCRIÇÃO A BAIXO DA IMAGEM
        jBTNCadastro_Cliente.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBTNCadastro_Cliente.setHorizontalTextPosition(SwingConstants.CENTER);
        
        jBTNCadastro_Funcionario.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBTNCadastro_Funcionario.setHorizontalTextPosition(SwingConstants.CENTER);
        
        jBTNCadastro_Corretor.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBTNCadastro_Corretor.setHorizontalTextPosition(SwingConstants.CENTER);
        
        jBTNCadastro_Imovel.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBTNCadastro_Imovel.setHorizontalTextPosition(SwingConstants.CENTER);
        
        jBTNBusca_Pessoas.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBTNBusca_Pessoas.setHorizontalTextPosition(SwingConstants.CENTER);

        jBTNBusca_Imovel.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBTNBusca_Imovel.setHorizontalTextPosition(SwingConstants.CENTER);

        jBTNBusca_Agenda.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBTNBusca_Agenda.setHorizontalTextPosition(SwingConstants.CENTER);
        
        jBTNEditar_Cliente.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBTNEditar_Cliente.setHorizontalTextPosition(SwingConstants.CENTER);  
        
        jBTNEditar_Corretor.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBTNEditar_Corretor.setHorizontalTextPosition(SwingConstants.CENTER);
      
        jBTNEditar_Funcionario.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBTNEditar_Funcionario.setHorizontalTextPosition(SwingConstants.CENTER);
       
        jBTNEditar_Imovel.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBTNEditar_Imovel.setHorizontalTextPosition(SwingConstants.CENTER); 
        
        jBTNSair_Do_Sistema.setVerticalTextPosition(SwingConstants.BOTTOM);
        jBTNSair_Do_Sistema.setHorizontalTextPosition(SwingConstants.CENTER); 
    }//GEN-LAST:event_formWindowOpened

    private void jBTNCadastro_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNCadastro_ClienteActionPerformed
        //CHAMANDO TELA DE CADASTRO PARA SER INICIADA NO BOTÃO DO FORM DE MENU
        CadastroCliente cadastroCliente = new CadastroCliente();
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_jBTNCadastro_ClienteActionPerformed

    private void jBTNCadastro_CorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNCadastro_CorretorActionPerformed
        //CHAMANDO TELA DE CADASTRO PARA SER INICIADA NO BOTÃO DO FORM DE MENU
        CadastroCorretor cadastroCorretor = new CadastroCorretor();
        cadastroCorretor.setVisible(true);
    }//GEN-LAST:event_jBTNCadastro_CorretorActionPerformed

    private void jBTNCadastro_FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNCadastro_FuncionarioActionPerformed
        //CHAMANDO TELA DE CADASTRO PARA SER INICIADA NO BOTÃO DO FORM DE MENU
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        cadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_jBTNCadastro_FuncionarioActionPerformed

    private void jBTNCadastro_ImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNCadastro_ImovelActionPerformed
        //CHAMANDO TELA DE CADASTRO PARA SER INICIADA NO BOTÃO DO FORM DE MENU
        CadastroImovel cadastroImovel = new CadastroImovel();
        cadastroImovel.setVisible(true);
    }//GEN-LAST:event_jBTNCadastro_ImovelActionPerformed

    private void jBTNBusca_PessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNBusca_PessoasActionPerformed
        //CHAMANDO TELA DE CADASTRO PARA SER INICIADA NO BOTÃO DO FORM DE MENU
        ModeloVisual modeloVisual = new ModeloVisual();
        modeloVisual.setVisible(true);
    }//GEN-LAST:event_jBTNBusca_PessoasActionPerformed

    private void jBTNBusca_ImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNBusca_ImovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTNBusca_ImovelActionPerformed

    private void jBTNSair_Do_SistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNSair_Do_SistemaActionPerformed
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente sair da tela?", "Atenção", JOptionPane.YES_NO_OPTION) == 0) {
            this.dispose();
        }   
    }//GEN-LAST:event_jBTNSair_Do_SistemaActionPerformed
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jBTNBusca_Agenda;
    private javax.swing.JButton jBTNBusca_Imovel;
    private javax.swing.JButton jBTNBusca_Pessoas;
    private javax.swing.JButton jBTNCadastro_Cliente;
    private javax.swing.JButton jBTNCadastro_Corretor;
    private javax.swing.JButton jBTNCadastro_Funcionario;
    private javax.swing.JButton jBTNCadastro_Imovel;
    private javax.swing.JButton jBTNEditar_Cliente;
    private javax.swing.JButton jBTNEditar_Corretor;
    private javax.swing.JButton jBTNEditar_Funcionario;
    private javax.swing.JButton jBTNEditar_Imovel;
    private javax.swing.JButton jBTNSair_Do_Sistema;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
