public abstract class Animal {
    private String especie;
    private float peso;
    private String alimentacao;
    private int membros;


    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    
    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }

    public String getAlimentacao(){
        return alimentacao;
    }
    public void setAlimentacao(String alimentacao){
        this.alimentacao = alimentacao;
    }

    public int getMembros(){
        return membros;
    }
    public void setMembros(int membros){
        this.membros = membros;
    }


    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

}
