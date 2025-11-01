public class App {
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria(1, "Eduardo");
        conta1.abrirConta("CC");
        System.out.println();
        conta1.sacar(50);
        conta1.fecharConta();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        ContaBancaria conta2 = new ContaBancaria(2, "Caio");
        conta2.abrirConta("CP");
        System.out.println();
        conta2.depositar(500);
        conta2.exibirDetalhes();
    }
}