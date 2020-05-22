package aula07uef;

import java.util.Random;

public class Luta {
    //Atributos 
     private Lutador desafiado;
     private Lutador desafiante;
     private int rounds;
     private boolean aprovada;
    //Metodos
        public void marcarLuta(Lutador l1, Lutador l2){
            if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
                this.aprovada = true;
                this.desafiado = l1;
                this.desafiante = l2;
            } else {
                 this.aprovada = false;
                 this.desafiado = null;
                 this.desafiante = null;
            }
         
        }
     public void luta(){
            if (this.aprovada){
                System.out.println("--------------------------------------------------------");
                System.out.println("### DESAFIADO ####");
                this.desafiado.apresentar();
                System.out.println("--------------------------------------------------------");
                System.out.println("### DESAFIANTE ####");
                this.desafiante.apresentar();
             
                Random aleatorio = new Random();
                int vencedor = aleatorio.nextInt(3); // tempo video java #08b 10:45
                    switch(vencedor){
                        case 0: // empate
                            System.out.println("--------------------------------------------------------");
                            System.out.println("LUTA INCRIVEL! Tão equilibrada que acabou em EMPATE!");
                            this.desafiado.empatarLuta();
                            this.desafiante.empatarLuta();
                            break;
                         case 1: //desafiado vence
                             System.out.println("--------------------------------------------------------");
                            System.out.println("A VITORIA É DO " + this.desafiado.getNome() + "! " + "\n" + "Que luta incrivel se de ver");
                            this.desafiado.ganharLuta();
                            this.desafiante.perderLuta();
                            break;
                        case 2: // desafiante vence
                            System.out.println("--------------------------------------------------------");
                            System.out.println("O " + this.desafiante.getNome() + " GANHOU!" + "\n" + "Quebrando todos o paradigmas") ;
                            this.desafiado.perderLuta();
                            this.desafiante.ganharLuta();
                            break;
                    }
                    System.out.println("--------------------------------------------------------");
            }else{
                System.out.println("A luta não pode acontecer");
            }
    }
     //Metodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
     
}

