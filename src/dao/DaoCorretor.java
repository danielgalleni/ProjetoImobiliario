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
public class DaoCorretor {
    
    private Session session;
    
    public DaoCorretor (Session session){
        this.session = session;
    }

    public DaoCorretor(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  public void persistir(Corretor corretor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(corretor);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void update(Corretor corretor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(corretor);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void delete(Corretor corretor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(corretor);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public Corretor getById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            model.Corretor corretor = (model.Corretor) session.load(model.Corretor.class, id);
            return corretor;
        } catch (Exception e) {
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

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
