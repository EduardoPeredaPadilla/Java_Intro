/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer21;

/**
 *
 * @author edmap
 */
public class JavaGuiaEjer21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [ ] [ ] matrizM = new int [ 10 ] [ 10 ];
        int [ ] [ ] matrizP = new int [ 3 ] [ 3 ];
        
        System.out.println("Matriz M");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM [ i ] [ j ] = (int) (Math.random()*2+1);
                System.out.print("[ " + matrizM [ i ] [ j ] + " ]");
                if ( j == 9) {
                    System.out.println("");
                }
            }
        }
        
        System.out.println("Matriz MP");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP [ i ] [ j ] = (int) (Math.random()*2+1);
                System.out.print("[ " + matrizP [ i ] [ j ] + " ]");
                if ( j == 2) {
                    System.out.println("");
                }
            }
        }
        
        Validar(matrizM, matrizP);
        
    }
    
    public static void Validar(int [ ][ ] matrizM, int [ ][ ] matrizP) {
        
        int f = 0;
        int c = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizM [ i ] [ j ] == matrizP [ f ] [ c ]) {
                    //System.out.println("Coincidencia encontrada en los índices " + i +"," + j);
                    if (matrizM [ i ] [ j + 1 ] == matrizP [ f ] [ c + 1 ]) {
                        //System.out.println("Siguiente valor encontrado");
                        if (matrizM [ i  ] [ j + 2 ] == matrizP [ f ] [ c + 2 ]) {
                            //System.out.println("tercer valor encontrado");
                            if (matrizM [ i + 1 ] [ j ] == matrizP [ f + 1 ] [ c ]) {
                                //System.out.println("Coincidencia encontrada en los índices " + i +"," + j);
                                //System.out.println("Siguiente fila valor encontrado");
                                if (matrizM [ i + 1 ] [ j + 1 ] == matrizP [ f + 1 ] [ c + 1 ]) {
                                    //System.out.println("Siguiente fila sigueinte valor encontrado");
                                    if (matrizM [ i + 1 ] [ j + 2 ] == matrizP [ f + 1 ] [ c + 2 ]) {
                                        //System.out.println("Siguiente fila tercer valor encontrado");
                                        if (matrizM [ i + 2 ] [ j ] == matrizP [ f + 2 ] [ c ]) {
                                            //System.out.println("Coincidencia encontrada en los índices " + i +"," + j);
                                            //System.out.println("Última fila  valor encontrado");
                                            if (matrizM [ i + 2 ] [ j + 1 ] == matrizP [ f + 2 ] [ c + 1 ]) {
                                                //System.out.println("Última fila siguiente valor encontrado");
                                                if (matrizM [ i + 2 ] [ j + 2 ] == matrizP [ f + 2 ] [ c + 2 ]) {
                                                    System.out.println("Coincidencia encontrada en los índices " + i +"," + j);
                                                    //System.out.println("Última fila tercer valor encontrado");
                                                    //return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                        }
                    }
                }
            }
        }
        
    }
    
}
