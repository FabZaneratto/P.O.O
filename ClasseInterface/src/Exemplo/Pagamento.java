package Exemplo;
public interface Pagamento{
    //Contrato: quem implementar essa classe, deve oferecer os métodos abaixo

    public void autorizar(double valor);
    public void exibirComprovante();
}