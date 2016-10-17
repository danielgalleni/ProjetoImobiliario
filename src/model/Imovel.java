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

@Entity
@Table(name = "Imovel")
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Auto incrimento
    private int codigo_imovel;
    private String cidade;
    private String endereco;
    private String bairro;
    private String numero;
    private String metros_quadrados;
    private String area_construida;
    private String observacao;
    
    public Imovel(){
    
    }
    
    public Imovel(String cidade, String endereco, String bairro, String numero, String metros_quadrados, String area_construida, String observacao) throws Exception{
        if((cidade != null) && (endereco != null) && (bairro != null) && (numero != null) && (metros_quadrados != null) && (area_construida != null) && (observacao != null)){
            this.setCidade(cidade);
            this.setEndereco(endereco);
            this.setBairro(bairro);
            this.setNumero(numero);
            this.setMetros_quadrados(metros_quadrados);
            this.setArea_construida(area_construida);
            this.setObservacao(observacao);
        }else{
            throw new Exception("Erro!\nDados obrigatórios não preenchidos, por favor verifique!");            
        }
    
    }

    public int getCodigo_imovel() {
        return codigo_imovel;
    }

    public void setCodigo_imovel(int codigo_imovel) throws Exception {
        if (codigo_imovel > 0){
            this.codigo_imovel = codigo_imovel;
        }else{
            throw new Exception("Erro!\nHouve algum problema com o código, por favor verifique!");    
        }
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) throws Exception {
        if (cidade != null){
            this.cidade = cidade;
        }else{
            throw new Exception("Erro!\nNecessário informar a Cidade do imóvel.");              
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws Exception {
        if (endereco != null){
            this.endereco = endereco;
        }else{
            throw new Exception("Erro!\nNecessário informar o Endereço do imóvel.");   
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws Exception {
        if (bairro != null){
            this.bairro = bairro;
        }else{
            throw new Exception("Erro!\nNecessário informar o Bairro do imóvel.");     
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws Exception {
        if (numero != null){
            this.numero = numero;
        }else{
            throw new Exception("Erro!\nNecessário informar o Número do imóvel.");
        }
    }

    public String getMetros_quadrados() {
        return metros_quadrados;
    }

    public void setMetros_quadrados(String metros_quadrados) throws Exception {
        if (metros_quadrados != null){
            this.metros_quadrados = metros_quadrados;
        }else{
            throw new Exception("Erro!\nNecessário informar o Tamanho do imóvel.");   
        }
    }

    public String getArea_construida() {
        return area_construida;
    }

    public void setArea_construida(String area_construida) throws Exception {
        if (area_construida != null){
            this.area_construida = area_construida;
        }else{
            throw new Exception("Erro!\nNecessário informar a Área Construida do imóvel.");        
        }
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
}
