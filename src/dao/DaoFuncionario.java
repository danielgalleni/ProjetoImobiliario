/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import model.Funcionario;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Daniel Galleni
 */
public class DaoFuncionario {
    private Session session;

    public DaoFuncionario(Session session) {
        this.session = session;
    }

    public void persistir(Funcionario funcionario){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
          session.persist(funcionario);
          transaction.commit();
        }catch(Exception e){
          transaction.rollback();
          throw e;
        }finally{
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }
    
    public void update(Funcionario funcionario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(funcionario);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }
    
    public void delete(Funcionario funcionario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(funcionario);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

        public Funcionario getById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            model.Funcionario funcionario = (model.Funcionario) session.load(model.Funcionario.class, id);
            return funcionario;
        } catch (Exception e) {
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }
}
