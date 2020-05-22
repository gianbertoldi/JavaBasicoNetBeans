/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaex09;

/**
 *
 * @author berto
 */
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

   
    public String detalhes() {
        return "Livro:" + "\ntitulo = " + titulo + "\n" + "autor = " + autor + 
                "\n" + "totalPag = " + totalPag  + ", pagAtual = " + pagAtual +
              "\n" + "aberto = " + aberto + "\n" +"leitor = " + leitor.getNome() +
                ", Idade = " + leitor.getIdade() +
                ", Sexo = " + leitor.getSexo();
    }
    
    

    public Livro(String titulo, String autor,int totalPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.aberto = false;
        this.pagAtual = 0;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhar(int p) {
        if (p > this.totalPag){
            this.pagAtual = 0;
        } else {
        this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
    
    
}
