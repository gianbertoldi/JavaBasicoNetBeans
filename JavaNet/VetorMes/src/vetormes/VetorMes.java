/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetormes;

import java.util.Calendar;

/**
 *
 * @author berto
 */
public class VetorMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar ano = Calendar.getInstance();
        String mes[] = {"Jan","Fev","Mar","Abr","Mai",
            "Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int cal = ano.get(Calendar.YEAR);
        for (int c = 0; c < mes.length; c++) {
           
            if (cal%4 == 0 && cal%100 !=0){
                dias[1] = 29;
                 System.out.println("O mes de " + mes[c] + " tem " +
                    dias[c] + " dias ao todo" + " e o ano é bissesto");
            } else{
                System.out.println("O mes de " + mes[c] + " tem " +
                    dias[c] + " dias ao todo" + " e o ano não é bissesto");
                
            }
            
        }
    }
    }
    

