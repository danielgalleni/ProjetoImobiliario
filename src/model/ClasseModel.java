/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.lang.annotation.*;

/**
 *
 * @author Galleni
 */
public class ClasseModel {
    // <editor-fold desc="Anotações">
    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Campo {
        String nome();
        int posicao();
    }
    
    private Integer campo;
    
    @Campo(nome="Código",posicao=0)
    public Integer getCampo(){
        return this.campo;
    }
    // </editor-fold>
}
