package EXE_Desenvolvedor;

public class Senior extends Desenvolvedor{
    private float verbaLider;

    public Senior(){
        super();
    }

    public Senior(String nome, String linguagem, float salario, float verbaLider){
        super(nome, linguagem, salario);
        this.verbaLider =  verbaLider;
    }

    public float getVerbaLider() {
        return verbaLider;
    }

    public void setVerbaLider(float verbaLider) {
        this.verbaLider = verbaLider;
    }

    @Override
    public void codar(){
        System.out.println("Senior desenhando a arquitetura e orientando a equipe");
    }

    @Override
    public double calcularBonus(){
        return this.salario * 0.15 + this.verbaLider;
    }

    @Override
    public String toString() {
        return "Senior{" +
                super.toString() +
                "verbaLider=" + verbaLider +
                '}';
    }
}
