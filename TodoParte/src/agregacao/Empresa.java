package agregacao;

import java.util.ArrayList;

public class Empresa {
    private int id;
    private String nome, cnpj;
    private ArrayList Freelancers;

    public Empresa() {
        this.Freelancers = new ArrayList<>(); //cria espaços na memória
    }

    public Empresa(int id, String nome, String cnpj, ArrayList freelancers) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        Freelancers = new ArrayList<>();
    }

    public Empresa(int i, String google, String number) {
    }

    //adiciona freelancer na empresa
    public void adicionarFreelancer(Freelancer freelancer){
        this.Freelancers.add(freelancer);
    }
    //remove freelacer da empresa
    public void removerFreelancer(Freelancer freelancer){
        this.Freelancers.remove(freelancer);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList getFreelancers() {
        return Freelancers;
    }

    public void setFreelancers(ArrayList freelancers) {
        Freelancers = freelancers;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", Freelancers=" + Freelancers +
                '}';
    }
}
