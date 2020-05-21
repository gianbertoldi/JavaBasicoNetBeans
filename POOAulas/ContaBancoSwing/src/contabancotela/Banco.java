/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancotela;

import java.util.Random;


/**
 *
 * @author berto
 */
public final class Banco {
    Random numeroConta = new Random();
    
    private int numConta = numeroConta.nextInt(999) + 100;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private int senha;

    public Banco(String tipo, boolean status) {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public Random getNumeroConta() {
        return numeroConta;
                
    }

    public void setNumeroConta(Random numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
    
    
}
