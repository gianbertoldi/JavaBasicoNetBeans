/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exesete;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author berto
 */
public class ExeSete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float salario, perc, reaj,res;
        System.out.println("Qual o valor do salario atual?");
        salario = key.nextFloat();
        System.out.println("Qual a porcentagem do reajuste salarial:");
        perc = key.nextFloat();
        res = (salario * perc)/ 100;
        reaj = res + salario;
        System.out.println("O vaolor do salario foi reajustado para R$: " + df.format(reaj));
    }
    
}
