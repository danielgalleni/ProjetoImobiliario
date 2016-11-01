/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

/**
 *
 * @author Galleni
 * @author Gonzalez
 */
public abstract class Dao {
    private Session session;

    public Dao(){
        
    }
    
    public Dao(Session session) {
        this.setSession(session);
    }

    public Session getSession(){
        return this.session;
    }
    
    public void setSession(Session session){
        this.session = session;
    }
    
    public void persistir(Object object) {
        if (!this.getSession().isOpen())
            this.setSession(HibernateUtil.getSessionFactory().openSession());
        Transaction transaction = this.getSession().beginTransaction();
        try {
            this.getSession().persist(object);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            if (!this.getSession().isOpen())
                this.getSession().close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void update(Object object) {
        if (!this.getSession().isOpen())
            this.setSession(HibernateUtil.getSessionFactory().openSession());
        Transaction transaction = this.getSession().beginTransaction();
        try {
            this.getSession().update(object);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            if (!this.getSession().isOpen())
                this.getSession().close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void delete(Object object) {
        if (!this.getSession().isOpen())
            this.setSession(HibernateUtil.getSessionFactory().openSession());
        Transaction transaction = this.getSession().beginTransaction();
        try {
            this.getSession().delete(object);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            if (!this.getSession().isOpen())
                this.getSession().close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public Object getById(Integer id) {
        if (!this.getSession().isOpen())
            this.setSession(HibernateUtil.getSessionFactory().openSession());
        try {
            return (model.Cliente) this.getSession().load(Object.class, id);
        } catch (Exception e) {
            throw e;
        } finally {
            this.getSession().close();
            HibernateUtil.getSessionFactory().close();
        }
    }
    
    public List<?> list(){
        if (!this.getSession().isOpen())
            this.setSession(HibernateUtil.getSessionFactory().openSession());
        try {
            List<Object> lista = this.getSession().createQuery("").list();
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
