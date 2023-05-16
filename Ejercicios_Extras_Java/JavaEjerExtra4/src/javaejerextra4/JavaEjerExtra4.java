/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra4;

import java.util.Scanner;

public class JavaEjerExtra4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num = 666;
        
        do {
            System.out.println("Ingresa un número entrero entre 1 y 10");
            num = scan.nextInt();
            if (num > 10) {
                System.out.println("El número ingresado está fuera del rango establecido");
                System.out.println("Ingresa un número entrero entre 1 y 10");
                num = scan.nextInt();
            }
            
        } while (num > 10);
        
        switch (num) {
            case 1:
                System.out.println("El número ingresado " + num + ", su equivalente en romano es I");
                break;
            case 2:
                System.out.println("El número ingresado " + num + ", su equivalente en romano es II");
                break;
            case 3:
                System.out.println("El número ingresado " + num + ", su equivalente en romano es III");
                break;
            case 4:
                System.out.println("El número ingresado " + num + ", su equivalente en romano es IV");
                break;
            case 5:
                System.out.println("El número ingresado " + num + ", su equivalente en romano es V");
                break;
            case 6:
                System.out.println("El número ingresado " + num + ", su equivalente en romano es VI");
                break;
            case 7:
                System.out.println("El número ingresado " + num + ", su equivalente en romano es VII");
                break;
            case 8:
                System.out.println("El número ingresado " + num + ", su equivalente en romano es VIII");
                break;
            case 9:
                System.out.println("El número ingresado " + num + ", su equivalente en romano es IX");
                break;
            case 10:
                System.out.println("El número ingresado " + num + ", su equivalente en romano es X");
                break;
        }
        
        
        
    }
    
}
