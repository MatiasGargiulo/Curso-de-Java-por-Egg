/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author matys
 */
public class Guia2Ejercicio1 {
/**
 * Escribir un programa que pida dos números enteros por teclado y calcule la
 * suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Introduce el primer número:");      
        num1 = reader.nextInt();
        System.out.println("Introduce el segundo número:");
        num2 = reader.nextInt();
        int resultado = num1+num2;
        System.out.println("La suma es: " + num1 + " + " + num2 + " = " + resultado);
        
    }
}
