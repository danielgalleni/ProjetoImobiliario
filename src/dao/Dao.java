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

    // <editor-fold desc="Atributos">  
    private Session sessao;
    // </editor-fold>

    // <editor-fold desc="Contrutores">  
    public Dao() {

    }

    public Dao(Session sessao) {
        this.setSessao(sessao);
    }
    // </editor-fold>

    // <editor-fold desc="Gets e Sets">
    public Session getSessao() {
        return this.sessao;
    }

    public void setSessao(Session sessao) {
        this.sessao = sessao;
    }
    // </editor-fold>

    // <editor-fold desc="Métodos CRUD">  
    public void persistir(Object object) {
        if (!this.getSessao().isOpen()) {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
        }
        Transaction transaction = this.getSessao().beginTransaction();
        try {
            this.getSessao().persist(object);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            if (!this.getSessao().isOpen()) {
                this.getSessao().close();
            }
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void atualizar(Object object) {
        if (!this.getSessao().isOpen()) {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
        }
        Transaction transaction = this.getSessao().beginTransaction();
        try {
            this.getSessao().update(object);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            if (!this.getSessao().isOpen()) {
                this.getSessao().close();
            }
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void deletar(Object object) {
        if (!this.getSessao().isOpen()) {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
        }
        Transaction transaction = this.getSessao().beginTransaction();
        try {
            this.getSessao().delete(object);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            if (!this.getSessao().isOpen()) {
                this.getSessao().close();
            }
            HibernateUtil.getSessionFactory().close();
        }
    }

    // <editor-fold desc="Métodos de Busca">  
    public Object getById(Integer id) {
        if (!this.getSessao().isOpen()) {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
        }
        try {
            return (model.Cliente) this.getSessao().load(Object.class, id);
        } catch (Exception e) {
            throw e;
        } finally {
            this.getSessao().close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public List<?> getLista() {
        if (!this.getSessao().isOpen()) {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
        }
        try {
            List<Object> lista = this.getSessao().createQuery("").list();
            return lista;
        } catch (Exception e) {
            throw e;
        } finally {
            if (!this.getSessao().isOpen()) {
                this.getSessao().close();
            }
            HibernateUtil.getSessionFactory().close();
        }
    }
    // </editor-fold>
    // </editor-fold>
}
