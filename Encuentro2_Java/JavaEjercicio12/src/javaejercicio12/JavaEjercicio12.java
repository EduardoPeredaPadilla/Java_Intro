/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio12;

import java.util.Scanner;


public class JavaEjercicio12 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingrese 2 números para validar si el primero es multiplo del segundo");
        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();
        
        boolean retorno = Validar(num1,num2);
        
        if (retorno == true) {
            System.out.println("El primer número "+ num1 + " es multiplo del segundo número " + num2);
        }else {
            System.out.println("No son multiplos");
        }
        
        
        
    }
    
         public static boolean Validar(int num1, int num2) {
            
             boolean resp = false;

             float division = (float) num2 / num1;
             int entero = (int) Math.abs(division);
             float fin = division - entero;
             
             /*
             System.out.println(division);
             System.out.println(entero);
             System.out.println(fin);
             */
 
            if (fin == 0.0) {
                resp = true;
            } 

            return resp;
    }
    
}
