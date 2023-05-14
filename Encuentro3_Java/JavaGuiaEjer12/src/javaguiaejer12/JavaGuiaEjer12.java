/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer12;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String cadena;
        int contCadenas = 0;
        int cadCorrecta = 0;
        int cadIncorrecta = 0;
        boolean salir = false;
        String secSalida = "&&&&&";
        
        
        do {
            System.out.println("Ingresa la cadena");
            cadena = scan.nextLine();
            int tamCadena = cadena.length();
            
            contCadenas = contCadenas + 1;
            
            if (tamCadena == 5) {
                if (cadena.substring(0, 1).equalsIgnoreCase("X") && cadena.substring(tamCadena - 1, tamCadena).equalsIgnoreCase("Y")) {
                    cadCorrecta = cadCorrecta + 1;
                } else {
                    cadIncorrecta = cadIncorrecta + 1;
                }
            } else {
                cadIncorrecta = cadIncorrecta + 1;
            }
            
            if (cadena.equals("&&&&&")) {
                        contCadenas = contCadenas - 1;
                        cadIncorrecta = cadIncorrecta - 1;
                    } 
            
        } while (!cadena.equals("&&&&&"));
        
        System.out.println("El total de cadenas ingresadas fue de = " + contCadenas);
        System.out.println("total de cadenas Correctas = " + cadCorrecta);
        System.out.println("total de cadenas Incorrectas = " + cadIncorrecta);
    }
    
}
