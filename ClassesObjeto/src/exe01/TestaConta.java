package exe01;
public class TestaConta {
    public static void main(String[] args) {
        //Instanciando 1°Objeto
        Conta c1 = new Conta (1234, 1001, "João Silva");
        System.out.println("===== TESTE CONTA 1 =====");
        System.out.println(c1.toString());
        c1.depositar(500);
        c1.sacar(200);
        c1.encerrar();
        c1.sacar(300);
        c1.encerrar();


        //Instanciando 2°Objeto
        Conta c2 = new Conta(4321, 2002, "Maria Souza");
        System.out.println("\n===== TESTE CONTA 2 =====");
        System.out.println(c2.toString());
        c2.sacar(50);

        System.out.println("\nEstado final da Conta 1:");
        System.out.println(c1);
        System.out.println("\nEstado final da Conta 2:");
        System.out.println(c2);


    }
}
