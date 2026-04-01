package EXE_notificacao;

public abstract class Canalnotificacao {
    protected String destinatario;
    protected String mensagem;

    public Canalnotificacao() {
    }

    public Canalnotificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public void exibirDados() {
        System.out.println("Destinatário: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }

    public abstract void enviar();
}
