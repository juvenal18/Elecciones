
package Controladores;

import Clases.ClsCandidatoXEleccion;
import Clases.ClsMensaje;
import Modelos.MdlCandidatoXEleccion;
import java.util.LinkedList;


public class CtlCandidatoXEleccion {

    MdlCandidatoXEleccion modelo;

    public CtlCandidatoXEleccion() {

        this.modelo = new MdlCandidatoXEleccion();
    }

    public LinkedList<ClsCandidatoXEleccion> ObtenerCandidatoXElecciones(int ideleccion) {

        return this.modelo.ObtenerCandidatoXElecciones(ideleccion);

    }    
     
}
