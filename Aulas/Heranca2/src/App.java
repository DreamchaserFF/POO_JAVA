public class App {
    public static void main(String[] args){

        Visitante v1 = new Visitante();
        Bolsista b1 = new Bolsista();
        Aluno a1 = new Aluno();


        v1.setNome("Pedro");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        a1.setNome("Edu");
        a1.setIdade(29);
        a1.setSexo("M");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.pagarMensalidade();

        b1.setNome("Carlos");
        b1.setMatricula(2222);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}
