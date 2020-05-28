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
public abstract class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniver(){
        this.idade++;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dados; \n" + "nome = " + nome + "\nidade =" + idade + "\nsexo = " + sexo;
    }
    
    
    
    
}
