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
public class Setor {
    private Integer codigo;
    private String setor;

    public Setor(Integer codigo, String Setor) {
        this.codigo = codigo;
        this.setor = Setor;
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

    public String getSetor() {
        return setor;
    }

    public void setSetor(String Setor) throws Exception {
        if(setor != null){
            this.setor = Setor;
        }else{
            throw new Exception ("Erro!\nNecessário informar o Setor para Cadastro.");
        }
    }
    
}
