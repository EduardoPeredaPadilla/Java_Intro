/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaejerextra22;

import java.util.Scanner;
/**
 *
 * @author edmap
 */
public class JavaEjerExtra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int N = 3;
        int M = 3;
        int suma = 0;
        
        int [ ] [ ] matriz = new int [ N ] [ M ];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                
                matriz [ i ] [ j ] = (int) (Math.random()*10+1);
                System.out.print("[" + matriz [ i ] [ j ] + "]");
                if (j == M - 1) {
                    System.out.println("");
                }
                suma = suma + matriz [ i ] [ j ]  ;
            }
        }
        
        System.out.println("La suma de todos los elementos de la matriz es " + suma);

    }

}
