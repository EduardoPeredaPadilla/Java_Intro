/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer5;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa un número");
        int num = scan.nextInt();
        
        int doble = num * 2;
        int triple = num * 3;
        float raiz = (float) Math.sqrt(num);
        
        System.out.println("El doble del número " + num + ", es = " + doble);
        System.out.println("El triple del número " + num + ", es = " + triple);
        System.out.println("La raiz cuadrada del número " + num + ", es = " + raiz);
    }
    
}
