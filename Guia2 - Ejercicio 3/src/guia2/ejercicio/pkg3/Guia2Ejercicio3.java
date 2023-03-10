/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author matys
 */
public class Guia2Ejercicio3 {
/**
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas
 * y después toda en minúsculas.
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase.");      
        frase = reader.nextLine();
        System.out.println("La frase ingresada y pasada a MAYÚSCULAS es: " + frase.toUpperCase());
        System.out.println("La frase ingresada y pasada a minúsculas es: " + frase.toLowerCase());
    }
}
