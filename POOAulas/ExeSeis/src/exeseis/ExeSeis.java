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
        r = key.nextDouble();
        pi = Math.PI;
        a = pi* (Math.pow(r, 2));
        System.out.println("A area do circulo é: " + a);
    }
    
}
