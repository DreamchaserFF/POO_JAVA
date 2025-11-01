public class Lutador implements Interface {
    //ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    //GETTERS E SETTERS
    public String getNome(){
        return nome;
    }
    private void setNome(String nome){
        this.nome = nome;
    }

    private String getNacionalidade(){
        return nacionalidade;
    }
    private void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    private int getIdade(){
        return idade;
    }
    private void setIdade(int idade){
        this.idade = idade;
    }

    private float getAltura(){
        return altura;
    }
    private void setAltura(float altura){
        this.altura = altura;
    }

    private float getPeso(){
        return peso;
    }
    private void setPeso(float peso){
        this.peso = peso;
    }

    public String getCategoria(){
        if(this.peso < 70.0f){
            this.categoria = "Leve";
        }
        else if(this.peso < 90.0f){
            this.categoria = "Medio";
        }
        else{
            this.categoria = "Pesado";
        }

        return this.categoria;
    }
    
    private void setCategoria(String categoria){
        this.categoria = categoria;
    }

    private int getVitorias(){
        return vitorias;
    }
    private void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    private int getDerrotas(){
        return derrotas;
    }
    private void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    private int getEmpates(){
        return empates;
    }
    private void setEmpates(int empates){
        this.empates = empates;
    }


    //CONSTRUTOR BASE
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    //METODOS
    @Override
    public void apresentar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
       
    }

    @Override
    public void status(){
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Numero de vitórias: " + this.getVitorias());
        System.out.println("Numero de derrotas: " + this.getDerrotas());
        System.out.println("Numero de empates: " + this.getEmpates());
    }

    @Override
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
}
