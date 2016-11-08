/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.List;
import model.Cliente;

/**
 *
 * @author Galleni
 */
public class TableModelCliente extends TableModel{

    public TableModelCliente(List<?> object) {
        super(object);
    }
    
    // <editor-fold desc="Métodos sobrecarregados">
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return ((Cliente) super.getObject().get(rowIndex)).getCodigo();
            case 1:
                return ((Cliente) super.getObject().get(rowIndex)).getNome();
            case 2:
                return ((Cliente) super.getObject().get(rowIndex)).getEndereco();
            case 3:
                return ((Cliente) super.getObject().get(rowIndex)).getNumero();
            case 4:
                return ((Cliente) super.getObject().get(rowIndex)).getBairro();
            case 5:
                return ((Cliente) super.getObject().get(rowIndex)).getCidade();
            case 6:
                //TODO: return ((Cliente) super.getObject().get(rowIndex)).getTelefone();
            case 7:
                //TODO: return ((Cliente) super.getObject().get(rowIndex)).getCelular();
            case 8:
                return ((Cliente) super.getObject().get(rowIndex)).getCpf();
        }
        //return super.getObject().get(rowIndex).toString();
        return null;
    }
    // </editor-fold>
}
