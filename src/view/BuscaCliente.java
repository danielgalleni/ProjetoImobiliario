/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.DaoCliente;
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
        try {
            List<Cliente> clientes = null;
            Cliente cliente1 = null, cliente2 = null;
            cliente1 = new Cliente(1, "Daniel", "Rua miranorte", "SP", "Glória V", "260", "Catanduva","40073036811", "474927088", "danielgalleni@gmail.com");
            clientes.add(cliente1);
            cliente2 = new Cliente(2, "Danl", "Rua mire", "SP", "Glória V", "26", "Catanduva","46736811", "474927088", "danielgmail.com");
            clientes.add(cliente2);

            /*clientes[0].setCodigo(1);
            clientes[0].setNome("Daniel");
            clientes[0].setBairro("Glória V");
            clientes[0].setCidade("Catanduva");
            clientes[0].setCpf("40073036811");
            clientes[0].setEmail("danielgalleni@gmail.com");
            clientes[0].setEndereco("Rua miranorte");
            clientes[0].setEstado("SP");
            clientes[0].setNumero("260");
            clientes[0].setRg("474927088");*/
            
            this.ValidarBotoes();
            //this.CarregarComboBox(clientes);
           this.CarregarGrade(clientes);
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
