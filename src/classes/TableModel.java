package classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Galleni
 */
public class TableModel extends AbstractTableModel {

    //<editor-fold desc="Atributos">
    private List<? extends Object> object;
    private String[] colunas;
    // </editor-fold>
    
    // <editor-fold desc="Construtores">
    public TableModel() {
        object = new ArrayList<>();
    }
    // </editor-fold>

    // <editor-fold desc="Gets e Sets">  
    public List<?> getObject(){
        return this.object;
    }

    
    public void setObject(List<Object> object){
        this.object = object;
    }
    
    public Object getLinha(int row) {
        return this.object.get(row);
    }

    public void setColunas(String[] colunas){
        this.colunas = colunas;
    }
    
    public String[] getColunas() {
        return this.colunas;
    }
    // </editor-fold>
    
    // <editor-fold desc="Métodos CRUD">  
    public void addRow(Object object) {
        //this.object.add(object);
        this.fireTableDataChanged();
    }

    public void removeRow(int row) {
        this.object.remove(row);
        this.fireTableRowsDeleted(row, row);
    }
    // </editor-fold>

    // <editor-fold desc="Métodos sobrecarregados">
    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
        //return super.getColumnName(column);
    }

    @Override
    public int getRowCount() {
        return this.object.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
    // </editor-fold>
}
