
package Controladores;

import Clases.ClsPersona;
import Clases.ClsMensaje;
import Modelos.MdlPersona;
import java.util.LinkedList;


public class CtlPersona {

    MdlPersona modelo;

    public CtlPersona() {

        this.modelo = new MdlPersona();
    }

    public ClsMensaje AgregarPersona(ClsPersona Persona) {

        ClsMensaje respuesta = this.modelo.agregarPersona(Persona);
        return respuesta;
    }

    public ClsMensaje ActualizarPersona(ClsPersona Persona) {

        ClsMensaje respuesta = this.modelo.ActualizarPersona(Persona);
        return respuesta;
    }

    public ClsMensaje EliminarPersona(String idPersona) {
        ClsMensaje respuesta = this.modelo.EliminarPersona(idPersona);
        return respuesta;
    }

    public LinkedList<ClsPersona> ObtenerPersonas() {

        return this.modelo.ObtenerPersonas();

    }    
     
}
