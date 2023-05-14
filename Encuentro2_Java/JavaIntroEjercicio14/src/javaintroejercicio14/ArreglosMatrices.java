/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejercicio14;

public class ArreglosMatrices {

    public static void main(String[] args) {
        
        int [][] matriz = new int [3][3];
        int x = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                x= x +1;
                matriz[i][j] = x;
                System.out.print(matriz[i][j] + " ");
                if (j == 2) {
                    System.out.println("");
                }
            }
        }
    }
    
}
