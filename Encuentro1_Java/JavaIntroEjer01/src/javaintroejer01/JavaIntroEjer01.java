/*
 Este programa escribe el texto hola mundo en la consola, utilizando el método System.out.println
 */
package javaintroejer01;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaIntroEjer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // La siguiente línea muestra el mensaje por apntalla a ejecutar en el programa
        //System.out.println("Hola mundo");
        
        //se crea una variable Scanner que se utiliza para LEer datos del usuario como en PsInt
        Scanner leer = new Scanner(System.in);
        //se crea una variable de cadena String que se utiliza para leer datos del usuario
        String nombre;
        //muestra un msj por pantalla
        System.out.println("Ingresa tu nombre = ");
        //Leemos el nombre del usuario en la variable nombre
        nombre = leer.next();
        //mostramos por consola un saludo personalizado
        System.out.println("Hola mundo, soy " + nombre + " y estoy programando con Java!");
    }
    
}
