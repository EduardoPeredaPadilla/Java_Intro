/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiejer4;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiEjer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de grados centígrados para dar su equivalente en Fahrenheit");
        
        float cent = scan.nextFloat();
        
        float fahr = (float) (32 + (9 * (cent/5)));
        
        System.out.println("El equivalente de " + cent + " grados centigrados a fahrenheit es " + fahr);
    }
    
}
