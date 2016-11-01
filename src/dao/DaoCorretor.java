/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Corretor;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gonzalez
 */
public class DaoCorretor extends Dao{
/*
    public DaoCorretor(Session session) {
        super(session);
    }
  */  
    public List<Corretor> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            List<Corretor> lista = session.createQuery("from Corretor").list();
            return lista;
        } catch (Exception e) {
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }    
    
}
