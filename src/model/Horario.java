/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gonzalez
 */
public class Horario {
    private Integer codigo;
    private String hora_entrada;
    private String hora_saida;

    public Horario(Integer codigo, String hora_entrada, String hora_saida) {
        this.codigo = codigo;
        this.hora_entrada = hora_entrada;
        this.hora_saida = hora_saida;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo)throws Exception {
        if(codigo >0){
            this.codigo = codigo;
        }else{
            throw new Exception("Erro!\nVerifique. Código menor que zero.");            
        }
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada)throws Exception {
        if(hora_entrada != null){
            this.hora_entrada = hora_entrada;
        }else{
            throw new Exception("Erro!\nNecessário informar a Hora Entrada para Cadastro.");
        }
    }

    public String getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(String hora_saida)throws Exception {
        if(hora_saida != null){
            this.hora_saida = hora_saida;
        }else{
            throw new Exception("Erro!\nNecessário informar a Hora de Saída para Cadastro.");
        }
    }
    
}
