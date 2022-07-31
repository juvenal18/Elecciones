package Modelos;

import Clases.ClsPersona;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;


public class MdlPersona {

    ClsJdbc jdbc;

    public MdlPersona() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }

    public ClsMensaje agregarPersona(ClsPersona Persona) {

        ClsMensaje mensaje = new ClsMensaje();

        try {

            String sql = "INSERT INTO tbl_votantes  VALUES ( ?, ?, ?, ?)";

            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, Persona.getNumeroDocumento());
            sentencia.setString(2, Persona.getNombre());
            sentencia.setString(3, Persona.getTelefono());
            sentencia.setString(4, Persona.getCorreo());

            int resultado = sentencia.executeUpdate();

            if (resultado == 1) {
                mensaje.CambiarMensaje(mensaje.OK, "Has creado una nueva Persona");
            } else {

                mensaje.CambiarMensaje(mensaje.ERROR, "Error, no encontrado");
            }

            return mensaje;

        } catch (Exception e) {
            mensaje.CambiarMensaje(mensaje.ERROR, "Excepción: " + e.getMessage());
            return mensaje;
        }

    }

    public ClsMensaje ActualizarPersona(ClsPersona Persona) {
        ClsMensaje mensaje = new ClsMensaje();

        try {

            String sql = "UPDATE tbl_votantes SET nombre = ?, telefono = ?, correo = ? where id_votante = ?";

            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, Persona.getNombre());
            sentencia.setString(2, Persona.getTelefono());
            sentencia.setString(3, Persona.getCorreo());
            sentencia.setString(4, Persona.getNumeroDocumento());

            int resultado = sentencia.executeUpdate();

            if (resultado == 1) {
                mensaje.CambiarMensaje(mensaje.OK, "Has editado a la Persona: " + Persona.getNombre());
            } else {

                mensaje.CambiarMensaje(mensaje.ERROR, "Error, no encontrado");
            }

            return mensaje;

        } catch (Exception e) {
            mensaje.CambiarMensaje(mensaje.ERROR, "Excepción: " + e.getMessage());
            return mensaje;
        }

    }

    public ClsMensaje EliminarPersona(String idPersona) {

        ClsMensaje mensaje = new ClsMensaje();

        try {

            String sql = "DELETE FROM tbl_votantes WHERE id_votante = ?";

            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, idPersona);

            int resultado = sentencia.executeUpdate();

            if (resultado == 1) {
                mensaje.CambiarMensaje(mensaje.OK, "Has eliminado a la Persona: " + idPersona);
            } else {

                mensaje.CambiarMensaje(mensaje.ERROR, "Error, no encontrado");
            }

            return mensaje;

        } catch (Exception e) {
            mensaje.CambiarMensaje(mensaje.ERROR, "Excepción: " + e.getMessage());
            return mensaje;
        }

    }  

    public LinkedList<ClsPersona> ObtenerPersonas() {

        try {

            LinkedList<ClsPersona> listaPersonas = new LinkedList<>();

            String sql = "SELECT * FROM tbl_votantes";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String numeroDocumento = resultados.getString("id_votante");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");

                ClsPersona persona = new ClsPersona(numeroDocumento, nombre, telefono, correo);

                listaPersonas.add(persona);

            }

            return listaPersonas;

        } catch (Exception e) {

            System.out.println("Error" + e.getMessage());
            return null;
        }

    }

}
