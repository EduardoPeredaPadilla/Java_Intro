/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaejer21;


public class JavaGuiaEjer21 {

      public static void main(String[] args) {
        
//        int [ ] [ ] matrizM = new int [ 10 ] [ 10 ];
//        int [ ] [ ] matrizP = new int [ 3 ] [ 3 ];
        
        System.out.println("Matriz M");
        int [ ] [ ] matrizM = {{1,26,36,47,5,6,72,81,95,10},{11,12,13,21,41,22,67,20,10,61},{56,78,87,90,9,90,17,12,87,67},{41,87,24,56,97,74,87,42,64,35},{32,76,79,1,36,5,67,96,12,11},{99,13,54,88,89,90,75,12,41,76},{67,78,87,45,14,22,26,42,56,78},{98,45,34,23,32,56,74,36,5,67},{24,67,97,46,87,13,67,89,90,75},{21,68,78,98,90,67,12,14,22,26}};
        int [ ] [ ] matrizP = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
                
                
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
//                matrizM [ i ] [ j ] = (int) (Math.random()*2+1);
                System.out.print("[ " + matrizM [ i ] [ j ] + " ]");
                if ( j == 9) {
                    System.out.println("");
                }
            }
        }
        
        System.out.println("Matriz P");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
//                matrizP [ i ] [ j ] = (int) (Math.random()*2+1);
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
        int z = 0;
        
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
                                                    z++;
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
        
        if ( z > 0 ) {
            
            System.out.println("Se encontró en " + z + " ocasiones");
            
        }
        
    }
    
}
