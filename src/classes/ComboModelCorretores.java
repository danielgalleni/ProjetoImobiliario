/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import model.Corretor;

/**
 *
 * @author Gonzalez
 */
public class ComboModelCorretores implements ComboBoxModel<Corretor>{
    private Corretor[] corretor;
    private Corretor corretores;

    public ComboModelCorretores(Corretor[] corretor, Corretor corretores) {
        this.corretor = corretor;
        this.corretores = corretores;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        corretor = (Corretor[]) anItem;
    }
    
    @Override
    public Object getSelectedItem() {
        return corretor;
    }

    @Override
    public int getSize() {
        return corretor.length;
    }

    public Corretor[] getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor[] corretor) {
        this.corretor = corretor;
    }

    public Corretor getCorretores() {
        return corretores;
    }

    public void setCorretores(Corretor corretores) {
        this.corretores = corretores;
    }

    @Override
    public Corretor getElementAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
