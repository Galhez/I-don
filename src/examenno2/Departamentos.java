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
public class Departamentos {
    Departamento[] dp=new Departamento[20];
    
    public void Agregar(Departamento d){
        for(int i=0;i<dp.length;i++){
            if(dp[i]==null){
                dp[i]=d;
            }
        }
    }
}

