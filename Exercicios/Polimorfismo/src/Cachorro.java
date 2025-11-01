public class Cachorro extends Mamifero{
    @Override
    public void emitirSom(){
        System.out.println("Latindo.");
    }

    public void reagir(String frase){
        if(frase.equals("Comer") || frase.equals("passear")){
            System.out.println("Abanar e latir");
        }
        else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar e latir");
        }
        else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int idade, float peso){
        if(idade < 5 && peso < 10){
            System.out.println("Brincar");
        }
        else{
            System.out.println("Ignorar");
        }
    }
}
