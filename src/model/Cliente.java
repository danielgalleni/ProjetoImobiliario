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
 */

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Auto incrimento
    private int codigo_cliente;
    private String nome;
    private String endereco;
    private String bairro;
    private String numero;
    private String cidade;
    //private String telefone;
    //private String celular;
    private String cpf;
    private String rg;
    
    @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL,orphanRemoval = true)    
    private List<Telefone> telefones = new ArrayList<>();
    //@OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL,orphanRemoval = true)    
    //private List<Celular> celulares = new ArrayList<>();
    
    
    public Cliente(){
    
    }

    public Cliente(int codigo_cliente, String nome, String endereco, String bairro, String numero, String cidade, String cpf, String rg) {
        this.codigo_cliente = codigo_cliente;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.cpf = cpf;
        this.rg = rg;
    }

    
    
    public int getCodigo_Cliente() {
        return codigo_cliente;
    }

    public void setCodigo_Cliente(int codigo_cliente)throws Exception {
        if (codigo_cliente > 0){
            this.codigo_cliente = codigo_cliente;
        }else{
            throw new Exception("Erro!\nHouve algum problema com o código, por favor verifique!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome)throws Exception{
        if(nome != null){
            this.nome = nome;
        }else{
            throw new Exception("Erro!\nNecessário informar o Nome do cliente.");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco)throws Exception {
        if(endereco != null){
            this.endereco = endereco;
        }else{
            throw new Exception("Erro!\nNecessário informar o Endereço do cliente.");
        }
        
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro)throws Exception {
        if(bairro != null){
            this.bairro = bairro;
        }else{
            throw new Exception("Erro!\nNecessário informar o Bairro do cliente.");
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero)throws Exception {
        if(numero != null){
            this.numero = numero;
        }else{
            throw new Exception("Erro!\nNecessário informar o Número do cliente.");
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade)throws Exception {
        if(cidade != null){
            this.cidade = cidade;
        }else{
            throw new Exception("Erro!\nNecessário informar a Cidade do cliente.");
        }
    }

    /*public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws Exception {
        if(telefone != null){
            this.telefone = telefone;
        }else{
            throw new Exception("Erro!\nNecessário informar o Telefone do cliente.");
        }
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular)throws Exception {
        if(celular != null){
            this.celular = celular;
        }else{
            throw new Exception("Erro!\nNecessário informar o Celular do cliente");
        }
    }*/

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf)throws Exception {
        if(cpf != null){
            this.cpf = cpf;
        }else{
            throw new Exception("Erro!\nNecessário informar o CPF do cliente.");
        }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) throws Exception {
        if (rg != null){
            this.rg = rg;
        }else{
            throw new Exception("Erro!\nNecessário informa o RG do cliente.");
        }
    }
    
}
