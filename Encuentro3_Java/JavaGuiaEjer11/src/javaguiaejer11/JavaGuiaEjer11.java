/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer11;

import java.util.Scanner;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros positivos");
        System.out.println("Ingrese el primer número");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = scan.nextInt();
        
        Menu(num1, num2);
         
    }
    
    public static void Menu(int num1, int num2) {
        
        Scanner scan = new Scanner(System.in);
        int opcion;
        String salir = "N";
        
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opción:");
            opcion = scan.nextInt();
            
            if (opcion < 1 || opcion > 5) {
                System.out.println("Opción inválida");
                System.out.println("MENU");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("Elija una opción:");
                opcion = scan.nextInt();
            } else if (opcion >1 || opcion <= 5) {
                switch (opcion) {
                    case 1:
                        System.out.println("Elegiste la opción 1. Sumar");
                        int retornoSuma = Sumar(num1, num2);
                        System.out.println("El resultado de la suma es " + retornoSuma);
                        break;
                    case 2:
                        System.out.println("Elegiste la opción 2. Restar");
                        int retornoResta = Restar(num1, num2);
                        System.out.println("El resultado de la resta es " + retornoResta);
                        break;
                    case 3:
                        System.out.println("Elegiste la opción 3. Multiplicar");
                        int retornoMult = Multiplicar(num1, num2);
                        System.out.println("El resultado de la multiplicación es " + retornoMult);
                        break;
                    case 4:
                        System.out.println("Elegiste la opción 4. Dividir");
                        float retornoDiv = Dividir(num1, num2);
                        System.out.println("El resultado de la multiplicación es " + retornoDiv);
                        break;
                    case 5:
                        System.out.println("Elegiste la opción 5. Salir");
                        System.out.println("¿Está seguro que desea salir del programa? (S/N)");
                        salir = scan.nextLine();
                        scan.nextLine();
                        if (salir != "S" || salir != "N") {
                            System.out.println("Opción inválida");
                            System.out.println("¿Está seguro que desea salir del programa? (S/N)");
                            salir = scan.next();
                        }
                }
            }
            
        } while (!salir.equalsIgnoreCase("S"));
        
        System.out.println("Hasta pronto!");
        
    }
    
    public static int Sumar(int num1, int num2) {
        
        int suma = num1 + num2;
        
        return suma;
    }
    
    public static int Restar(int num1, int num2) {
        
        int resta = num1 - num2;
        
        return resta;
    }
    
    public static int Multiplicar(int num1, int num2){
        
        int multiplica = num1 * num2;
        
        return multiplica;
    }
    
    public static float Dividir(int num1, int num2){
        
        float div = (float) num1 / num2; 
        
        return div;
    }
}
