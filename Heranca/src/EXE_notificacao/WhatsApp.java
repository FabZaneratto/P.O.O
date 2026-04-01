package EXE_notificacao;

public class WhatsApp extends Canalnotificacao {
    private String statusLeitura;

    public WhatsApp() {
        super();
    }

    public WhatsApp(String destinatario, String mensagem, String statusLeitura) {
        super(destinatario, mensagem);
        this.statusLeitura = statusLeitura;
    }

    public String getStatusLeitura() {
        return statusLeitura;
    }

    public void setStatusLeitura(String statusLeitura) {
        this.statusLeitura = statusLeitura;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Zap para " + destinatario +
                "... Mensagem: " + mensagem);
    }

    @Override
    public String toString() {
        return "WhatsApp{" +
                "destinatario='" + destinatario + '\'' +
                ", mensagem='" + mensagem + '\'' +
                ", statusLeitura='" + statusLeitura + '\'' +
                '}';
    }
}
