/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JavaEjerExtra6 {

 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int c = 0;
        float sumAltTotal = (float) 0.00;
        float sumAltDebajo = (float) 0.00;
        float promAltTotal = (float) 0.00;
        float promAltDebajo = (float) 0.00;
        int nPersonasDebajo = 0;
        
        System.out.println("Ingresa el número de personas");
        int nPersonas = scan.nextInt();
        
        for (int i = 0; i < nPersonas; i++) {
            System.out.println("Ingresa la altura de la persona " + (i + 1));
            float altura = (float) scan.nextFloat();
            if (altura < 1.60) {
                sumAltDebajo = sumAltDebajo + altura;
                nPersonasDebajo = nPersonasDebajo + 1;
                sumAltTotal = sumAltTotal + altura;
            } else {
                sumAltTotal = sumAltTotal + altura;
            }
        }
        
        promAltTotal = sumAltTotal / nPersonas;
        promAltDebajo = sumAltDebajo / nPersonasDebajo;
        
        DecimalFormat formatoProm = new DecimalFormat("#0.00");
        
        System.out.println("El promedio de altura de personas que se encuentran por debajo de 1.60 m. es " + formatoProm.format(promAltDebajo));
        System.out.println("El promedio de altura del total de las personas es de " +  formatoProm.format(promAltTotal));
        
    }
    
}
