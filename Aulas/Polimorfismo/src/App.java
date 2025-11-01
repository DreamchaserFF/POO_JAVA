public class App {
    public static void main(String[] args){
        Ave ave1 = new Ave();

        ave1.setEspecie("Aguia");
        ave1.setAlimentacao("Carnivora");
        ave1.setCorPena("Preta e Branca");
        ave1.alimentar();
        ave1.locomover();
        ave1.emitirSom();
    }
}
