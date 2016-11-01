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
public class DaoCliente extends Dao{
/*
    public DaoCliente(Session session) {
        super(session);
    }*/

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
