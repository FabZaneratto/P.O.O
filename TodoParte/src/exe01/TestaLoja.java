package exe01;

public class TestaLoja {

    public static void main(String[] args) {

        Produto p1 = new Produto(1, "Mouse", 50);
        Produto p2 = new Produto(2, "Teclado", 120);
        Produto p3 = new Produto(3, "Monitor", 900);

        Carrinho carrinho = new Carrinho("Loja Tech");

        // AGREGAÇÃO
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);

        // COMPOSIÇÃO
        carrinho.gerarItem(1, 2, 50);
        carrinho.gerarItem(2, 1, 900);

        System.out.println(carrinho.toString());
    }
}
