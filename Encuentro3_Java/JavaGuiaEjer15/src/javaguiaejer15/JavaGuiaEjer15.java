/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer15;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int [ ] vector = new int [100];
        
        for (int i = 0; i < 100; i++) {
            vector [ i ] = i + 1;
            System.out.println("[ "+vector[ i ] + " ]");
        }
    }
    
}
