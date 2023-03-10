/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2.ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author matys
 */
public class Guia2Ejercicio5 {
/**
 * Escribir un programa que lea un número entero por teclado y muestre por
 * pantalla el doble, el triple y la raíz cuadrada de ese número.
 * Nota: investigar la función Math.sqrt().
 */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1;
        int doble;
        int triple;
        double raiz2;
        System.out.println("Introduce un número.");      
        num1 = reader.nextInt();
        doble = num1*2;
        triple = num1*3;
        raiz2 = Math.sqrt(num1); //si declaro raiz2 como float me dice que puedo perder datos al convertirse.
        System.out.println("El número ingresado es :" + num1);
        System.out.println("El doble del número ingresado es :" + doble);
        System.out.println("El triple del número ingresado es :" + triple);
        System.out.println("La raiz cuadrada del número ingresado es :" + raiz2);
        System.out.println("El número ingresado es " + num1 + ". El doble del número ingresado es " + doble + ". El triple del número ingresado es " + triple + ". La raiz cuadrada del número ingresado es " + raiz2);
       System.out.println("El número ingresado es " + num1 + ". El doble del número ingresado es " + num1*2 + ". El triple del número ingresado es " + num1*3 + ". La raiz cuadrada del número ingresado es " + Math.sqrt(num1));
    }
}
