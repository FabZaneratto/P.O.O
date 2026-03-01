package exe0;
public class Carro{
    // criando variáveis com visibilidade pública
    // qualquer outra classe pode acessar e alterar essas variáveis
    public String marca, modelo, cor, placa;
    public float potencia, velocidade;
    public int ano;
    boolean motor;

    // método construtor
    public Carro(String marca, String modelo, float potencia, int ano, String placa, String cor){
        this.marca = marca; this.modelo = modelo;
        this.potencia = potencia; this.ano = ano;
        this.placa = placa; this.cor = cor;
        this.motor = false; this.velocidade = 0;
    }
    //Ligar o carro
    public void Ligar(){
        if (!this.motor) {
            this.motor = true;
            System.out.println(" Motor foi ligado ");
        }
    }
    //acelerar o carro de x unidades
    public void Acelerar (float x){
        if (this.motor) {
            this.velocidade = this.velocidade + x;
            System.out.println(" carro acelerado, valor atual: " + this.velocidade);
        }
        else{
            System.out.println(" Não foi possível acelerar ");
        }
    }
    //desligar
    public void desligar(){
        if (this.motor){
            this.motor = false;
            this.velocidade = 0;
            System.out.println(" motor foi desligado ");
        }
    }
    //Frear o carro em X unidades
    public void frear(float x){
        if (this.motor && this.velocidade - x >=0){
            this.velocidade -= x;
            System.out.println(" carro freado, valor atual: " + this.velocidade);
        }
        else {
            System.out.println(" Não foi possível acelerar");
        }
    }

    // converte o objeto em String
    public String toString(){
        // this representa o objeto que chama o método
        return " Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Placa: " + this.placa +
                " Ano: " + this.ano +
                " motor: "+ (this.motor ? "ligado" : "Desligado") +
                " Velocidade: " + this.velocidade;
    }
}