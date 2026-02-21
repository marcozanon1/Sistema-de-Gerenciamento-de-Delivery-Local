public class Pedido {
    private Cliente cliente;
    private Restaurante restaurante;
    private double valorTotal;

    public Pedido(Cliente cliente, Restaurante restaurante, double valorTotal) {
        this.restaurante = restaurante;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public Pedido() {
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", restaurante=" + restaurante +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
