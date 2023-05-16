/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JavaEjerExtra7 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de números a evaluar");
        int n = scan.nextInt();
        int bucle = 0;
        
        do {
            System.out.println("Seleccione el tipo de bucle a utilizar");
            System.out.println("1. while");
            System.out.println("2. do-while");
            bucle = scan.nextInt();
        } while (bucle < 1 || bucle > 2);
        
        if (bucle == 1) {
            bucleWhile(n);
        } else {
            bucleDoWhile(n);
        }
        
    }
    
    public static void bucleWhile(int n) {
        
        Scanner scan = new Scanner(System.in);
        int numMax = 0;
        int numMin = 1000;
        int i = 0;
        int suma = 0;
        float prom = (float) 0.00;
        DecimalFormat formatoProm = new DecimalFormat("#0.00");
        
        while ( i < n) {
            System.out.println("Ingrese el valor para el número " + (i + 1));
            int num = scan.nextInt();
            if ( i == 0) {
                numMin = num;
            }
            i = i + 1;
            suma = suma + num;
            if ( num > numMax) {
                numMax = num;
            } else if ( num < numMin) {
                numMin = num;
            }
        }
       
        prom = (float) suma / n; 
        System.out.println("El número máximo ingresado fue " + numMax);
        System.out.println("El número mínimo ingresado fue " + numMin);
        System.out.println("El promedio de los números ingresados fue " + formatoProm.format(prom));

    }
    
    public static void bucleDoWhile(int n) {
        
        Scanner scan = new Scanner(System.in);
        int numMax = 0;
        int numMin = 10000;
        int i = 0;
        int suma = 0;
        float prom = (float) 0.00;
        DecimalFormat formatoProm = new DecimalFormat("#0.00");
        
        do {
             System.out.println("Ingrese el valor para el número " + (i + 1));
            int num = scan.nextInt();
            if ( i == 0) {
                numMin = num;
            }
            i = i + 1;
            suma = suma + num;
            if ( num > numMax) {
                numMax = num;
            } else if ( num < numMin) {
                numMin = num;
            }
        } while (i < n);
        
        prom = (float) suma / n; 
        System.out.println("El número máximo ingresado fue " + numMax);
        System.out.println("El número mínimo ingresado fue " + numMin);
        System.out.println("El promedio de los números ingresados fue " + formatoProm.format(prom));

}
    
}
