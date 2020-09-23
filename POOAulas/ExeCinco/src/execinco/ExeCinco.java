/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execinco;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author berto
 */
public class ExeCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float x, quad, res,meta,y;
        System.out.println("Qual o valor de X?");
        x = key.nextFloat();
        quad = (float) Math.sqrt(x);
        res = x % 3;
        meta = (x/2);
        y = x/meta;
        System.out.println("A raiz quadrada de X é: " + quad);
        System.out.println("O resto de X divido por 3 é: " + res);
        System.out.println("O resultado do produto de X pela metade de X é : " + y);
        
    }
    
}
