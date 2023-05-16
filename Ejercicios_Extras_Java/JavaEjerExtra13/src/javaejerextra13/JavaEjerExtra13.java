
package javaejerextra13;

import java.util.Scanner;

public class JavaEjerExtra13 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de la escalera");
        int num = scan.nextInt();
        num = num + 1;
        int n = 3;
        
        for (int i = 1; i < num; i++) {
            System.out.print( 1 );
            for (int j = 2; j < n; j++) {
                if (i > 1) {
                    System.out.print( j );
                    n = i + 1;
                }
            }
            System.out.println("");
        }
        
        
    }
    
}
