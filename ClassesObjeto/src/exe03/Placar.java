package exe03;

public class Placar {

    private String nomeTimeCasa;
    private String nomeTimeVisitante;
    private int pontosCasa;
    private int pontosVisitante;
    private int periodoQuarto;

    // Construtor
    public Placar(String nomeTimeCasa, String nomeTimeVisitante){
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    // Registrar ponto
    public void registrarPonto(String time, int tipo){

        if(tipo != 1 && tipo != 2 && tipo != 3){
            System.out.println("Tipo de ponto inválido.");
            return;
        }

        if(time.equalsIgnoreCase("casa")){
            pontosCasa += tipo;
        }
        else if(time.equalsIgnoreCase("visitante")){
            pontosVisitante += tipo;
        }
        else{
            System.out.println("Time inválido.");
        }
    }

    // Próximo quarto
    public void proximoQuarto(){
        if(periodoQuarto < 4){
            periodoQuarto++;
            System.out.println("Iniciando o " + periodoQuarto + "º quarto.");
        }
        else{
            System.out.println("O jogo já terminou.");
        }
    }

    // toString
    public String toString(){
        return nomeTimeCasa + " [" + pontosCasa + "] x [" +
                pontosVisitante + "] " + nomeTimeVisitante +
                " - Período: " + periodoQuarto;
    }
}
