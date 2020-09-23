/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exequinze;

import java.util.Scanner;

/**
 *
 * @author berto
 */
public class ExeQuinze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        
        int a,m, mesesTotais,d, diasTotais, totalVivido;
        
        System.out.println("Quantos anos ja viveu?");
        a = key.nextInt();
        System.out.println("E meses deste ano?");
        m = key.nextInt();
        System.out.println("Agora pra finalizar quantos dias ja se passaram neste mes?");
        d = key.nextInt();
        
        mesesTotais = a*12;
        diasTotais = (mesesTotais + m)*30;
        totalVivido = diasTotais + d;
        System.out.println("Total de dias vividos: " + totalVivido);
        
        
    }
    
}
