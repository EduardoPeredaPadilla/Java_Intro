/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra15;

import java.util.Scanner;

public class JavaEjerExtra15 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa 2 números");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int opcion = 0;
      
        do {
            
            System.out.println("Eliga una opción");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = scan.nextInt();
            
            if (opcion < 1 || opcion > 6) {
                System.out.println("Opcion inválida");
                System.out.println("Eliga una opción");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                opcion = scan.nextInt();
            }
            
            switch (opcion) {
            case 1:
                System.out.println("Elegiste la opción 1. Sumar");
                int respSuma = Sumar(num1, num2);
                System.out.println("El resultado de sumar "+ num1 + " + " + num2 +" = " + respSuma);
                break;
            case 2:
                System.out.println("Elegiste la opción 2. Restar");
                int respResta = Restar(num1, num2);
                System.out.println("El resultado de restar "+ num1 + " - " + num2 +" = " + respResta);
                break;
            case 3:
                System.out.println("Elegiste la opción 3. Multiplicar");
                int respMult = Multiplicar(num1, num2);
                System.out.println("El resultado de multiplicar "+ num1 + " * " + num2 +" = " + respMult);
                break;
            case 4:
                System.out.println("Elegiste la opción 4. Dividir");
                float respDiv = (float) Dividir(num1, num2);
                System.out.println("El resultado de dividir "+ num1 + " / " + num2 +" = " + respDiv);
                break;
            case 5:
                System.out.println("Elegista la opción 5. Salir");
                System.out.println("Hasta pronto!");
                break;
            }
        } while (opcion != 5);
        
    }
    
    public static int Sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
    
    public static int Restar(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
}
    
    public static int Multiplicar(int num1, int num2) {
        int mult = num1 * num2;
        return mult;
    }
    
    public static float Dividir(int num1, int num2) {
        float div = (float) num1 / num2;
        return div;
    }
    
}
