/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import model.Funcionario;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Daniel Galleni
 */
public class DaoFuncionario {
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
}
