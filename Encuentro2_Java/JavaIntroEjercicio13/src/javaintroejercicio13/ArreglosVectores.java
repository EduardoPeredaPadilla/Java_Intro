/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejercicio13;

/**
 *
 * @author edmap
 */
public class ArreglosVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String [] Equipo = new String[6];
        
        for (int i = 0; i < 6; i++) {
            Equipo[i] = "alumno"+(i+1);
            System.out.println(Equipo[i]);
        }
    }
    
}
