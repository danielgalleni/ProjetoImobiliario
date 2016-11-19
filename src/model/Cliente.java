/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import anotacao.*;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Galleni
 * @author Gonzalez
 */
@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa {
    
    public Cliente(Integer codigo, String nome, String endereco, String estado, String bairro, String numero, String cidade, String cpf, String rg, String email) {
        super(codigo, nome, endereco, estado, bairro, numero, cidade, cpf, rg, email);
    }

    public Cliente() {
        
    }
    
    @ManyToOne
    @JoinColumn(name = "codigo_cliente")    
    private Pessoa pessoa;

    
}