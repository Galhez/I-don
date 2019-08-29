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
       switch(opcion){
           case 1:
           System.out.println("Submenu de Departamentos");
               System.out.println(" 1 - Agregar");
               System.out.println(" 2 - Eliminar");
               System.out.println(" 3 - Retornar a Menu Inicial");
               boolean ev1=true;
               while(ev1=true){
                   int opindp;//opcion internal del menu de departamento
                   opindp=sc.nextInt();
                   if(opindp==1){
                       System.out.println("...");
                   }if(opindp==2){
                       System.out.println(":::");
                   }if(opindp==3){
                       ev1=false;
                       break;
                   }else{
                       System.out.println("Opcion Erronea");
                   }
               }
           case 2:
           System.out.println("Submenu de Municipios");  
               System.out.println(" 1 - Agregar");
               System.out.println(" 2 - Eliminar");
               System.out.println(" 3 - Retornar a Menu Inicial");
                boolean ev2=true;
               while(ev2=true){
                   int opindp;//opcion internal del menu de departamento
                   opindp=sc.nextInt();
                   if(opindp==1){
                       System.out.println("...");
                   }if(opindp==2){
                       System.out.println(":::");
                   }if(opindp==3){
                       ev2=false;
                       break;
                   }else{
                       System.out.println("Opcion Erronea");
                   }
               }
           case 3:
           System.out.println("Submenu de Relaciones");    
               System.out.println(" 1 - Agregar");
               System.out.println(" 2 - Eliminar");
               System.out.println(" 3 - Retornar a Menu Inicial");
                boolean ev3=true;
               while(ev3=true){
                   int opindp;//opcion internal del menu de departamento
                   opindp=sc.nextInt();
                   if(opindp==1){
                       System.out.println("...");
                   }if(opindp==2){
                       System.out.println(":::");
                   }if(opindp==3){
                       ev3=false;
                       break;
                   }else{
                       System.out.println("Opcion Erronea");
                   }
               }
           default:
           System.out.println("Opción Erronea, Escoja una Opción válida.");
           break;
       } 
        }while(centinela==1);
          
        
    }
    
}
