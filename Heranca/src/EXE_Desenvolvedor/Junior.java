package EXE_Desenvolvedor;

public class Junior extends Desenvolvedor {
    private String mentor;

    public Junior(){
        super(); // Chama o construtor do pai
    }

    public Junior(String nome, String linguagem, float salario, String mentor ){
        super(nome, linguagem, salario); // chamao construtor do pai
        this.mentor = mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public String getMentor(){
        return this.mentor;
    }
    @Override
    public void codar(){
        System.out.println("Junior escrevendo código com apoio do " + this.mentor);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", mentor=" + mentor +
                "}";
    }
}
