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
public class Aula11ClasseHerançasArvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Pessoa p1 = new Pessoa(); -> classe abstrata não pode instaciada 

//       Visitante v1 =  new Visitante();
//       v1.setNome("Juvenal");
//       v1.setIdade(22);
//       v1.setSexo("M");
//       System.out.println(v1.toString());
       
       Aluno a1 = new Aluno();
       a1.setNome("Claudio");
       a1.setMatricula(1111);
       a1.setCurso("Infomormatica");
       a1.setIdade(16);
       a1.setSexo("M");
       a1.pagarMensalidade();
       
       Bolsista b1 = new Bolsista();
       b1.setNome("Jubileu");
       b1.setMatricula(1112);
       b1.setBolsa(12.5f);
       b1.setSexo("M");
       b1.pagarMensalidade();
       
       Professor p1 = new Professor();
       p1.setNome("Marcos");
       p1.setEspecialidade("I.A");
       p1.setSalario(2500.00f);
       p1.setIdade(58);
       p1.setSexo("M");
       p1.receberAumento();
       
       Tecnico t1 = new Tecnico();
       t1.setNome("Maria");
       t1.setRegistroProf("Ja fez 3 cursos");
       t1.setIdade(25);
       t1.setSexo("F");
       t1.pagarMensalidade();
       t1.praticar();
        
    }
    
}
