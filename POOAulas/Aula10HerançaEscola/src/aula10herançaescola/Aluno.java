/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10herançaescola;

/**
 *
 * @author berto
 */
public class Aluno extends Pessoa{
    //herança para diferença
    
    private int matricula;
    private String curso;
    
    public void canselarMatr(){
        System.out.println("Matricula sera cancelada");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
