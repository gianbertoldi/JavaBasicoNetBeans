package aula02;


public class Aula02 {


    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic cristal";
        c1.cor =  "azul";
        // c1.ponta = 0.5;
        c1.carga = 80;
        //c1.tampada= true;
        c1.destampar();
        c1.rabiscar();
        c1.status();
        
    }
    
}
