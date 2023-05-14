/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer13;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del cuadro");
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else if (j > 0 && j < n) {
                    System.out.print("  ");
                }
                if (j == n - 1) {
                    System.out.println("");
                }
            }
        }
        
    }
    
}
