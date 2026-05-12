package Exemplo;
public class CheckOut {
    public static void main(String[] args) {
        //variavel do tipo INTERFACE
        Pagamento seletor;

        //Cliente escolheu o PIX
        seletor = new Pix("zanerattofabricio@gmail.com");
        seletor.autorizar(150.00); // polimorfismo
        seletor.exibirComprovante();

        //Cliente mudou de idéia e escolheu cartão
        seletor = new CartaoCredito("111111112222223333334444");
        seletor.autorizar(300.0);
        seletor.exibirComprovante();
    }
}
