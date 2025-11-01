public class App {
    public static void main(String[] args) throws Exception {
        Cachorro c = new Cachorro();

        c.reagir("Comer");
        c.reagir("Fí duma egua");
        c.reagir(true);
        c.reagir(3,4);
        c.emitirSom();
    }
}
