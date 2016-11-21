/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Daniel
 */
public class ComboModel implements ComboBoxModel<Object>{
    private final Object[] objects;
    private Object object;
    
    public ComboModel(Object[] objects){
        this.objects = objects;
    }

    public ComboModel() {
        this.objects = null;
        this.object = null;
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
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }
    
}
