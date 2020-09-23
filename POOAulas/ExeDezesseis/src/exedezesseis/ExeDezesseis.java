/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exedezesseis;

import java.util.Scanner;

/**
 *
 * @author berto
 */
public class ExeDezesseis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        
        int a,b,c;
        System.out.println("Qual valor de A?");
        a = key.nextInt();
        System.out.println("Qual valor de B");
        b = key.nextInt();
        
        System.out.println("O valor de A é " + a + " e o valor de B é " + b);
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("Valor de A agora é " + a + " o Valor de B agora é " + b);
        
    }
    
}
