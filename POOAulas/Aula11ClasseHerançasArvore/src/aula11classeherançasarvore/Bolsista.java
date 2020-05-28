/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11classeherançasarvore;

/**
 *
 * @author berto
 */
public final class Bolsista extends Aluno { //Final não pode se sobre posta
    
    private float  bolsa;
    
    public void renovarBolsa(){
        System.out.println("renovando bolsa" + this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+ " é bolsista! Pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
