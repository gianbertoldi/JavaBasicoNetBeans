/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeseis;

import java.util.Scanner;

/**
 *
 * @author berto
 */
public class ExeSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
       
        double r,d,pi,a;
        
        System.out.println("Vamor calcular a area de um circulo!");
        System.out.println("Qual o  valor do raio?");
        d = key.nextDouble();
        r = d/2;
        pi = Math.PI;
        a = pi* (Math.pow(r, 2));
        System.out.printf("A area do circulo é: %.2f ", a);
        System.out.println(" cm2");
    }
    
}
