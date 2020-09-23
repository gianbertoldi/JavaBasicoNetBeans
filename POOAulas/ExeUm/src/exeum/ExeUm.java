/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeum;

import java.util.Scanner;

/**
 *
 * @author berto
 */
public class ExeUm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        
        int priVal, segVal, res, x;
        
        System.out.println("Qual o primero valor?");
        priVal = key.nextInt();
        System.out.println("Qual o segundo valor?");
        segVal = key.nextInt();
        
        
        res = priVal - segVal;
        
        if (res < 0){
            x = res*-1;
            System.out.println("O valor entre os dois valores é: " + x);
        } else {
            System.out.println("O valor entre os dois numeros é: " + res);
        }
    }
    
}
