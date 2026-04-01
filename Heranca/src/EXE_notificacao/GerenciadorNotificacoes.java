package EXE_notificacao;

import java.util.ArrayList;

public class GerenciadorNotificacoes {

    public static void main(String[] args) {

        ArrayList<Canalnotificacao> lista = new ArrayList<>();

        lista.add(new Email("ana@email.com", "Prova amanhã!", "Aviso"));
        lista.add(new SMS("João", "Seu código chegou", 999999999));
        lista.add(new WhatsApp("Carlos", "Bora treinar?", "Visualizado"));

        for (Canalnotificacao c : lista) {
            c.enviar();
            System.out.println("----------------------");
        }
    }
}
