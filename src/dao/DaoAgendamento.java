/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Agendamento;
import model.Cliente;
import org.hibernate.Session;

/**
 *
 * @author Galleni
 * @author Gonzalez
 */
public class DaoAgendamento extends Dao{

    public DaoAgendamento() {
    }

    public DaoAgendamento(Session sessao) {
        super(sessao);
    }
    
   @Override
    public List<Agendamento> getLista() {
        if (!this.getSessao().isOpen())
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
        try {
            List<Agendamento> lista = this.getSessao().createQuery("from Agendamento").list();
            return lista;
        } catch (Exception e) {
            throw e;
        } finally {
            if (!this.getSessao().isOpen())
                this.getSessao().close();
            HibernateUtil.getSessionFactory().close();
        }
    }
    /*
    public List<Cliente> getLista(String nome) {
        if (!this.getSessao().isOpen())
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
        try {
            List<Cliente> lista = this.getSessao().createQuery("from Cliente c where c.nome like :nome")
                    .setParameter("nome", nome)
                    .list();
            return lista;
        } catch (Exception e) {
            throw e;
        } finally {
            if (!this.getSessao().isOpen())
                this.getSessao().close();
            HibernateUtil.getSessionFactory().close();
        }
    } */           
}
