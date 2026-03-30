public class Banco {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    Data dataDeAbertura;

    public Banco(){

    }

    public Banco(String titular){
        this.titular = titular;
    }

    //Metodo get para Saldo
    public double getSaldo(){return saldo;}

    //metodos set e set
    public String getTitular(){return titular;}
    public void setTitular(String titular){this.titular = titular;}

    public int getNumero(){return numero;}
    public void setNumero(int numero){this.numero = numero;}

    public String getAgencia(){return agencia;}
    public void setAgencia(String agencia){this.agencia = agencia;}

    public void saca(double valor){
        if(valor > this.saldo){
            System.out.println("Saque inválido");
            return; // para aqui, não imprime o saldo negativado
        }
        this.saldo -= valor;
        System.out.println("Valor sacado: "+valor);
        System.out.println("Valor atual da conta: "+this.saldo);
    }

    public void deposita(double valor){
        this.saldo += valor;
        System.out.println("Saldo atual: "+this.saldo);
    }

    public double calculaRendimeneto(){
        return this.saldo * 0.1;
    }

    public String getDadosConta(){
        String dados;
        dados = "tituar: "+this.titular;
        dados += "\nnumero: "+this.numero;
        dados += "\nagencia: "+this.agencia;
        dados += "\nsaldo: "+this.saldo;
        dados += "\nData de abertura: " + this.dataDeAbertura.formatada();
        return dados;
    }
}
