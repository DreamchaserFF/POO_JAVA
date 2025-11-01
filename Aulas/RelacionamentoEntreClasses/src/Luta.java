public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;
    int resultado = (int)(Math.random() * 3);

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && !l1.equals(l2)){
            aprovada = true;
            desafiante = l1;
            desafiado = l2;
        }
        else{
            aprovada = false;
            desafiante = null;
            desafiado = null;
        }
    }

    public void lutar(){
        if(aprovada){
            desafiante.apresentar();
            desafiado.apresentar();
            if(resultado == 0){
                System.out.println("O desafiante " + desafiante.getNome() + " ganhou!");
                desafiante.ganharLuta();
                desafiado.perderLuta();
            }
            else if(resultado == 1){
                System.out.println("O desafiado " + desafiado.getNome() + " ganhou!");
                desafiado.ganharLuta();
                desafiante.perderLuta();
            }
            else{
                System.out.println("Empatou!");
                desafiante.empatarLuta();
                desafiado.empatarLuta();
            }
        }
        else{
            System.out.println("Luta não aprovada.");
        }
    }
}
