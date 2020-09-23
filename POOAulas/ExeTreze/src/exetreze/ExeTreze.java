/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exetreze;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author berto
 */
public class ExeTreze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner key = new Scanner(System.in);
        DecimalFormat df =  new DecimalFormat("0.00");
        
        float a,b,c,x,y, media;
        System.out.println("Qual primero valor?");
        a = key.nextFloat();
        System.out.println("Segundo valor: ");
        b = key.nextFloat();
        System.out.println("Terceiro valor:");
        c = key.nextFloat();
        System.out.println("Quarto valor:");
        x = key.nextFloat();
        System.out.println("Quinto valor:");
        y = key.nextFloat();
        
        media = (a+b+c+x+y)/5;
        System.out.println("A media entre os cinco valores é de: " + df.format(media));
    }
    
}
