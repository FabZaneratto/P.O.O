package EXE_notificacao;

public class SMS extends Canalnotificacao {
    private int numeroTelefone;

    public SMS() {
        super();
    }

    public SMS(String destinatario, String mensagem, int numeroTelefone) {
        super(destinatario, mensagem);
        this.numeroTelefone = numeroTelefone;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para o número " +
                numeroTelefone + ": " + mensagem);
    }

    @Override
    public String toString() {
        return "SMS{" +
                "destinatario='" + destinatario + '\'' +
                ", mensagem='" + mensagem + '\'' +
                ", numeroTelefone=" + numeroTelefone +
                '}';
    }
}
