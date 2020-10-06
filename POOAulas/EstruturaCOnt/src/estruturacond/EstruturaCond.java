/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacond;

import java.util.Scanner;

/**
 *
 * @author berto
 */
public class EstruturaCond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a partir de agora algoritimos necessitam de de condições expecifica.
        Scanner key = new Scanner(System.in);
        int priVal, secVal;
        
        System.out.println("Qual o primeiro valor?");
        priVal = key.nextInt();
        System.out.println("Qual o segundo valor?");
        secVal = key.nextInt();
        if (priVal == secVal) {
            System.out.println("Os valores são iguais");
            
        } else {
            System.out.println("Os valores são diferentes");
        }
        
        
    }
    
}
