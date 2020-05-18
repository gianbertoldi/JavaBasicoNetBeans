/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicaosimplescondicional;

import java.util.Scanner;

/**
 *
 * @author berto
 */
public class CondicaoSimplesCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner key  = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = key.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = key.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("sua nota é " + m);
        if (m>9) {
            System.out.println("vc passou");
        }
    }
    
}
