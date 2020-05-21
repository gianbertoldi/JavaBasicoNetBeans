package aula06controlerem;

public class ControleRemoto implements Controlador {
    
    //Atributos 
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //metodos especiais 

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
        
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //metodos abtratos 

    @Override
    public void liga() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
            System.out.println("-----MENU-----");
            System.out.println("Esta ligado? " + this.getLigado());
            System.out.println("Esta tocando? " + this.getLigado());
            System.out.println("Volume " + this.getVolume());
                for (int i = 0; i<= this.getVolume(); i+=10){
                System.out.print("|");
                }
        System.out.println("");
        } else {
            System.out.println("Tente ligar antes de acessar o menu!");
        } 
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechar menu");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
           this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("Impossivel aumatar volume ");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
           this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("Impossivel aumatar volume ");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }
    

    @Override
    public void deligarMudo() {
        if (this.getLigado() && this.volume == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else{
            System.out.println("Não consegui reporduzir");
        }
 
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não conseguir aumentar volume");
        }
        
    }
    
    
    
}
