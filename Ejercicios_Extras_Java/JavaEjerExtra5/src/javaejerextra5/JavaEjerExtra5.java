/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra5;

import java.util.Scanner;

public class JavaEjerExtra5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String tipoSocio = "X";
        int costo = 0;
        
        do {
            System.out.println("Ingrese el tipo de socio");
            tipoSocio = scan.nextLine();
            if (!tipoSocio.equalsIgnoreCase("A") && !tipoSocio.equalsIgnoreCase("B") && !tipoSocio.equalsIgnoreCase("C")) {
                System.out.println("Tipo de Socio inválido");
            } 
            
        } while (!tipoSocio.equalsIgnoreCase("A") && !tipoSocio.equalsIgnoreCase("B") && !tipoSocio.equalsIgnoreCase("C"));
     
        System.out.println("Ingrese el costo del tratamiento");
        costo = scan.nextInt();
        
        CostoReal(tipoSocio, costo);
        
    }
    
    public static void CostoReal(String tipoSocio, int costo) {
        
        float desc = (float) 0.0;
        float costoFinal = (float) 0.0;
        tipoSocio = tipoSocio.toUpperCase();
        
        switch (tipoSocio) {
            case "A":
                desc = (float) 0.50;
                break;
            case "B":
                desc = (float) 0.35;
                break;
        }
        
        costoFinal = costo - (costo * desc);
        
        System.out.println("El importe a pagar para el tipo de Socio " + tipoSocio + ", es de $" + costoFinal);

    }
    
}
