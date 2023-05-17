/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra19;

public class JavaEjerExtra19 {

    public static void main(String[] args) {
        
        int N = 3;
        int x = 0;
        
        int [ ] vector1 = new int [ N ];
        int [ ] vector2 = new int [ N ];
        
        for (int i = 0; i < N; i++) {
            vector1 [ i ] = (int) (Math.random()*2+1);
            vector2 [ i ] = (int) (Math.random()*2+1);
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print("[ " + vector1 [ i ] + " ]");
        }
        
        System.out.println("");
        
        for (int i = 0; i < N; i++) {
            System.out.print("[ " + vector2 [ i ] + " ]");
        }
        
        System.out.println("");
        
        for (int i = 0; i < N; i++) {
            if (vector1 [ i ] != vector2 [ i ]) {
                System.out.println("Se encontró una diferencia, se dejará de ejecutar el bucle");
                break;
            } else {
                x = x + 1;
            }
        }
        
        if (x == N) {
            System.out.println("Los vectores son iguales");
        } 
        
        System.out.println("");
    }
    
}
