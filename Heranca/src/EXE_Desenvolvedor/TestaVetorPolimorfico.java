package EXE_Desenvolvedor;

public class TestaVetorPolimorfico {

    public static void mostra(Desenvolvedor dev) {
        dev.codar();
        System.out.println(dev.toString() + " Bonus: " + dev.calcularBonus());
    }

    public static void main(String[] args) {

        Desenvolvedor[] vetor = new Desenvolvedor[4];

        vetor[0] = new Junior("Ana", "Java", 5000, "Carlos");
        vetor[1] = new Pleno("Bruno", "Java", 8000, 5);
        vetor[2] = new Senior("Carla", "Java", 12000, 3000);
        vetor[3] = new Desenvolvedor("Genérico", "Java", 4000);

        for (int i = 0; i < vetor.length; i++) {
            mostra(vetor[i]);
            System.out.println("----------------------");
        }
    }
}
