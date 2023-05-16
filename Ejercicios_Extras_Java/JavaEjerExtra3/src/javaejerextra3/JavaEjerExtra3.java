/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra3;

import java.util.Scanner;

public class JavaEjerExtra3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String letra = "inicio";
        
        do {
            System.out.println("Ingresa una letra");
            letra = scan.nextLine();
            
            if (letra.length() > 1) {
                System.out.println("Solo debes ingresar una letra");
                System.out.println("Ingresa una letra");
                letra = scan.nextLine();
            }
            
        } while (letra.length() > 1);
        
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
            System.out.println("La letra ingresada " + letra + " es una vocal");
        } else {
            System.out.println("La letra ingresada " + letra + " no es una vocal");
        }
        
    }
    
}
