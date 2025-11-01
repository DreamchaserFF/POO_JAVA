public class App {
    public static void main(String[] args){

        Console console1 = new Console();
        console1.modelo = "Super Nintendo";
        console1.ligado = true;
        console1.portatil = false;
        console1.quantJogos = 4;
    
        console1.status();
        console1.jogar();

        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

        Console console2 = new Console();
        console2.modelo = "Play Station 2";
        console2.ligado = true;
        console2.portatil = false;
        console2.quantJogos = 0;
    
        console2.status();
        console2.jogar();
    }
}

