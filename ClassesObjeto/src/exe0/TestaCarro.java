package exe0;
public class TestaCarro {
    public static void main(String args[]){
        // instância obj1
        Carro obj1 = new Carro("Fiat", "Palio", 1.6f, 2020, "BRA2E19", "Azul");
        System.out.println(obj1.toString());
        obj1.Ligar();
        obj1.Acelerar(200);
        System.out.println(obj1.toString());
        obj1.frear(120);
        System.out.println(obj1.toString());
        obj1.frear(80);
        obj1.desligar();
        System.out.println(obj1.toString());


        Carro obj2 = new Carro("Honda", "Civic", 1.6f, 2020, "QXZ5M47", "Preto");


        Carro obj3 = new Carro("Fiat", "Palio Adventure", 1.6f, 2020, "LRT8K63", "Cinza");


    }
}
