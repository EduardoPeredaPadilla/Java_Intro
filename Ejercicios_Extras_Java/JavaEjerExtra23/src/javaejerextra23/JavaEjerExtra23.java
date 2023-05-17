/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaejerextra23;

import java.util.Scanner;
/**
 *
 * @author edmap
 */
public class JavaEjerExtra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String pal = "";
        int cantPal = 0;
        String valor = "";
        int filaReg = 0;
        int fila = 0;
        int x = 0;
        int z = 0;
        
        String [ ] [ ] sopa = new String [ 10 ] [ 10 ];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sopa [ i ] [ j ] = "*";
                System.out.print("[" + sopa [ i ] [ j ] + "]");
                if (j == 9) {
                    System.out.println("");
                }
            }
        }
        
        System.out.println("");
        
        do {
            //System.out.println("");
            System.out.println("Ingresa la palabra " + (x + 1));
            pal = scan.nextLine();
            cantPal = pal.length();
           // for (int i = 0; i < 10; i++) {
           fila = (int) (Math.random()*9+0);

                if (fila == filaReg) {
                    do {
                        fila = (int) (Math.random()*9+0);
                    } while (fila == filaReg);
                }
                filaReg = fila;
            for (int j = 0; j < 10; j++) {
                z = j + 1;
                if ( z == cantPal + 1) {
                    z = 0;
                    break;
                }
                sopa [ fila ] [ j ] = pal.substring(j, z);
//                System.out.print("[" + sopa [ fila ] [ j ] + "]");
//                if (j == 9) {
//                    System.out.println("");
//                    break;
//                }
            }
            x = x + 1;
       // }
            
        } while ( x < 5);
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                if (sopa [ i ] [ j ].equals("*")) {
                    int num = (int) (Math.random()*9+0);
                    sopa [ i ] [ j ] = Integer.toString(num);
                }
                
                System.out.print("[" + sopa [ i ] [ j ] + "]");
                if (j == 9) {
                    System.out.println("");
                }
            }
        }
        
        System.out.println("");
        
        

    }

}
