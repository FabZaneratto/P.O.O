package exe01;

public class ItemVenda {

    private int id;
    private int quantidade;
    private float valorUnitario;

    public ItemVenda(int id, int quantidade, float valorUnitario) {
        this.id = id;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    @Override
    public String toString() {
        return "\nItemVenda{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
