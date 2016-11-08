/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.lang.annotation.*;
import java.lang.reflect.*;

/**
 *
 * @author Galleni
 */
public class Anotacao {
    // <editor-fold desc="Anotações">
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Campo {
        String nome();
        int posicao();
        String formato();
    }
    // </editor-fold>
}
