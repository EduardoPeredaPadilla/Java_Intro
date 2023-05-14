/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer14;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int moneda;
        
        System.out.println("Ingrese el monto en euros que desee realizar la conversión");
        int euros = scan.nextInt();
        
        do {
            
            System.out.println("Elige la opción demoneda a convertir");
            System.out.println("1. Libras");
            System.out.println("2. Dólares");
            System.out.println("3. Yenes");
            moneda = scan.nextInt();
            
            if (moneda < 1 || moneda > 3) {
                
                System.out.println("Opción inválida");
                System.out.println("Elige la opción demoneda a convertir");
                System.out.println("1. Libras");
                System.out.println("2. Dólares");
                System.out.println("3. Yenes");
                moneda = scan.nextInt();
                
            }
        } while (moneda < 1 ||  moneda > 3);
        
        Conversor(euros,moneda);

    }
    
    public static void Conversor(int euros, int moneda) {
        
        float libra = (float) 0.86;
        float dolar = (float) 1.28611;
        float yen = (float) 129.852;
        
        switch (moneda) {
            case 1:
                System.out.println("El tipo de cambio de " + euros + " euros a libras es " + (euros * libra));
                break;
            case 2:
                System.out.println("El tipo de cambio de " + euros + " euros a dólaares es " + (euros * dolar));
                break;
            case 3:
                System.out.println("El tipo de cambio de " + euros + " euros a yenes es " + (euros * yen));
                break;
                
        }
        
    }
    
}
