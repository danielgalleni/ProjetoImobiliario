/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import model.Funcionario;
import org.hibernate.Session;

/**
 *
 * @author Galleni
 * @author Gonzalez
 */
public class DaoFuncionario extends Dao{

    public DaoFuncionario() {
    }

    public DaoFuncionario(Session session) {
        super(session);
    }

    @Override
    public List<Funcionario> getLista() {
        if (!this.getSessao().isOpen())
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
        try {
            List<Funcionario> lista = this.getSessao().createQuery("from Funcionario").list();
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
