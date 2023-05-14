/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra1;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaEjerExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa el tiempo en minutos");
        int min = scan.nextInt();
        
        Tiempo(min);
        
    }
    
    public static void Tiempo(int min) {
        
        int dias = 0;
        int horas = 0;
        int minutos = min;
        
        do {
            if (min >= 1440) {
                dias = dias+1;
                min = min - 1440;
            }
        } while (min >= 1440);
        
        do {
            if (min >= 60) {
                horas = horas+1;
                min = min - 60;
            }
        } while (min >= 60);
           
        System.out.println("El equivalente para " + minutos + " es = " + dias + " día(s), " + horas + " hora(s), y " + min + " minutos");
    }
    
}
