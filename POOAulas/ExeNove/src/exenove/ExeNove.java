/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exenove;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author berto
 */
public class ExeNove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        DecimalFormat df =  new DecimalFormat("0.000");
        float f, c;
        
        System.out.println("Qual a temperatura Fahrenheit deseja converter pra Celsius?");
        f = key.nextFloat();
        
        c = 5*(f - 32)/9;
        System.out.println("A tempreatura é de " + df.format(c) + "°C");
    }
    
}
