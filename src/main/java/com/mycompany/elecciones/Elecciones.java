
package com.mycompany.elecciones;
import Clases.ClsJdbc;


public class Elecciones {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        ClsJdbc jdbc = new ClsJdbc();
        jdbc.CrearConexion();
    }
}
