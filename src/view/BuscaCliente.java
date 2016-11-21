/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.DaoCliente;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Pessoa;
import model.Telefone;

/**
 *
 * @author Galleni
 */
public class BuscaCliente extends BuscaPrincipal {

    public BuscaCliente() {
        super();
    }

    public BuscaCliente(Menu aThis, boolean b) {
        super(aThis, b);
    }

    // <editor-fold defaultstate="collapsed" desc="Código do Formulário">
    @Override
    public void initComponents() {
        super.initComponents();

        // <editor-fold defaultstate="collapsed" desc="Layout do Formulário">
        // Desenhar o formulário aqui
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Propriedades do Formulário">
        //Chama o evento para configurar as propriedades do formulário
        // </editor-fold>
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Métodos do Formulário">
    @Override
    public void formWindowOpened(java.awt.event.WindowEvent evt) {
        Cliente[] clientes = null;
        try {
            this.CarregarComboBox(Pessoa.class);
            if (clientes != null) {
                CarregarGrade(Arrays.asList(clientes));
            }
            this.ValidarBotoes();
        } catch (Exception ex) {
            Logger.getLogger(BuscaCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }
   // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Métodos Próprios">
    @Override
    public void setPropriedades() {
        // TODO inserir aqui as propriedades do formulário
        super.setPropriedades();
        setTitle("Busca de Cadastro | Cliente");
    }

    // </editor-fold>
}
