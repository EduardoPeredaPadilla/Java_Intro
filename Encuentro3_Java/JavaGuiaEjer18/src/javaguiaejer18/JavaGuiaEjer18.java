/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer18;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int [ ] [ ] matriz = new int [ 4 ] [ 4 ];
        int [ ] [ ] matrizB = new int [ 4 ] [ 4 ];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz [ i ] [ j ] = (int) (Math.random()*9+1);
                System.out.print("[ " + matriz [ i ] [ j ] + " ]");
                if ( j == 3) {
                    System.out.println("");
                }
            }
        }
        
        System.out.println("");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB [ i ] [ j ] = matriz [ j ] [ i ];
                System.out.print("[ " + matrizB [ i ] [ j ] + " ]");
                if ( j == 3) {
                    System.out.println("");
                }
            }
        }
    }
    
}
