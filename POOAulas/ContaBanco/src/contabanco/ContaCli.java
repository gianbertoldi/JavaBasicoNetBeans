/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author berto
 */
public final class ContaCli {
    Random aleatorio = new Random();
        
    public int numConta = aleatorio.nextInt(999) + 100;
    protected String conta;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaCli() {
        this.saldo = 0f;
        this.status = true;
    }

    
    public int getNumConta() {
        JOptionPane.showMessageDialog(null, "Numero da sua conta é: " + numConta);
        return numConta;
        
    }

    public void setNumConta(int numC) {
        
        this.numConta = numC;   
    }
    

    public String getConta() {
        
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
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

    public void getStatus(){
        if (status = true ) {
            System.out.println("Conta aberta");
        } else {
            System.out.println("Conta fechada");
        }
    }
    
    public String Status(){
        if (this.isStatus()== true){
            String a = "Conta aberta";
            return a;
        }
        else {
            String b = "Conta fechada";
            return b;
        }
    }
    
    public boolean isStatus(){
        return status;
    }
    
    public void setStatus(boolean status ){
        this.status = status;
    }
    
    public void pagarMensal(){
        if ("cc".equals(this.getConta())) {
            this.setSaldo(getSaldo() - 12);
        } else if ("cp".equals(this.getConta())) {
            this.setSaldo(getSaldo() - 20);
        }
    }
    
    public void abrirConta(){
        if("cc".equals(this.getConta())){
            this.setSaldo(50);
            this.setStatus(true);
        } else if("cp".equals(this.getConta())) {
            this.setSaldo(150);
            this.setStatus(true);
        } 
    }
    
    public void fecharConta(){
        System.out.println("<html>Verifique que sua conta esta sem dinheiro e sem depitos para fechar<html> ");
        if (this.getSaldo() < 0) {
            System.out.println("<html>Não pode fechar a conta com o saldo negativo <hatml>" ); 
        } else if (this.getSaldo() > 0) {
            System.out.println("<html>Sua conta deve estar sem saldo para fechar");
        } else {
            System.out.println("sua conta esta fechada!!");
        }
    }
    
    public void depositar(float valor){
        if(this.isStatus() == true){
            this.setSaldo(getSaldo() + valor);
        }else{
            System.out.println("Voce não possui uma conta para depositar");
        } 
    }
    
    public void sacar(float valor){
        if (this.isStatus() == true && this.getSaldo() > 0) {
            this.setSaldo(getSaldo() - valor);
            if (valor > saldo){
                System.out.println("Voce passou o limite de seu saldo");
            } else {
                System.out.println("Saque feito com sucesso!!");
            }
            
        } else {
            System.out.println("Voce precisa ter um conta ou saldo para fazer o sacar");
        }
    }
    
    public void extratoConta(){
        JOptionPane.showMessageDialog(null,"<html>Tipo da conta: " + this.getConta() + "<br>Numero da conta: " + 
                this.getNumConta() + "<br>Nome do dono da conta: " + this.getDono() +
                "<br>Saldo diponevel: " + this.getSaldo() + "<br><html>");
        
    }

    
}
