//Classe
public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;


    //Construtor
    public ControleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }


    //Getters e Setters
    private int getVolume(){
        return volume;
    }
    private void setVolume(int volume){
        this.volume = volume;
    }

    private boolean getLigado(){
        return ligado;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private boolean getTocando(){
        return tocando;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }


    //Metodos Abstratos
    @Override
    public void ligar(){
        this.setLigado(true);
    }

    @Override
    public void desligar(){
        this.setLigado(false);
    }

    @Override
    public void abrirMenu(){
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume(){
        if(getLigado()){
            this.setVolume(getVolume() + 1);
        }
    }

    @Override
    public void menosVolume(){
        if(getLigado()){
            this.setVolume(getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo(){
        if(getLigado() && getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo(){
        if(getLigado() && getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
