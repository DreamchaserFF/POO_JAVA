public class App {
    public static void main(String[] args){
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula de Java");

        System.out.println(v[0].toString());

        Gafanhoto g = new Gafanhoto("Edu", 29, "M", "chaser");
        System.out.println(g.toString());

        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(g, v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g, v[1]);
        vis[1].avaliar(87.f);
        System.out.println(vis[1].toString());
    }
}
