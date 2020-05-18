/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicãoidades;

import java.util.Scanner;

/**
 *
 * @author berto
 */
public class CondicãoIdades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        System.out.println("Que ano vc nasceu? ");
        int nasc = key.nextInt();
        
        int i = 2020 - nasc;
        if (i>=18) {
            System.out.println("Voce é maoir");
        } else {
            System.out.println("Voce é menor");
        }
    }
    
}
