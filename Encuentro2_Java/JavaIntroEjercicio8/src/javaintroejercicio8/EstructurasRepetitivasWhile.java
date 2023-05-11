/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejercicio8;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class EstructurasRepetitivasWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        /**
        String respuesta = "S";
        
        while (respuesta.equalsIgnoreCase("S")) {
            
            System.out.println("¿Desea continuar?");
            respuesta = leer.nextLine();
        }
       */ 
        
        System.out.println("Ingrese una nota válida entre 0 y 10");
        
        int nota = leer.nextInt();
        
        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese una nota válida entre 0 y 10");
            nota = leer.nextInt();
        }
    }
    
}
