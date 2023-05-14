/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer7;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la frase secreta");
        
        String frase = scan.nextLine();
        
        boolean respuesta = frase.equals("eureka");
        
        if (respuesta == true) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
