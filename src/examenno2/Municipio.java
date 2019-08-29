/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenno2;

/**
 *
 * @author ESTUDIANTE-IS
 */
public class Municipio {
    private int IdMun;//Identificador del Municipio 
    private String NmMun;//Nombre de el Municipio

    public Municipio(int IdMun, String NmMun) {
        this.IdMun = IdMun;
        this.NmMun = NmMun;
    }

    public int getIdMun() {
        return IdMun;
    }

    public void setIdMun(int IdMun) {
        this.IdMun = IdMun;
    }

    public String getNmMun() {
        return NmMun;
    }

    public void setNmMun(String NmMun) {
        this.NmMun = NmMun;
    }

    @Override
    public String toString() {
        return "Identificador del Municipío = " + IdMun + "\nNombre del Municipio = " + NmMun;
    }
    
    
}
