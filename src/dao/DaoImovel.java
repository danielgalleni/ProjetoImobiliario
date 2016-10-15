/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Imovel;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gonzalez
 */
public class DaoImovel {
    private Session session;

    public DaoImovel(Session session) {
        this.session = session;
    }

    public DaoImovel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void persistir(Imovel imovel) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(imovel);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void update(Imovel imovel) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(imovel);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void delete(Imovel imovel) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(imovel);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public Imovel getById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            model.Imovel imovel = (model.Imovel) session.load(model.Imovel.class, id);
            return imovel;
        } catch (Exception e) {
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public List<Imovel> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            List<Imovel> lista = session.createQuery("from Imovel").list();
            return lista;
        } catch (Exception e) {
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }    
}
