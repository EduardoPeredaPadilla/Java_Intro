/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer8;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra de 8 caracteres");
        String frase = scan.nextLine();
        
        boolean retorno = Validar(frase);
        
        if (retorno == true) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
    public static boolean Validar(String frase) {
        boolean resp = false;
        
        if (frase.length() == 8) {
            resp = true;
        } 
        
        System.out.println(frase.length());
        return resp;
    }
    
}
