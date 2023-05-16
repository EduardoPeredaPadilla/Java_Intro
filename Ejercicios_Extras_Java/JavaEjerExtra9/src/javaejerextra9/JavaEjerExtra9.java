/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra9;

import java.util.Scanner;

public class JavaEjerExtra9 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num1 = 50;
        int num2 = 13;
        int aux = 0;
        int c = 0;
        int rest = 1000;
        
        do {
            rest = num1 - num2;
            c = c + 1;
            num1 = rest;
        } while (rest > num2);
        
        System.out.println("Dado que " + rest + " es menor que " + num2 + ", entonces :");
        System.out.println("El residuo es " + rest + ", y el cociente es " + c);
        
        
    }
    
}
