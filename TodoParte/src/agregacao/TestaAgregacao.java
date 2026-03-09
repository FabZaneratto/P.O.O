package agregacao;

public class TestaAgregacao {
    public static void main(String[] args) {
        Empresa google = new Empresa(1,"Google","1234");

        Freelancer fl1 = new Freelancer(10,"Maria","Programador");

        Freelancer fl2 = new Freelancer(11, "João","Scrum master");

        Freelancer fl3 = new Freelancer(12, "Carla","Gerente de projeto");


        //adiciona freelancers na empresa
        google.adicionarFreelancer(fl1);
        google.adicionarFreelancer(fl2);
        google.adicionarFreelancer(fl3);
        System.out.println(google.toString());
    }
}
