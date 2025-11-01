public class App {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[2]; //isso é length
        l[0] = new Lutador("Edu", "Brasileiro", 29, 1.70f, 90);
        l[1] = new Lutador("Gugu", "Brasileiro", 22, 1.75f, 100);

        l[0].apresentar();
        l[0].ganharLuta();
        l[0].empatarLuta();
        l[0].status();

        System.out.println();

        l[1].apresentar();
        l[1].perderLuta();
        l[1].empatarLuta();
        l[1].status();

        System.out.println();

        Luta luta1 = new Luta();
        luta1.marcarLuta(l[0], l[1]);
        luta1.lutar();
    }
}

