/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerextra12;


public class JavaEjerExtra12 {

  
    public static void main(String[] args) {
        
        int [ ] vector = new int [ 3 ];
        String [ ] vectorN = new String [ 3 ];
        
        int x = 0;
        int y = 0;
        int z = 0;
        
        do {
            for (int i = 0; i < 3; i++) {
            switch ( i ) {
                case 0:
                    vector [ i ] = z;
                    break;
                case 1:
                    vector [ i ] = y;
                    break;
                case 2:
                    vector [ i ] = x;
                    break;
            }
        }
        System.out.println(vector [ 0 ] + " - " + vector [ 1 ] + " - " + vector [ 2 ]);
        
        x = x + 1;
        if ( x == 10) {
            x = 0;
            y = y + 1;
        }
        if (y == 10) {
            y = 0;
            z = z + 1;
        }
        } while (z < 10);
        
        x = 0;
        y = 0;
        z = 0;
        
        System.out.println("");
        System.out.println("Nueva Serie");
        
        do {
            for (int i = 0; i < 3; i++) {
            
            switch ( i ) {
                case 0:
                    vectorN [ i ] = Integer.toString(z);
                    break;
                case 1:
                    vectorN [ i ] = Integer.toString(y);
                    break;
                case 2:
                    vectorN [ i ] = Integer.toString(x);
                    break;
            }
            if (vectorN [ i ].equals("3")) {
                vectorN [ i ] = "E";
            } 
        }
        
        System.out.println(vectorN [ 0 ] + " - " + vectorN [ 1 ] + " - " + vectorN [ 2 ]);
        
        x = x + 1;
        if ( x == 10) {
            x = 0;
            y = y + 1;
        }
        if (y == 10) {
            y = 0;
            z = z + 1;
        }
        } while (z < 10);

    }
    
}
