/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javareloj;


/**
 *
 * @author edmap
 */
public class JavaReloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                while (true) {
            // Obtener la hora actual
            long tiempoActual = System.currentTimeMillis();
            String hora = obtenerHora(tiempoActual);

            // Imprimir la hora en la misma línea
            System.out.print("\r" + hora);

            // Esperar un segundo
            esperarUnSegundo();
        }
    }

    public static String obtenerHora(long tiempo) {
        // Obtener los componentes de la hora
        long segundos = (tiempo / 1000) % 60;
        long minutos = (tiempo / (1000 * 60)) % 60;
        long horas = (tiempo / (1000 * 60 * 60)) % 24;

        // Formatear la hora en un String
        String hora = String.format("%02d:%02d:%02d", horas, minutos, segundos);
        return hora;
    }

    public static void esperarUnSegundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
        




