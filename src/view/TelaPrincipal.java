/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Galleni
 */
public class TelaPrincipal extends JFrame {

    private int alturaForm;
    private int larguraForm;

    public int getAlturaForm() {
        return alturaForm;
    }

    public void setAlturaForm(int alturaForm) {
        this.alturaForm = alturaForm;
    }

    public int getLarguraForm() {
        return larguraForm;
    }

    public void setLarguraForm(int larguraForm) {
        this.larguraForm = larguraForm;
    }

    // <editor-fold defaultstate="collapsed" desc="Construtores">
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * Creates new form TelaPrincipal
     *
     * @param aThis
     * @param b
     */
    public TelaPrincipal(Menu aThis, boolean b) {
        initComponents();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Código do Formulário">
    public void initComponents() {

        // <editor-fold defaultstate="collapsed" desc="Eventos do formulário">
        // Define evento para fechar o formulário
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Eventos de foco
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            @Override
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }

            @Override
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        // Eventos da janela do formulário
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }

            @Override
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Layout do Formulário">
        // Desenhar o formulário aqui
        
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Propriedades do Formulário">
        
        //Chama o evento para configurar as propriedades do formulário
        this.setPropriedades();
        
        // Define o tamanho do formulário
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, this.getLarguraForm(), Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, this.getAlturaForm(), Short.MAX_VALUE)
        );

        // Centraliza o formulário na tela
        pack();
        setLocationRelativeTo(null);
        // </editor-fold>
    }

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos do Formulário">
    public void formWindowOpened(java.awt.event.WindowEvent evt) {
        // TODO add código aqui:
    }

    public void formWindowLostFocus(java.awt.event.WindowEvent evt) {
        // TODO add your handling code here:
    }

    public void formWindowClosing(java.awt.event.WindowEvent evt) {
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente sair da tela?", "Atenção", JOptionPane.YES_NO_OPTION) == 0) {
            this.dispose();
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos Próprios">
    public void setPropriedades() {
        // TODO inserir aqui as propriedades do formulário
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="main">
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
            java.util.logging.Logger.getLogger(BuscaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // </editor-fold>
}
