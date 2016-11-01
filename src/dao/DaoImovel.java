/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Imovel;
import org.hibernate.Session;

/**
 *
 * @author Gonzalez
 * @author Galleni
 */
public class DaoImovel extends Dao{

    public DaoImovel() {
    }

    public DaoImovel(Session session) {
        super(session);
    }

    @Override
    public List<Imovel> list() {
        if (!this.getSession().isOpen())
            this.setSession(HibernateUtil.getSessionFactory().openSession());
        try {
            List<Imovel> lista = this.getSession().createQuery("from Imovel").list();
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
