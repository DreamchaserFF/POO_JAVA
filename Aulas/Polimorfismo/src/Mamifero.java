public class Mamifero extends Animal{
    private String corPelo;


    public String getCorPelo(){
        return corPelo;
    }
    public void setCorPelo(String corPelo){
        this.corPelo = corPelo;
    }


    @Override
    public void locomover(){
        System.out.println("Andando");
    }
    @Override
    public void alimentar(){
        System.out.println("O mamifero foi alimentado.");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som emitido.");
    }
}
