/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejercicio11;

import java.util.Scanner;


public class Subprogramas {


    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase y terminala en punto");
        String frase = leer.nextLine();
        //String frase = "Ayer, lunes, salimos a las once y 10.";
        
       String retorno = SustitucionCaracter(frase);
        System.out.println(retorno);

    }
    
    public static String SustitucionCaracter(String frase) {
        
        int cantLetras = frase.length();
        int z = 0;
        String fraseNueva = frase;
        
        //cantLetras = cantLetras - 1;
        
        //System.out.println(cantLetras);
        
        for (int i = 0; i < cantLetras; i++) {
            z = z + 1;
            if (z == cantLetras + 1) {
                z = z - 1;
            }
            String letra = frase.substring(i, z);
            switch (letra) {
                case  "A":
                   fraseNueva = fraseNueva.substring(0, z-1).concat("@" + fraseNueva.substring(i+1, cantLetras));
                   break;
                case  "a":
                   fraseNueva = fraseNueva.substring(0, z-1).concat("@" + fraseNueva.substring(i+1, cantLetras));
                   break;
                case  "e":
                   fraseNueva = fraseNueva.substring(0, z-1).concat("#" + fraseNueva.substring(i+1, cantLetras));
                   break;
                case  "i":
                   fraseNueva = fraseNueva.substring(0, z-1).concat("$" + fraseNueva.substring(i+1, cantLetras));
                   break;
                case  "o":
                   fraseNueva = fraseNueva.substring(0, z-1).concat("%" + fraseNueva.substring(i+1, cantLetras));   
                   break;
                case  "u":
                   fraseNueva = fraseNueva.substring(0, z-1).concat("*" + fraseNueva.substring(i+1, cantLetras));
            }
        }
        
        return fraseNueva;
    }
    
}
