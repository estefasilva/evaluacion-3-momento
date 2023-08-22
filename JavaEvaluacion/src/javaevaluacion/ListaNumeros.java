/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaevaluacion;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 503
 */
public class ListaNumeros {
//Empleando do- while, cree una funcionalidad que muestre permita agregar de manera continua 7 números,
//a una lista y salga de la misma al finalizar. 
//Del ejercicio anterior cree un loop que recorra la lista e imprima los elementos.
public static void main(String[] args) {
    
   List <Integer> numeros = new ArrayList<>();
   
   int contador = 0;
   Scanner scanner = new Scanner (System.in);
   do{
   System.out.println("ingrese el numero");
   int numero= scanner.nextInt();
   numeros.add(numero);
   contador++;
           }while (contador<7);
   for(int numero : numeros){
       System.out.println("");
   }
   }
   
   
   
    
    
    
}


 
