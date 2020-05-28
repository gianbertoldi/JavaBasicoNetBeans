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
public final class Tecnico extends Aluno {
    
    private String registroProf;
    
    public void praticar(){
        System.out.println(this.getNome() + " esta praticando!");
    }

    public String getRegistroProf() {
        return registroProf;
    }

    public void setRegistroProf(String registroProf) {
        this.registroProf = registroProf;
    }
    
}
