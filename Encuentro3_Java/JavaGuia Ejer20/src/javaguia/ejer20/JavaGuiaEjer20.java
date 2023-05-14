/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia.ejer20;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = 0;
        
        
        
        System.out.println("Ingrese el tamaño que desea para la matriz");
        int N = scan.nextInt();
        
        int [ ] [ ] matriz = new int [ N ] [ N ];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                do {
                    System.out.println("Ingrese un número entr el 1 y el 9 para rellenar la matriz");
                    num = scan.nextInt();
                    if (num < 1 || num > 9) {
                        System.out.println("Número inválido, fuera del rango");
                        System.out.println("Ingrese un número entr el 1 y el 9 para rellenar la matriz");
                        num = scan.nextInt();
                    }
                } while (num < 1 || num > 9);
                matriz [ i ] [ j ] = num;
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("[ " + matriz [ i ] [ j ] + " ]");
                if ( j == N - 1) {
                    System.out.println("");
                }
            }
        }
        
        Validar(N, matriz);
        
    }
    
    public static void Validar(int N, int[][] matriz){
        
        int suma = 0;
        int sumaFila = 0;
        int sumaColum = 0;
        
        int x = 0;
        int z = 0;
        
        int [ ] sumF = new int [ N ];
        int [ ] sumC = new int [ N ];
        
        for (int i = 0; i < N; i++) {
            sumF [ i ] = 0;
            sumC [ i ] = 0;
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sumF [ i ] = sumF [ i ] + matriz [ i ] [ j ];
                sumC [ j ] = sumC [ j ] + matriz [ i ] [ j ];
            }
        }
        
        for (int i = 0; i < N; i++) {
            if (sumF [ i ] == sumF [ x ]){
                x = x + 1;
            }
            System.out.print(sumF [ i ] + " ");
        }
        System.out.println("");
        System.out.println("Valor de x " + x);
        
        if (x == N) {
            System.out.println("La suma de las filas es igual");
        }
      
        for (int i = 0; i < N; i++) {
            if (sumC [ i ] == sumC [ z ]){
                z = z + 1;
            }
            System.out.print(sumC [ i ] + " ");
        }
        System.out.println("");
        System.out.println("Valor de z " + z);
        
        if (z == N) {
            System.out.println("La suma de las columnas es igual");
        }
        
        if (x == N && z == N) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }
    }
    
}
