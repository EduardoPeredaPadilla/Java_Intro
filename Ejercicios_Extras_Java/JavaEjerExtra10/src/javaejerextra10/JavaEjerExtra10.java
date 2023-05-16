/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra10;

import java.util.Scanner;


public class JavaEjerExtra10 {

  
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num1 = (int) (Math.random()*10+0);
        int num2 = (int) (Math.random()*10+0);
        int mult = num1 * num2;
        
        System.out.println("Adivina el resultado de una multiplicación de 2 números entre 0 y 10");
        int resp = scan.nextInt();
        
        while (resp != mult) {
            System.out.println("La respuesta es incorrecta, ingresa otra respuesta");
            resp = scan.nextInt();
        }
        
        System.out.println("Respuesta correcta, resultado :");
        System.out.println(num1 + " * " + num2 + " = " + mult);
        System.out.println("Tu respuesta fue = " + resp);
        
    }
    
}
