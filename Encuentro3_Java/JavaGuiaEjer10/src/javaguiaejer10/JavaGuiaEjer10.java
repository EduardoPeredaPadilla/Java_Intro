/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer10;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un valor límite positivo");
        int numLimit = scan.nextInt();
        
        int suma = 0;
        
        do {
            
            System.out.println("Ingrese un número para sumarlo");
            int num = scan.nextInt();
            
            suma = suma + num;
            
        } while (suma <= numLimit);
        
        System.out.println("La suma de los número ingresados es " + suma + ", y supera el límite positivo determinado en " + numLimit);
        
    }
    
    
}
