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
public class Cargo {
    private Integer codigo;
    private String cargo;

    public Cargo(Integer codigo, String cargo) {
        this.codigo = codigo;
        this.cargo = cargo;
    }

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) throws Exception {
        if(cargo != null){
            this.cargo = cargo;
        }else{
            throw new Exception("Erro!\nNecessário informar o Cargo para Cadastro.");
        }
    }
    
}
