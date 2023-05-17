/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra18;

import java.util.Scanner;

public class JavaEjerExtra18 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        
        System.out.println("Ingrese el tamaño del vetor");
        int N = scan.nextInt();
        
        int [ ] vector = new int [ N ];
        
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el valor para el índice [ " + i + " ] del vector");
            int num = scan.nextInt();
            vector [ i ] = num;
            suma = suma + vector [ i ];
        }
        
        System.out.println("La suma de los número singresados para el vector es " + suma);
        
    }
    
}
