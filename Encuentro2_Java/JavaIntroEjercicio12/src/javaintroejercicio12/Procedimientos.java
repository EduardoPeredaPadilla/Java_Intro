/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejercicio12;

import java.util.Scanner;


public class Procedimientos {

 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        /*
        System.out.println("Ingrese 2 números para validar si el primero es multiplo del segundo");
        System.out.println("Ingres el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingres el segundo número");
        num2 = leer.nextInt();
        */
        num1 =5;
        num2 = 20;
        double val = num2 / num1;
        
        System.out.println(val);
        /*
        boolean retorno = Validar( num1,  num2);
        System.out.println(retorno);
        */
    }
    
    public static boolean Validar(int num1, int num2) {
        
        boolean resp = false;
        
        float val = num1 / num2;
        
       
        
        return resp;
    }



    
}
