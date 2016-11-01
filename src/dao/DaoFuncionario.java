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
public class DaoFuncionario extends Dao{
/*
    public DaoFuncionario(Session session) {
        super(session);
    }
    */

    public List<Funcionario> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            List<Funcionario> lista = session.createQuery("from Funcionario").list();
            return lista;
        } catch (Exception e) {
            throw e;
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }
}
