/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exedoze;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author berto
 */
public class ExeDoze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner key = new Scanner(System.in);
        DecimalFormat df =  new DecimalFormat("0.00");
        
        int h, somaH, m, somaM, s, somaS;
        System.out.println("Quantas horas de passaram?");
        h = key.nextInt();
        System.out.println("quantos minutos se passaram?");
        m = key.nextInt();
        System.out.println("Quantos segundos se passaram?");
        s = key.nextInt();
        
        somaH = h* 60;
        somaM = (somaH + m)*60;
        somaS = somaM + s;
        
        System.out.println("O total de segundos é de " + somaS);
    }
    
}
