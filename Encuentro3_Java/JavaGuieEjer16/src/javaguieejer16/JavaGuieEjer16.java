/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguieejer16;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuieEjer16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int cont = 0;
        
        System.out.println("Ingrese el tamaño del vector");
        int N = scan.nextInt();
        
        int [ ] vector = new int [ N ];
        
        for (int i = 0; i < N; i++) {
            vector [ i ] = (int) (Math.random()*10+1);
            System.out.println("[ "+vector[ i ] + " ]");
        }
        
        System.out.println("Ingrese el número a buscar en el vector");
        int numFind = scan.nextInt();
        
        for (int i = 0; i < N; i++) {
            if (vector [ i ] == numFind) {
                cont = cont + 1;
                System.out.println("El número buscado se encuentra en el índice [ " + i + " ]");
            }
        }
        
        if (cont > 1) {
            System.out.println("El número buscado se encuentra repetido " + cont + " veces");
        } else if (cont == 1){
            System.out.println("El número buscado se encuentra una vez en el vector");
        } else {
            System.out.println("El número buscado no se encontro en el vector");
        }
    }
    
}
