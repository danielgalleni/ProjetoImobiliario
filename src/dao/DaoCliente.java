/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Cliente;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Daniel Galleni
 */
public class DaoCliente {

    private Session session;

    public DaoCliente(Session session) {
        this.session = session;
    }

    public void persistir(Cliente cliente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(cliente);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void update(Cliente cliente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(cliente);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void delete(Cliente cliente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(cliente);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public Cliente getById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            model.Cliente cliente = (model.Cliente) session.load(model.Cliente.class, id);
            return cliente;
        } catch (Exception e) {
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public List<Cliente> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            List<Cliente> lista = session.createQuery("from Cliente").list();
            return lista;
        } catch (Exception e) {
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }
}
