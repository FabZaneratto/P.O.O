package exe01;

import java.util.ArrayList;

public class Carrinho {

    private String nomeLoja;
    private ArrayList<Produto> produtos;
    private ArrayList<ItemVenda> itens;

    public Carrinho(String nomeLoja) {
        this.nomeLoja = nomeLoja;
        this.produtos = new ArrayList<>();
        this.itens = new ArrayList<>();
    }

    // AGREGAÇÃO
    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void exibirCarrinho() {
        System.out.println("Loja: " + nomeLoja);
        System.out.println("Produtos no carrinho:");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    // COMPOSIÇÃO
    public void gerarItem(int id, int qtd, float valor) {
        ItemVenda item = new ItemVenda(id, qtd, valor);
        itens.add(item);
    }

    public void removerItem(int id) {
        for (ItemVenda item : itens) {
            if (item.getId() == id) {
                itens.remove(item);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "\nCarrinho{" +
                "loja='" + nomeLoja + '\'' +
                ", produtos=" + produtos +
                ", itens=" + itens +
                '}';
    }
}