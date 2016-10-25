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

/**
 *
 * @author Gonzalez
 */
public class Pessoa {
    private Integer codigo;
    private String nome;
    private String endereco;
    private String estado;
    private String bairro;
    private String numero;
    private String cidade;
    private String cpf;
    private String rg;  
    private String email;
    
    @OneToMany(mappedBy = "pessoa",cascade = CascadeType.ALL,orphanRemoval = true)    
    private List<Telefone> telefones = new ArrayList<>();

    public Pessoa() {
    }
    
    public Pessoa(Integer codigo, String nome, String endereco, String estado, String bairro, String numero, String cidade, String cpf, String rg, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.estado = estado;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) throws Exception {
        if (codigo < 0){
            this.codigo = codigo;
        }else{
            throw new Exception("Erro!\nVerifique. Código menor que zero.");            
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome != null){
            this.nome = nome;
        }else{
            throw new Exception("Erro!\nNecessário informar o Nome para cadastro.");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws Exception {
        if (endereco != null){
            this.endereco = endereco;
        }else{
            throw new Exception("Erro!\nNecessário informar o Endereço para cadastro.");            
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) throws Exception {
        if (estado != null){
            this.estado = estado;
        }else{
            throw new Exception("Erro!\nNecessário informar o Estado para cadastro.");            
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws Exception {
        if (bairro != null){
            this.bairro = bairro;
        }else{
            throw new Exception("Erro!\nNecessário informar o Bairro para cadastro.");
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws Exception {
        if (numero != null){
            this.numero = numero;
        }else{
            throw new Exception("Erro!\nNecessário informar o Número para cadastro.");
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) throws Exception {
        if (cidade != null){
            this.cidade = cidade;
        }else{
            throw new Exception("Erro!\nNecessário informar a Cidade para cadastro.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf != null){
            this.cpf = cpf;
        }else{
            throw new Exception("Erro!\nNecessário informar o CPF para cadastro.");            
        }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) throws Exception {
        if (rg != null){
            this.rg = rg;
        }else{
            throw new Exception("Erro!\nNecessário informar o RG para cadastro.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
    
}