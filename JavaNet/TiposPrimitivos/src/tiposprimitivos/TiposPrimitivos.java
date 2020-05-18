/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author berto
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = key.nextLine();
        System.out.println("Digite a nota do aluno");
        float nota = key.nextFloat();
        
    
        
        
        System.out.printf("a nota de %s é %.2f \n",nome, nota);
        
     
    }
    
}
