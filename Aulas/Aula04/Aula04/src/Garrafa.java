public class Garrafa {
    public String material;
    public String conteudo;
    public String rotulo;
    public float litros;

    //Construtor
    public Garrafa(String material, String conteudo, String rotulo, float litros){
        this.material = material;
        this.conteudo = conteudo;
        this.rotulo = rotulo;
        this.litros = litros;
    }

    //getter e setter
    public String getConteudo(){
        return conteudo;
    }
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }

    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material = material;
    }

    public String getRotulo(){
        return rotulo;
    }
    public void setRotulo(String rotulo){
        this.rotulo = rotulo;
    }

    public float getLitros(){
        return litros;
    }
    public void setLitros(float litros){
        this.litros = litros;
    }

    public void status(){
        System.out.println("Material: " + this.material);
        System.out.println("Conteúdo: " + this.conteudo);
        System.out.println("Rótulo: " + this.rotulo);
        System.out.println("Capacidade: " + this.litros + "l");
    }
}
