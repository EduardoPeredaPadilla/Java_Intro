/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra21;

import java.util.Scanner;

public class JavaEjerExtra21 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        /*
        String frase = "Hola";
        
       String NuevaFrase = frase.replace("o", "x");
       
        System.out.println(frase);
        System.out.println(NuevaFrase);
        */
        
        int N = 3;
        float nota1 = (float) 0.0;
        float nota2 = (float) 0.0;
        float nota3 = (float) 0.0;
        float nota4 = (float) 0.0;
        float prom = (float) 0.0;
        String resultado = "";
        int Ap = 0;
        int Des = 0;
        
        float [ ] [ ] matriz = new float [ N ] [ 5 ];
        
        for (int i = 0; i < N; i++) {
            System.out.println("Ingresa la nota del Primer trabajo práctico evaluativo del alumno " + (i + 1));
            nota1 = scan.nextFloat();
            System.out.println("Ingresa la nota del Segundo trabajo práctico evaluativo del alumno " + (i + 1));
            nota2 = scan.nextFloat();
            System.out.println("Ingresa la nota del Primer Integrador del alumno " + (i + 1));
            nota3 = scan.nextFloat();
            System.out.println("Ingresa la nota del Segundo Integrador del alumno " + (i + 1));
            nota4 = scan.nextFloat();
            prom = (float) ((nota1 * 0.1) + (nota2 * 0.15) + (nota3 * 0.25) + (nota4 * 0.5));
            if (prom < 7.0) {
                resultado = "Desaprobado";
                Des = Des + 1;
            } else {
                resultado = "Aprobado";
                Ap = Ap + 1;
            }
            for (int j = 0; j < 5; j++) {
                switch ( j ) {
                    case 0:
                        matriz [ i ] [ j ] = nota1;
                        System.out.print("[ " + matriz [ i ] [ j ] + " ]");
                        break;
                    case 1:
                        matriz [ i ] [ j ] = nota2;
                        System.out.print("[ " + matriz [ i ] [ j ] + " ]");
                        break;
                    case 2:
                        matriz [ i ] [ j ] = nota3;
                        System.out.print("[ " + matriz [ i ] [ j ] + " ]");
                        break;
                    case 3:
                        matriz [ i ] [ j ] = nota4;
                        System.out.print("[ " + matriz [ i ] [ j ] + " ]");
                        break;
                    case 4:
                        matriz [ i ] [ j ] = prom;
                        System.out.print("El promedio es [ " + matriz [ i ] [ j ] + " ]");
                        System.out.println("Este alumno está " + resultado);
                        break;
                }
            }
        }
        
        System.out.println("El total de alumnos Aprobados es " + Ap);
        System.out.println("El total de alumnos Desaprobados es " + Des);
        
    }
    
}
