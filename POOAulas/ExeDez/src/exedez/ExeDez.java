/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exedez;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author berto
 */
public class ExeDez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        DecimalFormat df =  new DecimalFormat("0.00");
        float f, c, k;
        
        System.out.println("Qual a temperatura Fahrenheit deseja converter pra Celsius?");
        f = key.nextFloat();
        
        c = 5*(f - 32)/9;
        k = c + (float) 273.15;
        System.out.println("A temperatura em Kelvin é de " + df.format(k) + "K");
    }
    
}
