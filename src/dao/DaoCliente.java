/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Cliente;
import org.hibernate.Session;

/**
 *
 * @author Galleni
 * @author Gonzalez
 */
public class DaoCliente extends Dao{

    public DaoCliente() {
    }

    public DaoCliente(Session session) {
        super(session);
    }

    @Override
    public List<Cliente> getLista() {
        if (!this.getSessao().isOpen())
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
        try {
            List<Cliente> lista = this.getSessao().createQuery("from Cliente").list();
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
