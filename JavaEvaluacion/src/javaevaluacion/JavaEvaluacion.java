/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaevaluacion;

/**
 *
 * @author 503
 */
import java.util.Scanner;
import java.util.Arrays;

public class JavaEvaluacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cree una funcionalidad  que guarde en un array 6 nombres de compañeros, 
        //cree un ciclo que permita recorrerlo, muestre la extensión del mismo. Capture los nombres mediante el sistema.
       
        String[] nombreCompañero = new String[6];
        nombreCompañero[0]="raul";
        nombreCompañero[1]="jose";
        nombreCompañero[2]="ana";
        nombreCompañero[3]="flor";
        nombreCompañero[4]="juan";
        nombreCompañero[5]="pepito";
        
        

        for (int i = 0; i < nombreCompañero.length; i++) {
             Scanner scanner= new Scanner(System.in);
            System.out.println(nombreCompañero[i]);
            
        }
        System.out.println("la extension es:" + nombreCompañero.length);
        

  
      
      
      
      
      
      
      
    }

}
