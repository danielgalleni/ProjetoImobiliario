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

public class Imovel extends Pessoa {
  //  @Id
  //  @GeneratedValue(strategy = GenerationType.AUTO) //Auto incrimento
    private String metros_quadrados;
    private String area_construida;
    private String observacao;

    public String getMetros_quadrados() {
        return metros_quadrados;
    }

    public void setMetros_quadrados(String metros_quadrados) {
        this.metros_quadrados = metros_quadrados;
    }

    public String getArea_construida() {
        return area_construida;
    }

    public void setArea_construida(String area_construida) {
        this.area_construida = area_construida;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
  
    
}
