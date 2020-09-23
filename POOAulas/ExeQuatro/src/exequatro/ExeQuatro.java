/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exequatro;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author berto
 */
public class ExeQuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float x, y, media;
        System.out.println("Infomem a primeira nota:");
        x = key.nextInt();
        System.out.println("Informe a segunda nota:");
        y = key.nextInt();
        media = (x + y)/2;
        System.out.println("A media das notas são: " + media);
    }
    
}
