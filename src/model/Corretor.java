/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Gonzalez
 */

@Entity
@Table(name = "Corretor")
public class Corretor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Auto incrimento
    private int codigo_corretor;
    private String nome;
    private String cidade;
    private String estado;
    private String endereco;
    private String bairro;
    private String numero;
    private String email;
    
    
    public Corretor(){
    
    }
    
    public Corretor(String nome, String cidade, String endereco, String bairro, String numero)throws Exception{
        if((nome != null) && (cidade != null) && (estado != null) && (endereco != null) && (bairro != null) && (numero != null)){
            this.setNome(nome);
            this.setCidade(cidade);
            this.setEstado(estado);
            this.setEndereco(endereco);
            this.setBairro(bairro);
            this.setNumero(numero);
        }else{
            throw new Exception("Erro!\nDados obrigatórios não preenchidos, por favor verifique!");
        }
        
    }

    public int getCodigo_corretor() {
        return codigo_corretor;
    }

    public void setCodigo_corretor(int codigo_corretor) throws Exception {
        if(codigo_corretor > 0){
            this.codigo_corretor = codigo_corretor;
        }else{
            throw new Exception("Erro!\nHouve algum problema com o código, por favor verifique!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome != null){
            this.nome = nome;
        }else{
            throw new Exception("Erro!\nNecessário informar o Nome do corretor.");
        }
    }

    public String getCidade() {
        return cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCidade(String cidade) throws Exception {
        if (cidade != null){
            this.cidade = cidade;
        }else{
            throw new Exception("Erro!\nNecessário informar a Cidade do corretor.");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws Exception {
        if (endereco != null){
            this.endereco = endereco;
        }else{
            throw new Exception("Erro!\nNecessário informar o Endereço do corretor.");
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) throws Exception {
        if (estado != null){
            this.estado = estado;
        }else{
            throw new Exception("Erro!\nNecessário informa o Estado do corretor.");
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws Exception{
        if (bairro != null){
            this.bairro = bairro;
        }else{
            throw new Exception("Erro!\nNecessário informar o Bairro do corretor.");
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws Exception {
        if (numero != null){
            this.numero = numero;
        }else{
            throw new Exception("Erro!\nNecessário informar o Número do corretor.");
        }
    }
}
