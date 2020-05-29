/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12exeanimal;

/**
 *
 * @author berto
 */
public class Mamifero extends Animal{
    private String corDoPelo;
    
    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    @Override
    public void alimentar(){
        System.out.println("Mamando");  
    }
    @Override
    public void emitirSom(){
        System.out.println("Sons de mamifero");
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
    
    
}
