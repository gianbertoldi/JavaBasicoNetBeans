/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapraticaum;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author berto
 */
public class AulaPraticaUm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println("Hello World");
        
        // Primeiro teste
        /**System.out.println("isso ira aperecer na tela:");
         */
        
        //teste dois printar na tala usando duas linhas
        /*int valor = 5;
        System.out.println("Crie uma varivel com nome 'valor': ");
        System.out.println(valor);
        */
        
        //teste print em uma linha 
        /*int valor = 0;
        System.out.println("Crie uma variavel com nome 'valor'; " + valor);
        */
        
        //teste print dois valores
        
        /*int priValor = 5, segValor = 6;
        System.out.println("primeira variavel: " + priValor);
        System.out.println("Segundo valor: " + segValor);
        */
        
        //Teste soma 
        /*int soma, primValor, segValor;
        primValor = 5;
        segValor = 6;
        soma = primValor + segValor;
        
        System.out.println("Primeiro valor: " + primValor);
        System.out.println("Segundo valor: " + segValor);
        System.out.println("Resultado da soma: " + soma);
        */
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        /*float priValor = 10, segValor = 3, div;
        System.out.println("Primeiro valor: " + priValor);
        System.out.println("Segundo valor: " + segValor);
        div = priValor / segValor;
        System.out.println("Resultado da divisao: " + df.format(div));
        */
        
        Scanner key = new Scanner(System.in);
        
        int priVal, segVal, soma;
         
        System.out.println("Qual o primeiro valor?");
        priVal = key.nextInt();
        System.out.println("Qual o segundo valor?");
        segVal =  key.nextInt();
        System.out.println("os valores atribuido as variaveis sao: " + priVal + " e " + segVal);
        soma = priVal + segVal;
        System.out.println("A soma é: " + soma);
                
        
        
        
        
        
     }
    
}
