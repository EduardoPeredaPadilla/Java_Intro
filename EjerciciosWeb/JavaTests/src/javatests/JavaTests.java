/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatests;

import java.util.Scanner;

public class JavaTests {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String frase = "Hola";
        
        //char letra = frase.charAt(frase.length() - 1);
        char letra = frase.charAt(1);
        char siguienteLetra = (char) (letra + 1);
        
        System.out.println(frase);
        System.out.println(letra);
        System.out.println(siguienteLetra);
        
        String nuevaFrase = frase.replaceAll("a", "@");
        System.out.println(nuevaFrase);
    }

}
