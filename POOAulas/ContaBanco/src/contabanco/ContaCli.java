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

    public void ContaCli() {
        this.setSaldo(0);
        this.status = false;
        
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
            JOptionPane.showMessageDialog(null, "A conta do " + dono + " esta aberta!");
            //("Conta aberta");
        } else {
            JOptionPane.showMessageDialog(null,"A conta do " + dono + "Esta fechada!");
            //System.out.println("Conta fechada");
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
    
    
    public void abrirConta(){
        if("cc".equals(this.getConta()) || "CC".equals(this.getConta())){
            this.setSaldo(50);
            this.setStatus(true);
        } else if("cp".equals(this.getConta()) || "CP".equals(this.getConta())) {
            this.setSaldo(150);
            this.setStatus(true);
        } 
        JOptionPane.showMessageDialog(null, "Conta aberta com sucesso!");
    }
    public void pagarMensal(){
        int v = 0;
        
        if (this.getConta() == "CC" && this.getConta() == "cc") {
           v=12; 
        } else if (this.getConta() == "CP" && this.getConta() == "cp") {
            v=20;
        }
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - v);
            JOptionPane.showMessageDialog(null, "<html>Pagameto da mensalidade no valor de " + v + " na conta de " + dono +" realisado com sucesso!</html>");
        } else {
            JOptionPane.showMessageDialog(null, "");
        }
        
        /*if ("cc".equals(this.getConta())) {
            this.setSaldo(getSaldo() - 12);
        } else if ("cp".equals(this.getConta())) {
            this.setSaldo(getSaldo() - 20);
        }*/
    }
    
    
    public void fecharConta(){
        JOptionPane.showMessageDialog(null,"<html>Verifique que sua conta esta sem dinheiro e sem depitos para fechar</html> " );
        //System.out.println("<html>Verifique que sua conta esta sem dinheiro e sem depitos para fechar<html> ");
        if (this.getSaldo() < 0) {
            JOptionPane.showMessageDialog(null,"<html>Não pode fechar a conta com o saldo negativo </hatml>" );
            //System.out.println("<html>Não pode fechar a conta com o saldo negativo <hatml>" ); 
        } else if (this.getSaldo() > 0) {
            JOptionPane.showMessageDialog(null,"<html>Sua conta deve estar sem saldo para fechar</html>" );
            //System.out.println("<html>Sua conta deve estar sem saldo para fechar");
        } else {
            JOptionPane.showMessageDialog(null, "Sua conta foi fechada com sucesso!");
            //System.out.println("sua conta esta fechada!!");
        }
    }
    
    public void depositar(float valor){
        if(this.isStatus() == true){
            this.setSaldo(getSaldo() + valor);
            JOptionPane.showMessageDialog(null, "Deposito de " + valor + "Feito na conta de " + dono);
        }else{
            JOptionPane.showMessageDialog(null, "É necessario ter uma conta para depositar!");
            //System.out.println("Voce não possui uma conta para depositar");
        } 
    }
    
    public void sacar(float valor){
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                JOptionPane.showMessageDialog(null,"Saque de " +valor + " na conta de " + dono);
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insufiente!" + "\n" + "Seu saldo é de: " + saldo);
            }  
        } else {
            JOptionPane.showMessageDialog(null, "É preciso ter uma conta ativa para sacar");
            //System.out.println("Voce precisa ter um conta ou saldo para fazer o sacar");
        }
    }
    
    public void extratoConta(){
        JOptionPane.showMessageDialog(null,"<html>Tipo da conta: " + this.getConta() + "<br>Numero da conta: " + 
                this.getNumConta() + "<br>Nome do dono da conta: " + this.getDono() +
                "<br>Saldo diponevel: " + this.getSaldo() + "<br><html>");
        
    }

    
}
