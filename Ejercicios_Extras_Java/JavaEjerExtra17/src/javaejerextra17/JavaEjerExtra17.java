/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra17;

import java.util.Scanner;

public class JavaEjerExtra17 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num = scan.nextInt();
        
        boolean retorno = ValidarNumPrimo(num);
        System.out.println(retorno);
        
    }
    
    public static boolean ValidarNumPrimo(int num) {
        boolean validar = true;
        
        if ((num %  num == 0  && num % 2 == 0) || (num %  num == 0  && num % 4 == 0) || (num % num == 0 && num % 3 == 0)  || (num % num == 0 && num % 5 == 0)) {
            validar = false;
            if (num == 2) {
                validar = true;
            }
        }
        
        return validar;
    }
    
}
