package Clases;


public class ClsCandidatoXEleccion {

    private int id_CandidatoXEleccion;
    private int IdEleccion;
    private String IdCandidato;

    public ClsCandidatoXEleccion(String idCxE, String idEleccion, String idCandidato ) {
        this.id_CandidatoXEleccion = Integer.parseInt(idCxE);
        this.IdEleccion = Integer.parseInt(idEleccion);
        this.IdCandidato = idCandidato;
    }

    public ClsCandidatoXEleccion(int idEleccion) {
        this.IdEleccion = idEleccion;
    }

    public int getIdEleccion() {
        return IdEleccion;
    }

    public String getIdCandidato() {
        return IdCandidato;
    }

}