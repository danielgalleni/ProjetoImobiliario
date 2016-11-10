/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Galleni
 */
public class BuscaFuncionario extends BuscaPrincipal{

    public BuscaFuncionario() {
    }

    public BuscaFuncionario(Menu aThis, boolean b) {
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
   
    // <editor-fold defaultstate="collapsed" desc="Métodos Próprios">
    @Override
    public void setPropriedades() {
        // TODO inserir aqui as propriedades do formulário
        super.setPropriedades();
        setTitle("Busca de Cadastro | Funcionário");
    }
    // </editor-fold>
}
