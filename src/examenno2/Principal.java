/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenno2;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE-IS
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int centinela=1;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Bienvenido al Sistema"); 
            System.out.println("Seleccione una Opcion");
            System.out.println(" 1 - Departamentos");
            System.out.println(" 2 - Municipios");
            System.out.println(" 3 - Relaciones");
            System.out.println(" 4 - Salir");
            int opcion=sc.nextInt();
       
            
        }while(centinela==1);
          
        
    }
    
}
