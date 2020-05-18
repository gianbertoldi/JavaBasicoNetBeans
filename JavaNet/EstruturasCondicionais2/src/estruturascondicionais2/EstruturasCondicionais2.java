/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturascondicionais2;

import java.util.Scanner;

/**
 *
 * @author berto
 */
public class EstruturasCondicionais2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int perna = key.nextInt();
        String tipo;
        System.out.println("Isso é");
        switch (perna) {
                case 1:
                tipo = "saci";
                break;
                case 2:
                    tipo = "bipedi";
                    break;
                case 4:
                    tipo = "quadrupede";
                    break;
                case  6:
                    tipo = "aranha";
                    break;
                default:
                    tipo = "ET";
                    break;
        }
        System.out.println(tipo);
    }
    
}
