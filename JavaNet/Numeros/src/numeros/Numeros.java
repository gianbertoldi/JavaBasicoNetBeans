/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author berto
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s =0;
        String resp;
        Scanner key = new Scanner(System.in);
        do {
            System.out.print("Digite um numero: ");
            n = key.nextInt();
            s += n;
            System.out.print("Quer continuar: [s/n]: ");
            resp = key.next();
            
        } while (resp.equals("s"));
        System.out.println("A soma de todos os valore é: " + s);
    }
    
}
