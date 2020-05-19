/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author berto
 */
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //metodos personalisados 
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            //this.saldo = 50;
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            //this.saldo = 150;
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com Sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Não tem como fechar a conta pois ainda tem saldo!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Voce não pode fechar a conta com debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
        
    }
    
    public void depositar(float v) {
        if (this.getStatus()) {
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito feito  na condo do " + this.getDono());
        } else {
            System.out.println("Impossivel deposita em conta fechada");
        }
        
    }
    public void sacar(float v){
        
        
        
    }
    public void pagarMensal(){
        
    }
    // metodos especial
    public void ContaBanco(){ //Contructor
        this.setSaldo(0);
        this.status = false;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
