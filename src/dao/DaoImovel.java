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
    public List<Imovel> getLista() {
        if (!this.getSessao().isOpen())
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
        try {
            List<Imovel> lista = this.getSessao().createQuery("from Imovel").list();
            return lista;
        } catch (Exception e) {
            throw e;
        } finally {
            if (!this.getSessao().isOpen())
                this.getSessao().close();
            HibernateUtil.getSessionFactory().close();
        } 
    }
       
}
