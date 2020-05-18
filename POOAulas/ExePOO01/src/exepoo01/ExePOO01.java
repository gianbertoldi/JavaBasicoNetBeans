/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepoo01;

/**
 *
 * @author berto
 */
public class ExePOO01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Isqueiro i1 = new Isqueiro();
        
        i1.tipo = "Maçarico";
        i1.cor = "verde";
        i1.carga = 57;
        i1.aceso();
        i1.incediando();
        i1.status();
        
        Isqueiro i2 = new Isqueiro();
        
        i2.tipo = "Maçarico";
        i2.cor = "preto";
        i2.carga = 100;
        i2.apagado();
        i2.incediando();
        i2.status();
        
    }
    
}
