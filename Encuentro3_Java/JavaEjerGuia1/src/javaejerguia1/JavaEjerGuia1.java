/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerguia1;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaEjerGuia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese dos números para sumarlos");
        System.out.println("Ingrese el primer número");
        int num1 = scan.nextInt();
        
        System.out.println("Ingrese el segundo número");
        int num2 = scan.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("El resultado de la suma de los números " + num1 + " y " + num2 + " es igual a = " + suma);
    }
    
}
