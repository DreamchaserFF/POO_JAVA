public class ContaBancaria {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    
    //instancia
    public ContaBancaria(int numConta, String tipo, String dono, double saldo, boolean status){
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public ContaBancaria(int numConta, String dono){
        this.numConta = numConta;
        this.dono = dono;
        this.status = false;
    }


    //getter e setter
    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }


    //Metodos
    public void exibirDetalhes(){
        System.out.println("Numero da conta: " + this.numConta);
        if(getTipo().equals("CC")){
            System.out.println("Tipo da conta: Corrente" );
        }
        else if(getTipo().equals("CP")){
            System.out.println("Tipo da conta: Poupança");
        }
        else{
            System.out.println("Tipo de conta inválido.");
        }
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo atual: " + this.getSaldo());
        if(getStatus() == true){
            System.out.println("Conta aberta");
        }
        else{
            System.out.println("Conta fechada.");
        }
    }

    public void abrirConta(String tipo){
        if (getStatus() == false){
            setTipo(tipo);
            setStatus(true);
            if(getTipo().equals("CC")){
                setSaldo( 50);
                exibirDetalhes();
            }
            else if(getTipo().equals("CP")){
                setSaldo(150);
                exibirDetalhes();
            }
            else{
                System.out.println("Tipo de conta invalido.");
            }
        }
        else{
            System.out.println("Conta já aberta.");
        }
    }

    public void fecharConta(){
        if (getStatus() == true){
            if(getSaldo() == 0){
                setStatus(false);
                System.out.println("Conta: " + this.numConta + " fechada.");
            }
            else if(getSaldo() > 0){
                System.out.println("A conta possui saldo, favor, saque todo o valor antes de fechar a conta.");
            }
            else if(getSaldo() < 0){
                System.out.println("A conta possui débitos em aberto. Favor quitar os débitos antes de encerrar a conta.");
            }
        }
        else{
            System.out.println("A conta já se encontra fechada, possui débitos abertos ou possui saldo.");
        }
    }

    public void depositar(double deposito){
        setSaldo(getSaldo() + deposito);
        System.out.println("Saldo atual: " + this.saldo);

    }

    public void sacar(double saque){
        if(getSaldo() >= saque && getStatus() == true){
            setSaldo(getSaldo() - saque);
            System.out.println("Saldo atual: " + getSaldo());
        }
    }

    public void pagarMensalidade(double mensalidade){
        if(getStatus() == true){
            if(getTipo().equals("CC")){
                mensalidade = 12;
                setSaldo(getSaldo() - mensalidade);
                System.out.println("Saldo atual: " + getSaldo());
            }
            else{
                mensalidade = 20;
                setSaldo(getSaldo() - mensalidade);
                System.out.println("Saldo atual: " + getSaldo());
            }
        }
        else{
            System.out.println("A conta se encontra fechada.");
        }
    }
}
