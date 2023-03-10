/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author matys
 */
public class Guia2Ejercicio4 {
/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
 * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
        int temp1;
        int temp2;
        System.out.println("Introduce la temperatura en grados Celsius:");      
        temp1 = reader.nextInt();
        temp2 = (32 + 9 * temp1 /5);
        System.out.println("El equivalente a " + temp1 + "°C en grados Fahrenheit es: " + temp2 + "°F.");
    }
    
}
