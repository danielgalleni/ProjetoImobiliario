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

public class Imovel extends Pessoa {
  //  @Id
  //  @GeneratedValue(strategy = GenerationType.AUTO) //Auto incrimento
    private String cidade_imovel;
    private String endereco_imovel;
    private String bairro_imovel;
    private String numero_imovel;
    private String estado_imovel;
    private String metros_quadrados;
    private String area_construida;
    private String observacao;

    public Imovel(String cidade_imovel, String endereco_imovel, String bairro_imovel, String numero_imovel, String estado_imovel, String metros_quadrados, String area_construida, String observacao, Integer codigo, String nome, String endereco, String estado, String bairro, String numero, String cidade, String cpf, String rg, String email) throws Exception {
        super(codigo, nome, endereco, estado, bairro, numero, cidade, cpf, rg, email);
        
        if ((cidade_imovel != null) && (endereco_imovel != null) && (bairro_imovel != null) && (numero_imovel != null) &&
           (estado_imovel != null) && (metros_quadrados != null) && (area_construida != null)) {
            
            this.cidade_imovel = cidade_imovel;
            this.endereco_imovel = endereco_imovel;
            this.bairro_imovel = bairro_imovel;
            this.numero_imovel = numero_imovel;
            this.estado_imovel = estado_imovel;
            this.metros_quadrados = metros_quadrados;
            this.area_construida = area_construida;
            this.observacao = observacao;
        }else{
            throw new Exception("Erro!\nNecessário preencher todos os campos obrigatórios, verifique!");
        }
    }
    
    public String getCidade_imovel() {
        return cidade_imovel;
    }

    public void setCidade_imovel(String cidade_imovel) throws Exception {
        if (cidade_imovel != null){
            this.cidade_imovel = cidade_imovel;
        }else{
            throw new Exception("Erro!\nÉ necessário informar a Cidade do imóvel.");            
        }
    }

    public String getEndereco_imovel() {
        return endereco_imovel;
    }

    public void setEndereco_imovel(String endereco_imovel) throws Exception {
        if (endereco_imovel != null){
            this.endereco_imovel = endereco_imovel;
        }else{
            throw new Exception("Erro!\nÉ necessário informar o Endereço do imóvel."); 
        }
    }

    public String getBairro_imovel() {
        return bairro_imovel;
    }

    public void setBairro_imovel(String bairro_imovel) throws Exception {
        if (bairro_imovel != null){
            this.bairro_imovel = bairro_imovel;
        }else{
            throw new Exception("Erro!\nÉ necessário informar o Bairro do imóvel."); 
        }
    }

    public String getNumero_imovel() {
        return numero_imovel;
    }

    public void setNumero_imovel(String numero_imovel) throws Exception {
        if (numero_imovel != null){
            this.numero_imovel = numero_imovel;
        }else{
            throw new Exception("Erro!\nÉ necessário informar o Número do imóvel."); 
        }
    }

    public String getEstado_imovel() {
        return estado_imovel;
    }

    public void setEstado_imovel(String estado_imovel) throws Exception {
        if (estado_imovel != null){
            this.estado_imovel = estado_imovel;
        }else{
            throw new Exception("Erro!\nÉ necessário informar o Estado do imóvel."); 
        }
    }
    
    public String getMetros_quadrados() {
        return metros_quadrados;
    }

    public void setMetros_quadrados(String metros_quadrados) throws Exception  {
        if (metros_quadrados != null){
            this.metros_quadrados = metros_quadrados;
        }else{
            throw new Exception("Erro!\nÉ necessário informar o Tamanho do imóvel.");
        }
    }

    public String getArea_construida() {
        return area_construida;
    }

    public void setArea_construida(String area_construida) throws Exception {
        if (area_construida != null){
            this.area_construida = area_construida;
        }else{
            throw new Exception("Erro!\nÉ necessário informa a Área do imóvel.");
        }
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
  
    
}
