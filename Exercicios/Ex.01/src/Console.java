public class Console {
    String modelo;
    boolean ligado;
    boolean portatil;
    int quantJogos;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Está ligado? " + this.ligado);
        System.out.println("É um portatil? " + this.portatil);
        System.out.println("O console possui " + this.quantJogos + " jogos.");
    }

    void jogar(){
        if (this.ligado == true && quantJogos > 0){
            System.out.println("Iniciando sistema. Tenha um bom jogo.");
        }
        else if (this.ligado == true && quantJogos < 1){
            System.out.println("O console está ligado, mas não possui jogos.");
        }
        else{
            System.out.println("Console desligado.");
        }
    }
}
