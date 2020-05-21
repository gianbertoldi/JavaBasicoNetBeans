
package contabanco;

import javax.swing.JOptionPane;

public class ContaBanco {

    

    public static void main(String[] args) {
     ContaCli c1 = new ContaCli();
     
     String decision;
     
     JOptionPane.showMessageDialog(null,"Bem vindo a banco 42");
     c1.setConta(JOptionPane.showInputDialog("<html> Deseja abrir uma conta corrente ou popança? <br> [cc/cp]</br></htmal>" )) ;
     c1.setDono(JOptionPane.showInputDialog(null,"<html>Informe seu nome para abrir a conta</html>"));
     c1.getNumConta();
     decision = (JOptionPane.showInputDialog(null, "Deseja ativar a conta" + "\n" + "[s]/[n]"));
        if ("s".equals(decision) && "S".equals(decision)){
             int c,n;        
                    
            do{
               
                c = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Banco 42 <br><em> (Aperte 0 para sair ou 1 para continuar</em></html>"));

                if (c == 0){
                    break;
                }else{
                    n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Digite 1 [Ativar a conta]<br>Digite 2 [Extrato]<br>Digite 3 [Fechar a conta]<br>Digite 4 [Depositar]"
                + "<br>Digite 5 [Sacar]<br>Digite 6 [Pagar Mensalidade]<br>Digite 0 [SAIR]"));
                
                
                    switch(n){
                        case 0:
                            break;
                        case 1:
                            c1.abrirConta();
                            break;
                        case 2:
                            c1.extratoConta();
                            break;
                        case 3:
                            c1.fecharConta();
                            break;
                        case 4:
                            int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor que deseja depositar?"));
                            c1.depositar(a);
                            break;
                        case 5:
                            int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Infomre o valor a ser sacado"));
                            c1.sacar(b);
                        case 6:
                            c1.pagarMensal();
                    }
                }
            
        } while (c != 0);
        
    }
    
}}
