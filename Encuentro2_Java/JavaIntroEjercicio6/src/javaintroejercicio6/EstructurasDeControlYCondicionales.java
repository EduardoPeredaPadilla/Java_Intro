/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejercicio6;

import java.util.Scanner;


public class EstructurasDeControlYCondicionales {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros");
        System.out.println("Ingrese el primer número:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25) {
            System.out.println("Los números ingresados " + num1 + " y " + num2 + ", son mayores a 25");
        }else if (num1 > 25) {
            System.out.println("El primer número ingresado " + num1 + ", es mayor a 25");
        }else if (num2 > 25) {
            System.out.println("El segundo número ingresado " + num2 + ", es mayor a 25");
        }else {
            System.out.println("Ninguno de los números ingresados " + num1 + " y " + num2 + ", es mayor a 25");
        }
    }
    
}
