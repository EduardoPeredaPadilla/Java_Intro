/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejercicio5;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class IngresarInformacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa los siguientes tipos de datos:");
        
        System.out.println("Booleano:");
        boolean logico = leer.nextBoolean();
        
        System.out.println("Decimal:");
        double decimal = leer.nextDouble();
        
        System.out.println(logico);
        System.out.println(decimal);
    }
    
}
