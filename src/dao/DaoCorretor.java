/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Corretor;
import org.hibernate.Session;

/**
 *
 * @author Gonzalez
 * @author Galleni
 */
public class DaoCorretor extends Dao{

    public DaoCorretor() {
    }

    public DaoCorretor(Session session) {
        super(session);
    }

    @Override
    public List<Corretor> list() {
        if (!this.getSession().isOpen())
            this.setSession(HibernateUtil.getSessionFactory().openSession());
        try {
            List<Corretor> lista = this.getSession().createQuery("from Corretor").list();
            return lista;
        } catch (Exception e) {
            throw e;
        } finally {
            if (!this.getSession().isOpen())
                this.getSession().close();
            HibernateUtil.getSessionFactory().close();
        }
    }
    
}
