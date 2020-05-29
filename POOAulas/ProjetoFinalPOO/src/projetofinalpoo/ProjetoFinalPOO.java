/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalpoo;

/**
 *
 * @author berto
 */
public class ProjetoFinalPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzinta");
        
        Visualiazacao vis[] = new Visualiazacao[5];
        vis[0] = new Visualiazacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[0].avaliar(87.0f);
        vis[1] = new Visualiazacao(g[0], v[1]);
        System.out.println(vis[0].toString());
        
        /*System.out.println("Videos------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("Gafanhotos---------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
    
}
