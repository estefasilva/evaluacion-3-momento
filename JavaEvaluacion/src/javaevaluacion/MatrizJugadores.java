/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaevaluacion;

/**
 *
 * @author 503
 */
public class MatrizJugadores {
     public static void main(String[] args) {
         //Los siguientes son los datos de 3  jugadores de futbol: Jugador 1, Juan, “15 años”, delantero. 
         //Jugador 2: Pedro, “16 años” , defensa. Jugador 3: Luis , “17 años”, arquero. Cree una loop que imprima la información de los jugadores.
         //Indique la posición de arquero en el ejercicio anterior. Acceda al elemento.
         //Indique la posición de “16 años”. Acceda al elemento.
         
         String[] jugadores = {"juan", "pedro","luis"};
         int[]edades = {15, 16 , 17};
         String[]posiciones = {"delantero", "defensa", "arquero"};
         
         for(int i = 0; i < jugadores.length; i++){
             System.out.println("jugador:" + jugadores[i]);
             System.out.println("Edad:" + edades[i] + "años");
             System.out.println("posicion:" + posiciones[i]);
             if(posiciones[i].equals("arquero"))
             {
                 System.out.println("El arquero es el jugador numero:"+ (i+1));
             }
             if(edades[i]  == 16){
                 System.out.println("la posicion del jugador de 16 años es :" + jugadores[i]+ "que juega de posicion:" + posiciones[i]);
             }  
         }
         
         
     }
}
