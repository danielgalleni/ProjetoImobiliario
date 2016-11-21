/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import anotacao.Campo;
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
    
    public Cliente(Integer codigo, String nome, String endereco, String estado, String bairro, String numero, String cidade, String cpf, String rg, String email) throws Exception {
        super(codigo, nome, endereco, estado, bairro, numero, cidade, cpf, rg, email);
    }
    
    public Cliente(){
        
    }

    @Override
    @Campo(nome="E-mail", posicao=9, formato="%s")
    public String getEmail() {
        return super.getEmail(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Campo(nome="RG", posicao=8, formato="%s")
    public String getRg() {
        return super.getRg(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Campo(nome="CPF", posicao=7, formato="%s")
    public String getCpf() {
        return super.getCpf(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Campo(nome="Cidade", posicao=6, formato="%s")
    public String getCidade() {
        return super.getCidade(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Campo(nome="Número", posicao=5, formato="%s")
    public String getNumero() {
        return super.getNumero(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Campo(nome="Bairro", posicao=4, formato="%s")
    public String getBairro() {
        return super.getBairro(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Campo(nome="UF", posicao=3, formato="%s")
    public String getEstado() {
        return super.getEstado(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Campo(nome="Endereço", posicao=2, formato="%s")
    public String getEndereco() {
        return super.getEndereco(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    @Campo(nome="Nome", posicao=1, formato="%s")
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    @Campo(nome="Código", posicao=0, formato="%i")
    public Integer getCodigo() {
        return super.getCodigo(); //To change body of generated methods, choose Tools | Templates.
    }


    
    @ManyToOne
    @JoinColumn(name = "codigo_cliente")    
    private Pessoa pessoa;
    
}