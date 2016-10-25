/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

public class Cliente extends Pessoa {

    @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL,orphanRemoval = true)    
    private List<Telefone> telefones = new ArrayList<>();

    public Cliente(Integer codigo, String nome, String endereco, String estado, String bairro, String numero, String cidade, String cpf, String rg, String email) {
        super(codigo, nome, endereco, estado, bairro, numero, cidade, cpf, rg, email);
    }

    public Cliente() {
    }
    
}