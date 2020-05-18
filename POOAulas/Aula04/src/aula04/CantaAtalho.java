/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author berto
 */
public class CantaAtalho {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public CantaAtalho(String modelo, float ponta, String cor) { //construtor atalho Alt+insert construtor
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }
    //tudo feito com Alt+insert Getter + Setter 
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    
}
