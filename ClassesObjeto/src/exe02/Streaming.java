package exe02;

public class Streaming {

    private String usuario;
    private String plano;
    private float mensalidade;
    private boolean ativo;
    private String ultimoFilmeAssistido;

    // Construtor
    public Streaming(String usuario, String plano){
        this.usuario = usuario;
        this.plano = plano;

        if(plano.equalsIgnoreCase("Básico")){
            this.mensalidade = 25.90f;
        }
        else if(plano.equalsIgnoreCase("Premium")){
            this.mensalidade = 45.90f;
        }
        else if(plano.equalsIgnoreCase("Família")){
            this.mensalidade = 60.90f;
        }

        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    // Método assistir filme
    public void assistirFilme(String nomeFilme){
        if(this.ativo){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        }
        else{
            System.out.println("Conta suspensa. Pague a fatura para continuar.");
        }
    }

    // Método cancelar assinatura
    public void cancelarAssinatura(){
        this.ativo = false;
        System.out.println("Assinatura cancelada.");
    }

    // toString
    public String toString(){
        return "Usuário: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: R$ " + mensalidade +
                "\nStatus: " + (ativo ? "Ativo" : "Suspenso") +
                "\nÚltimo filme assistido: " + ultimoFilmeAssistido;
    }
}
