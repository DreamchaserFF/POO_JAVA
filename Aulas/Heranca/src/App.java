public class App {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Carlos");
        p3.setNome("Isabella");
        p4.setNome("Marcio");

        p2.setCurso("Contabilidade");
        p3.setSalario(10000f);
        p4.setSetor("Gestao");

        p2.cancelarMatricula();
        p3.setSalario(1500f);
        p3.receberAum(300f);

    }
}
