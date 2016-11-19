/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import classes.Anotacao;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Galleni
 * @author Gonzalez
 */
@Entity
@Table(name = "Agendamento")
public class Agendamento extends Anotacao{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Integer codigo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataFim;
    private Corretor corretores;
    private Cliente cliente;
    
    public Agendamento(Integer codigo, Date DataInicio, Date DataFim) throws Exception {
        if((DataInicio != null) && (DataFim != null)){
            this.codigo = codigo;
            this.DataInicio = DataInicio;
            this.DataFim = DataFim;
        }else{
            throw new Exception("Erro!\nNecessário selecionar a Data de Agendamento.");
        }
    }

    public Agendamento() {
    }
    
    @OneToMany(mappedBy = "Agendamento",cascade = CascadeType.ALL,orphanRemoval = true)
    
    @Campo(nome="Núm. Agendamento", posicao=0, formato="%i")
    public Integer getCodigo() {
            return codigo;
    }
  
    public void setCodigo(Integer codigo) throws Exception {
        if(codigo > 0){
            this.codigo = codigo;
        }else{
            throw new Exception("Erro!\nVerifique. Código menor que zero.");   
        }
    }

    @Campo(nome="Inicia em", posicao=1, formato="%1$td/%1$tm/%1$tY")
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

    @Campo(nome="Termina em", posicao=2, formato="%1$td/%1$tm/%1$tY")
    public Date getDataFim() {
        return DataFim;
    }

    public void setDataFim(Date DataFim) {
        this.DataFim = DataFim;
    }   

    public Corretor getCorretores() {
        return corretores;
    }

    public void setCorretores(Corretor corretores) {
        this.corretores = corretores;
    }
 
}
