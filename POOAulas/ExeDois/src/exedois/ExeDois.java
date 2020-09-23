/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exedois;

/**
 *
 * @author berto
 */
public class ExeDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int x = 11; x <= 20; x++){
            while (x%2 == 0){
                System.out.println(x);
                x++;
                while (x%2 != 0){
                    x++;
                }
            if (x == 20)
               break;
            }
            
            
        }
        
        
        
    }
    
}
