/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra8;

import java.util.Scanner;

public class JavaEjerExtra8 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int cantNum = 0;
        int cantPar = 0;
        int cantImpar = 0;
        float result = (float) 0.0;
        
        
        do {
            System.out.println("Ingrese un número entero");
            num = scan.nextInt();
            
            if (num > 0) {
                cantNum = cantNum + 1;
                
                if (num % 2 == 0) {
                    cantPar = cantPar + 1;
                } else {
                    cantImpar = cantImpar + 1;
                }
            }
            
            float div = (float) num / 5;
            int res = (int) Math.floor(div);
            
            result = (float) div - res; 
            /*
            System.out.println(div);
            System.out.println(res);
            System.out.println(result);
            */
        } while (result > 0.0);
        
        System.out.println("Ingresaste un múltiplo de 5");
        System.out.println("La cantidad de números ingresados fue de " + cantNum);
        System.out.println("La cantidad de números pares ingresados fue de " + cantPar);
        System.out.println("La cantidad de números impares ingresados fue de " + cantImpar);
        
    }
    
}
