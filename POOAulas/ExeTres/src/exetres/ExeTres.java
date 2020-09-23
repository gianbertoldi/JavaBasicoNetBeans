/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exetres;

import java.util.Scanner;

/**
 *
 * @author berto
 */
public class ExeTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int x, y, soma;
        System.out.println("Informe o primeiro valor:");
        x = key.nextInt();
        System.out.println("Informe o segundo valor:");
        y = key.nextInt();
        soma = x + y;
        System.out.println("A soma entre os dois valor é: " + soma);
        
    }
    
}
