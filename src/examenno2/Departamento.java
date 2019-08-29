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
public class Departamento {
    private int IdDept;//Identificacion del Departamento
    private String NmDept;//Nombre del Departamento

    public int getIdDept() {
        return IdDept;
    }

    public void setIdDept(int IdDept) {
        this.IdDept = IdDept;
    }

    public String getNmDept() {
        return NmDept;
    }

    public void setNmDept(String NmDept) {
        this.NmDept = NmDept;
    }

    @Override
    public String toString() {
        return "Identificador de el Departamento = " + IdDept + "\nNombre del Departamento = " + NmDept;
    }
    
    
}
