/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Gonzalez
 * @author Galleni
 */

//Anotação

public class Funcionario extends Pessoa{
    
    private String cargo;
    private String setor;
    private String hora_entrada;
    private String hora_saida;
    private Float salario;  

    public Funcionario(Integer codigo, String nome, String endereco, String estado, String bairro, String numero, String cidade, String cpf, String rg, String email) {
        super(codigo, nome, endereco, estado, bairro, numero, cidade, cpf, rg, email);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo)throws Exception {
        if(cargo != null){
            this.cargo = cargo;
        }else{
            throw new Exception("Erro!\nNecessário informar o Cargo do funcionário.");
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor)throws Exception {
        if(setor != null){
            this.setor = setor;
        }else{
            throw new Exception("Erro!\nNecessário informar o Setor do funcionário.");
        }
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada)throws Exception {
        if(hora_entrada != null){
            this.hora_entrada = hora_entrada;
        }else{
            throw new Exception("Erro!\nNecessário informar a Hora de Entrada do funcionário.");
        }
    }

    public String getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(String hora_saida)throws Exception {
        if(hora_saida != null){
            this.hora_saida = hora_saida;
        }else{
            throw new Exception("Erro!\nNecessário informa a Hora de Saida do funcionário.");
        }
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }    
}
