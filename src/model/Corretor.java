/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import anotacao.*;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Galleni
 * @author Gonzalez
 */
public class Corretor extends Pessoa{

    public Corretor(Integer codigo, String nome, String endereco, String estado, String bairro, String numero, String cidade, String cpf, String rg, String email) {
        super(codigo, nome, endereco, estado, bairro, numero, cidade, cpf, rg, email);
    }

    public Corretor() {
 
    }
    
    @ManyToOne
    @JoinColumn(name = "codigo_corretor")    
    private Pessoa pessoa;
    
}
