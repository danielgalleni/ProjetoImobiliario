package classes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Cliente;
import classes.Anotacao;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Galleni
 */
public class TableModel extends AbstractTableModel {

    //<editor-fold desc="Atributos">
    private List<Object> object;
    private Class<?> classe;
    //private List<Object> object;
    /*private String[] colunas;*/
    // </editor-fold>

    // <editor-fold desc="Construtores">
    public TableModel() {

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
    public String getColumnName(int column) {
        for (Method metodo : classe.getDeclaredMethods()) {
            if (metodo.isAnnotationPresent(Anotacao.Campo.class)) {
                Anotacao.Campo anotacao = metodo.getAnnotation(Anotacao.Campo.class);
                if (anotacao.posicao() == column) {
                    return anotacao.nome();
                }
            }
        }
        return "";
        //return this.colunas[column];
        //return super.getColumnName(column);
    }

    @Override
    public int getRowCount() {
        return this.object.size();
    }

    @Override
    public int getColumnCount() {
        Object objeto = this.object.get(0);
        Class<?> classe = objeto.getClass();

        int coluna = 0;
        for (Method metodo : classe.getDeclaredMethods()) {
            if (metodo.isAnnotationPresent(Anotacao.Campo.class)) {
                coluna++;
            }
        }
        return coluna;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Object objeto = this.object.get(rowIndex);
            Class<?> classe = objeto.getClass();
            for (Method metodo : classe.getDeclaredMethods()) {
                if (metodo.isAnnotationPresent(Anotacao.Campo.class)) {
                    Anotacao.Campo anotacao = metodo.getAnnotation(Anotacao.Campo.class);
                    if (anotacao.posicao() == columnIndex) {
                        return String.format(anotacao.formato(), metodo.invoke(objeto));
                    }
                }
            }
            return "";
        } catch (SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            return "Erro: " + e;
        }
    }
    // </editor-fold>

}
