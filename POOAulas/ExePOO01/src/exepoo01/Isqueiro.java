
package exepoo01;

public class Isqueiro {
    String tipo;
    String cor;
    boolean aceso;
    int carga;
    
    void status() {
        System.out.println("O tipo de isquiero é: " + this.tipo);
        System.out.println("Ele é:" + this.cor );
        System.out.println("sua carga esta em: " + this.carga +"%" + "\n");
    }
    void incediando() {
        if (aceso == true) {
            System.out.println("Voce pode incendiar algo" );
            
        } else {
            System.out.println("Tente acender o isqueiro antes de botar fogo no sofa");
        }
        
    }
    void aceso() {
        this.aceso = true;
        
    }
    void apagado() {
        this.aceso = false;
        
    }
}
