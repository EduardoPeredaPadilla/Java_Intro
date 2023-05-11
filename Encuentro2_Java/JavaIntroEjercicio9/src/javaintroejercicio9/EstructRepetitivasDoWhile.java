/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejercicio9;

import java.util.Scanner;

public class EstructRepetitivasDoWhile {

   
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
         
         int totNum = 20;
         int num;
         int i = 0;
         int suma = 0;
         
         do {
             System.out.println("Ingrese un número");
             num = leer.nextInt();
             i ++;
             if (num > 0) {
                 suma = suma + num;
             } else if (num == 0) {
                 System.out.println("Se capturó el número cero");
                 break;
             }
         } while ((i < totNum) && (num != 0));
         
         System.out.println("La cantidad de números ingresados fue : " + i);
         System.out.println("La suma de los número ingresado sin contar los negativos es de : " + suma);
    }
    
}
