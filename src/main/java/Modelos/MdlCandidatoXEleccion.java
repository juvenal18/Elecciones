package Modelos;

import Clases.ClsCandidatoXEleccion;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;


public class MdlCandidatoXEleccion {

    ClsJdbc jdbc;

    public MdlCandidatoXEleccion() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }

    public LinkedList<ClsCandidatoXEleccion> ObtenerCandidatoXElecciones(int idElecciones) {

        try {

            LinkedList<ClsCandidatoXEleccion> listaCandidatoXElecciones = new LinkedList<>();

            String sql = "SELECT * FROM tbl_candidato_x_elec WHERE id_elecciones = ?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, Integer.toString(idElecciones));
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String id_CandidatoXEleccion = resultados.getString("id_vxe");
                String IdEleccion = resultados.getString("id_eleccion");
                String IdCandidato = resultados.getString("id_candidato");

                ClsCandidatoXEleccion CandidatoXEleccion = new ClsCandidatoXEleccion(id_CandidatoXEleccion, IdEleccion, IdCandidato);

                listaCandidatoXElecciones.add(CandidatoXEleccion);

            }

            return listaCandidatoXElecciones;

        } catch (Exception e) {

            System.out.println("Error" + e.getMessage());
            return null;
        }

    }

}
