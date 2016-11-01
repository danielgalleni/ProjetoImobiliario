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
public class DaoImovel extends Dao{
/*
    public DaoImovel(Session session) {
        super(session);
    }*/

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
