/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeonze;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author berto
 */
public class ExeOnze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner key = new Scanner(System.in);
        DecimalFormat df =  new DecimalFormat("0.00");
        
        float in, mm;
        
        System.out.println("Quantas polegadas deseja converter?");
        in = key.nextFloat();
        
        mm = in*((float)25.4/1);
        System.out.println("Sua medida é de " + df.format(mm) + " mm");
        
    }
    
}
