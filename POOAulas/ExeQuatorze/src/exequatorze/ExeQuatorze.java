/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exequatorze;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author berto
 */
public class ExeQuatorze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner key = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.000");
        
        int h,m,c, cH,cM,cC;
        float totalCarneEmG, kg;
        
        System.out.println("Qantos homens vão a festa?");
        h = key.nextInt();
        System.out.println("Quantas mulhers vão a festa?");
        m = key.nextInt();
        System.out.println("Quantas crinaças vão a festa?");
        c = key.nextInt();
        
        cH = h*650;
        cM = m*420;
        cC = c*290;
        totalCarneEmG = cH + cM + cC;
        
        kg = totalCarneEmG / 1000;
        
        System.out.println("Total de Carne necessaria:" + df.format(kg) + "Kg");
        
        
    }
    
}
