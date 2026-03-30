package EXE_Desenvolvedor;

public class TestaDesenvolvedor {

    public static void mostra(Desenvolvedor camaleao){
        camaleao.codar();// executa o codar() de quem o camaleao representa no chamado do metodo
        // executa o toString() de quem o camaleao representa no chamado do metodo
        System.out.println(camaleao.toString() + " Bonus " + camaleao.calcularBonus());
    }

    public static void main(String[] args) {
        //cria um objeto da classe desenvolvedor (classe pai)
        Desenvolvedor camaleao;
        camaleao = new Junior("Fulano", "JAVA",5000, "beltrano");
        mostra(camaleao);
        camaleao = new Pleno("Beltrano", "JAVA", 10000,7);
        mostra(camaleao);
        camaleao = new Senior("Ciclano", "JAVA", 12000, 3000);
        mostra(camaleao);
    }
}
