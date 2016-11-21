package classes;

import anotacao.Campo;
import java.lang.reflect.Method;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Galleni
 */
public class TableModel extends AbstractTableModel {

    //<editor-fold desc="Atributos">
    private List<Object> object;
    private final Class<?> classe;
    // </editor-fold>

    // <editor-fold desc="Construtores">
    public TableModel(List<Object> object) {
    //public TableModel() {
        this.object = object;
        this.classe = object.get(0).getClass();
    }
    // </editor-fold>

    // <editor-fold desc="Gets e Sets">  
    /*public List<?> getObject() {
     return this.object;
     }

     public void setObject(List<?> object) {
     this.object = object;
     this.classe = object.get(0).getClass();
     }

     public Object getLinha(int row) {
     return this.object.get(row);
     }*/
    // </editor-fold>
    
    // <editor-fold desc="Métodos CRUD">
    public void addRow(Object object) {
        this.object.add(object);
        this.fireTableDataChanged();
    }

    public void removeRow(int row) {
        this.object.remove(row);
        this.fireTableRowsDeleted(row, row);
    }

    // </editor-fold>
    // <editor-fold desc="Métodos sobrecarregados">
    @Override
    public int getRowCount() {
        return this.object.size();
    }

    @Override
    public int getColumnCount() {
        int coluna = 0;
        for (Method metodo : classe.getDeclaredMethods()) {
            if (metodo.isAnnotationPresent(Campo.class)) {
                coluna++;
            }
        }
        return coluna;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Object objeto = object.get(rowIndex);
            for (Method metodo : classe.getDeclaredMethods()) {
                if (metodo.isAnnotationPresent(Campo.class)) {
                    Campo anotacao = metodo.getAnnotation(Campo.class);
                    if (anotacao.posicao() == columnIndex) {
                        return metodo.invoke(objeto);
                    }
                }
            }
        } catch (SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            return "Erro: " + e;
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        for (Method metodo : classe.getDeclaredMethods()) {
            if (metodo.isAnnotationPresent(Campo.class)) {
                Campo anotacao = metodo.getAnnotation(Campo.class);
                if (anotacao.posicao() == column) {
                    return anotacao.nome();
                }
            }
        }
        return "";
    }
    // </editor-fold>

}
