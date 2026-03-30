package sistema_Veiculo;

public class TestaVeiculo {

    public static void mostra(Veiculo v) {
        v.mover();
        v.abastecer();
        System.out.println(v.toString());
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Veiculo camaleao;

        camaleao = new Aviao("Boeing", "747", 900, 10000);
        mostra(camaleao);

        camaleao = new CarroEletrico("Tesla", "Model S", 120, 500);
        mostra(camaleao);
    }
}