/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import anotacao.*;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Gonzalez
 * @author Galleni
 */

//@ - Anotação
@Entity
@Table(name = "funcionario")
public class Funcionario extends Pessoa{
    
    private String cargo;
    private String setor;
    private String hora_entrada;
    private String hora_saida;
    private Float salario;  

    public Funcionario(Integer codigo, String nome, String endereco, String estado, String bairro, String numero, String cidade, String cpf, String rg, String email) throws Exception {
        super(codigo, nome, endereco, estado, bairro, numero, cidade, cpf, rg, email);
        
        if ((cargo != null) && (setor != null) && (hora_entrada != null) && (hora_saida != null) && (salario != null)){
            this.setCargo(cargo);
            this.setSetor(setor);
            this.setHora_entrada(hora_entrada);
            this.setHora_saida(hora_saida);
            this.setSalario(salario);
        }else{
            throw new Exception("Erro!\nNecessário preencher todos os campos obrigatórios, verifique!");
        }
        
    }

    public Funcionario() {
        
    }
    
    @Campo(nome="Cargo", posicao=0, formato="%i")
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

    @Campo(nome="Setor", posicao=1, formato="%s")
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

    @Campo(nome="Hora de Entrada", posicao=2, formato="%tH:%tM:%tS")
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

    @Campo(nome="Hora de Saída", posicao=3, formato="%tH:%tM:%tS")
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

    @Campo(nome="Salário", posicao=4, formato="R$ %,#.2f")
    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) throws Exception {
        if (salario != null){
            this.salario = salario;
        }else{
            throw new Exception("Erro!\nÉ necessário informa o Salário do funcionário.");
        }
    }    
}
