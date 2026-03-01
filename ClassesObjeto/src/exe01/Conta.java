package exe01;
public class Conta {
    public String nomeCliente;
    public int numeroConta, agencia;
    public float saldo;
    public boolean status;

    //Método construtor

    public Conta(int numeroConta, int agencia,String nomeCliente){
        this.nomeCliente = nomeCliente; this.numeroConta = numeroConta;
        this.agencia = agencia; this.saldo = 0;
        this.status = true;
    }
    //Depositar
    public void depositar(float valor){
        if(this.status){
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso ! saldo atual: R$ " + this.saldo);
        }
        else{
            System.out.println("Conta INATIVA, não foi possível realizar o depósito.");
        }
    }
    //Sacar
    public void sacar(float valor){
        if(this.status && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! saldo atual: R$ " + this.saldo);
        }
        else if (!this.status){
            System.out.println("Conta INATIVA.");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    //Encerrar
    public void encerrar(){
        if (this.saldo == 0){
            this.status = false;
            System.out.println("Conta encerrada com sucesso !");
        }
        else {
            System.out.println("Não foi possível encerrar a conta. Saque o saldo restante primeiro.");
        }
    }
    //To String
    public String toString(){
        return  "Número da conta: " + this.numeroConta +
                "\nAgencia: " + this.agencia +
                "\nCliente: " + this.nomeCliente +
                "\nSaldo: " + this.saldo +
                "\nStatus: "+(this.status ? "Ativa" : "Encerrada");

    }
}
