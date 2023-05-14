/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer2;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        
        String nombre = scan.nextLine();
        
        System.out.println("Hola " + nombre + ", bienvenido de vuelta!");
    }
    
}
