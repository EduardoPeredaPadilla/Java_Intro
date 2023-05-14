/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer17;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num1Dig = 0;
        int num2Dig = 0;
        int num3Dig = 0;
        int num4Dig = 0;
        int num5Dig = 0;
        int cont = 0;
        
        System.out.println("Ingrese el tamaño del vector");
        int N = scan.nextInt();
        
        int [ ] vector = new int [ N ];
        
        for (int i = 0; i < N; i++) {
            vector [ i ] = (int) (Math.random()*90000+1);
            System.out.println("[ "+vector[ i ] + " ]");
            int num = vector [ i ];
            do {
                num = (int) Math.floor(num / 10);
                cont = cont + 1;
            } while (num != 0);
            switch (cont) {
                case 1:
                    num1Dig = num1Dig + 1;
                    break;
                case 2:
                    num2Dig = num2Dig + 1;
                    break;
                case 3:
                    num3Dig = num3Dig + 1;
                    break;
                case 4:
                    num4Dig = num4Dig + 1;
                    break;
                case 5:
                    num5Dig = num5Dig + 1;
                    break;
            }
            cont = 0;
        }
        
        System.out.println("Se encontraron " + num1Dig + " números de 1 dígito");
        System.out.println("Se encontraron " + num2Dig + " números de 2 dígito");
        System.out.println("Se encontraron " + num3Dig + " números de 3 dígito");
        System.out.println("Se encontraron " + num4Dig + " números de 4 dígito");
        System.out.println("Se encontraron " + num5Dig + " números de 5 dígito");
        
    }
    
}
