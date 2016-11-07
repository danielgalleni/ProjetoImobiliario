/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Gonzalez
 */

@Entity
@Table(name = "Agendamento")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Integer codigo;
    private Date DataInicio;
    private Date DataFim;

    public Integer getCodigo() {
            return codigo;
    }

    public Agendamento(Integer codigo, Date DataInicio, Date DataFim) throws Exception {
        if((DataInicio != null) && (DataFim != null)){
            this.codigo = codigo;
            this.DataInicio = DataInicio;
            this.DataFim = DataFim;
        }else{
            throw new Exception("Erro!\nNecessário selecionar a Data de Agendamento.");
        }
    }
  
    public void setCodigo(Integer codigo) throws Exception {
        if(codigo > 0){
            this.codigo = codigo;
        }else{
            throw new Exception("Erro!\nVerifique. Código menor que zero.");   
        }
    }

    public Date getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(Date DataInicio)throws Exception {
        if(DataInicio.before( new Date ())){
            this.DataInicio = DataInicio;
        }else{
            throw new Exception("Erro!\nA Data Inicial não pode ser maior que a data atual");
        }
    }

    public Date getDataFim() {
        Date utilData = this.getDataFim();
        java.sql.Date sqlData = new java.sql.Date(utilData.getTime());
        return DataFim;
    }

    public void setDataFim(Date DataFim) {
        this.DataFim = DataFim;
    }   
}
