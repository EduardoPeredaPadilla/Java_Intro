/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarelojdigital;

import java.util.Scanner;
/**
 *
 * @author edmap
 */
public class JavaRelojdigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Reloj();

    }
    
    public static void Reloj() {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 6; m++) {
                            for (int n = 0; n < 10; n++) {
                                
                                System.out.print("\r" + "Reloj Digital " + i + j + ":" + k + l + ":" + m + n);
                                esperarUnSegundo();
                                
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static void esperarUnSegundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
