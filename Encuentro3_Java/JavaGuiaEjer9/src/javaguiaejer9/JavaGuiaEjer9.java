/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer9;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa una palabra");
        
        String word = scan.nextLine();
        
        boolean retorno = Validar(word);
        
        if (retorno == true) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
    public static boolean Validar(String word) {
        boolean resp = false;
        
        int cantLetras = word.length();
        
        String letra = word.substring(0, 1);
        
        if (letra.equalsIgnoreCase("A")) {
            resp = true;
        }
        
        return resp;
    }
    
    
    
}
