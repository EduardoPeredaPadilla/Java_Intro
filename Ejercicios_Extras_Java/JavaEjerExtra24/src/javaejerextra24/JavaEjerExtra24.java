/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaejerextra24;

import java.util.Scanner;

public class JavaEjerExtra24 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int a = 0;
        int b = 1;
        int c = 0;
        
        System.out.println("Ingrese un número");
        int N = scan.nextInt();
        
        //int N = 34;
        
        System.out.print("1");
        for (int i = 0; i < N; i++) {
            
            c = a + b;
            a = b;
            b = c;
            i = c;
            
            if (c >= N) {
                break;
            }
            
            System.out.print(", ");
            System.out.print(c);
            
        }
        System.out.println("");
        
    }

}
