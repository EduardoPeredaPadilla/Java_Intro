/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaejerweb;

import java.util.Scanner;

public class JavaEjerWeb {


    public static void main(String[] args) throws InterruptedException {
        
        Scanner scan = new Scanner(System.in);
        
        int hr1 = 0;
        int hr2 = 0;
        int min1 = 0;
        int min2 = 0;
        int seg1 = 0;
        int seg2 = 0;
        boolean stop = false;
        
        do {
            
            System.out.print("\r" + hr1 + hr2 +  ":" + min1+ min2 + ":" + seg1 + seg2);
            
            seg2 = seg2 + 1;
            
            if (seg2 == 9) {
                if (seg1 == 5 && seg2 ==9) {
                    min2 = min2 + 1;
                    seg1 = 0;
                    seg2 = 0;
                    if (min2 == 9) {
                        if (min1 == 5 && min2 == 9) {
                            hr2 = hr2 + 1;
                            min1 = 0;
                            min2 = 0;
                            if (hr2 == 9) {
                                if (hr1 == 2 && hr2 == 3 && min1 == 5 && min2 == 9 && seg1 == 5 & seg2 ==9){
                                    hr1 = 0;
                                    hr2 = 0;
                                    min1 = 0;
                                    min2 = 0;
                                    seg1 = 0;
                                    seg2 = 0;
                                }
                                hr1 = hr1 + 1;
                                hr2 = 0;
                            }
                        }
                        min1 = min1 + 1;
                        min2 = 0;
                    }
                }
                seg1 = seg1 + 1;
                seg2 = 0;
            }

            //Thread.sleep(1000);
            esperarUnSegundo();
        } while (true);

    }
    
    public static void esperarUnSegundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
