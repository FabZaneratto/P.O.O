package exe02;

public class TestaStreaming {
    public static void main(String[] args) {

        Streaming s1 = new Streaming("Carlos", "Premium");

        System.out.println("===== DADOS DA CONTA =====");
        System.out.println(s1);

        s1.assistirFilme("Interestelar");
        s1.assistirFilme("Oppenheimer");

        s1.cancelarAssinatura();

        s1.assistirFilme("Batman");

        System.out.println("\n===== ESTADO FINAL =====");
        System.out.println(s1);
    }
}