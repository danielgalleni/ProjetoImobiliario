/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Daniel
 */
public class BuscaCliente extends BuscaPadrao {

    public BuscaCliente() {
        super();
    }

    public BuscaCliente(Menu aThis, boolean b) {
        super(aThis, b);
    }
    
    // <editor-fold desc="Definir atributos do formulário">
    
    @Override
    public void setPropriedades() {
        super.setPropriedades(); //To change body of generated methods, choose Tools | Templates.
        setTitle("Buscar Cliente");
    }
    // </editor-fold>
}
