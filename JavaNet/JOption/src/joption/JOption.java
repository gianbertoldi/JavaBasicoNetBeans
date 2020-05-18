/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joption;

import javax.swing.JOptionPane;

/**
 *
 * @author berto
 */
public class JOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p = 0,i = 0, a100 = 0, m = 0,n,s = 0,totalV = 0;
        
        do {
             n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero"  + "\n" + "(0 terminana a sequencia)"));
              s += n;
             
            if (n == 0){
                 break;
            
             }else{
              if (n%2!=0) {
                 i++;
             }else{
                  p++;
              }
             } 
             if (n>100){
                 a100++;
             }
        totalV++;
        m = s/totalV;
        }
        
        while (n!=0);
        
            JOptionPane.showMessageDialog(null,"Resultado" + "\n" + "A soma de todos os valores é: " + s +
                "\n" + "vezes digitadas: " + totalV + 
                "\n" + "Total de pares: " + p +
                "\n" + "Total de impar: " + i + 
                "\n" + "Numeros Acima de 100: " + a100 +
                "\n" + "Media do total: " + m);
    }
    
}
