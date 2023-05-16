/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra16;

import java.util.Scanner;

public class JavaEjerExtra16 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            System.out.println("Ingrese un nombre");
            String nombre = scan.nextLine();
            System.out.println("Ingrese la edad de " + nombre);
            int edad = scan.nextInt();
            
            if (edad < 18) {
                System.out.println(nombre + " tiene " + edad + " años, y es menor de edad");
            } else {
                System.out.println(nombre + " tiene " + edad + " años, y es mayor de edad");
            }
            
            System.out.println("¿Desea seguir mostrando personas?");
            String resp = scan.nextLine();
            if (!resp.equals("No")) {
                System.out.println("Continuemos");
            } else if (resp.equals("No")) {
                System.out.println("Hasta pronto!");
            }

        while (!resp.equals("No")) {
            System.out.println("Ingrese un nombre");
            nombre = scan.nextLine();
            System.out.println("Ingrese la edad de " + nombre);
            edad = scan.nextInt();
            
            if (edad < 18) {
                System.out.println(nombre + " tiene " + edad + " años, y es menor de edad");
            } else {
                System.out.println(nombre + " tiene " + edad + " años, y es mayor de edad");
            }
            
            System.out.println("¿Desea seguir mostrando personas?");
            resp = scan.nextLine();
            if (!resp.equals("No")) {
                System.out.println("Continuemos");
            } else if (resp.equals("No")) {
                System.out.println("Hasta pronto!");
            }
        }
        
        
    }
    
}
