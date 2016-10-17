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
    private String metros_quadrados;
    private String area_construida;
    private String observacao;

    public Imovel(Integer codigo, String nome, String endereco, String estado, String bairro, String numero, String cidade, String cpf, String rg, String email) {
        super(codigo, nome, endereco, estado, bairro, numero, cidade, cpf, rg, email);
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
