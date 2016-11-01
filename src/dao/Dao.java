/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Cliente;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gonzalez
 */
public abstract class Dao {
    private Session session;

   /* public Dao(Session session) {
        this.session = session;
    }*/

    public void persistir(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(object);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void update(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(object);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void delete(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(object);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public Object getById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            return (model.Cliente) session.load(Object.class, id);
        } catch (Exception e) {
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }
    
}
