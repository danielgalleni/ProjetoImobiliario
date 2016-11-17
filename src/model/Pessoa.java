/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import classes.Anotacao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Gonzalez
 */
@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa extends Anotacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;

        
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 100, nullable = false)
    private String endereco;
    @Column(length = 2, nullable = false)
    private String estado;
    @Column(length = 50, nullable = false)
    private String bairro;
    @Column(length = 20, nullable = false)    
    private String numero;
    @Column(length = 50, nullable = false)
    private String cidade;
    @Column(length = 14, nullable = false)
    private String cpf;
    @Column(length = 12, nullable = false)
    private String rg;
    @Column(length = 100, nullable = true)
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

    @Campo(nome="Código", posicao=0, formato="%i")
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) throws Exception {
        if (codigo > 0){
            this.codigo = codigo;
        }else{
            throw new Exception("Erro!\nVerifique. Código menor que zero.");            
        }
    }

    @Campo(nome="Nome", posicao=1, formato="%s")
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

    @Campo(nome="Endereço", posicao=2, formato="%s")
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

    @Campo(nome="UF", posicao=3, formato="%s")
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

    @Campo(nome="Bairro", posicao=4, formato="%s")
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

    @Campo(nome="Número", posicao=5, formato="%s")
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

    @Campo(nome="Cidade", posicao=6, formato="%s")
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

    @Campo(nome="CPF", posicao=7, formato="%s")
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

    @Campo(nome="RG", posicao=8, formato="%s")
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

    @Campo(nome="E-mail", posicao=9, formato="%s")
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