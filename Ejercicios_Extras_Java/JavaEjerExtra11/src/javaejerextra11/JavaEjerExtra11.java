/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra11;

import java.util.Scanner;

public class JavaEjerExtra11 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        //int div = 1000000;
        
        System.out.println("Ingresa un número");
        int num = scan.nextInt();
        
        do {
            int div = num /10;
            num = div;
            cont = cont + 1;
        } while (num != 0);
        
        System.out.println(cont);
        
        
        
    }
    
}
