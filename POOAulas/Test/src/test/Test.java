/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author berto
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        System.out.println("Numeros");
        x = sc.nextInt();
        y = sc.nextInt();
        z = x+y;
        System.out.println(z);
    }
    
}
