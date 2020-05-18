/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial.met;

/**
 *
 * @author berto
 */
public class FormulaFatorial {
    public static int contador( int n){
        int f = 1;
        int c = n;
        //String form = " ";
        while (c>= 1){
            f= f*c;
            c--;
        }
        return f;
                
            
    } 
    
}
