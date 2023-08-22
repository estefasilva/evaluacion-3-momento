/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaevaluacion;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Matriz {

    public static void main(String[] args) {

        //Cree una matriz  3 * 3 en la que almacene las edades de sus 
        //familiares mas allegados. Cree un loop que recorra e imprima la matriz.
        int[][] matrizEdades = {
            {25, 31, 11},
            {50, 53, 57},
            {81, 74, 15},};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrizEdades.length; i++) {
            for (int j = 0; j < matrizEdades[i].length; j++) {
                System.out.println(matrizEdades[i][j]+ "\t");
   }
    System.out.println();
    }
    }
}

