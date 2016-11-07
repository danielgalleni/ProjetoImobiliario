/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Galleni
 */
public class TableModelCliente extends TableModel{
    
    // <editor-fold desc="Métodos sobrecarregados">
    @Override    
    public Object getLinha(int row) {
        return super.getLinha(row); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addRow(Object object) {

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        /*switch(columnIndex){
            case 0:
                return super.getObject().get(rowIndex).getCodigo();
            case 1:
                return this.cliente.get(rowIndex).getNome();
            case 2:
                return this.cliente.get(rowIndex).getEndereco();
            case 3:
                return this.cliente.get(rowIndex).getNumero();
            case 4:
                return this.cliente.get(rowIndex).getBairro();
            case 5:
                return this.cliente.get(rowIndex).getCidade();
            case 6:
                return this.cliente.get(rowIndex).getTelefone();
            case 7:
                return this.cliente.get(rowIndex).getCelular();
            case 8:
                return this.cliente.get(rowIndex).getCpf();
        }
        return null;*/
        return null;
    }
    // </editor-fold>
}
