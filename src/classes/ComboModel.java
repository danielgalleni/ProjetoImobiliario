/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import anotacao.Campo;
import java.lang.reflect.Method;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Daniel
 */
public class ComboModel implements ComboBoxModel<Object>{
    private final List<Object> objects;
    private Object object;
    
    public ComboModel(<Object> objects){
        this.objects = objects;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        object = (Object) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return this.object;
    }

    @Override
    public int getSize() {
        return this.objects.length;
    }

    @Override
    public Object getElementAt(int index) {
        return this.objects[index];
        for (Method metodo : object.getDeclaredMethods()) {
            if (metodo.isAnnotationPresent(Campo.class)) {
                Campo anotacao = metodo.getAnnotation(Campo.class);
                if (anotacao.posicao() == column) {
                    return anotacao.nome();
                }
            }
        }
        return "";
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }
    
}
