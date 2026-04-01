package EXE_notificacao;

public class Email extends Canalnotificacao {
    private String assunto;

    public Email() {
        super();
    }

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando E-mail para " + destinatario +
                " com o assunto " + assunto + ": " + mensagem);
    }

    @Override
    public String toString() {
        return "Email{" +
                "destinatario='" + destinatario + '\'' +
                ", mensagem='" + mensagem + '\'' +
                ", assunto='" + assunto + '\'' +
                '}';
    }
}
