/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra2;

public class JavaEjerExtra2 {

    public static void main(String[] args) {
        
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;
        
        int aux = 0;
        
        System.out.println("El valor de A es = " + A);
        System.out.println("El valor de B es = " + B);
        System.out.println("El valor de C es = " + C);
        System.out.println("El valor de D es = " + D);
        
        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;
        
        System.out.println("El nuevo valor de A es = " + A);
        System.out.println("El nuevo valor de B es = " + B);
        System.out.println("El nuevo valor de C es = " + C);
        System.out.println("El nuevo valor de D es = " + D);
        
        
    }
    
}
