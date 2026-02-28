public class Pedido {
    private static int contadorId = 0;

    private int id;
    private Cliente cliente;
    private Restaurante restaurante;
    private double valorTotal;

    public Pedido(Cliente cliente, Restaurante restaurante, double valorTotal){
        if(cliente == null){
            throw new IllegalArgumentException("Cliente não pode estar vazio");
        }
        if(restaurante == null){
            throw new IllegalArgumentException("Restaurante não pode estar vazio");
        }

        if(valorTotal < 0){
            throw new IllegalArgumentException("O valor total não pode ser negativo");
        }

            this.id = ++contadorId;
            this.restaurante = restaurante;
            this.cliente = cliente;
            this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setCliente(Cliente cliente) {
        if(cliente == null){
            System.out.println("Cliente não pode estar vazio");
        } else {
        this.cliente = cliente;}
    }

    public void setRestaurante(Restaurante restaurante) {
        if(restaurante == null){
            System.out.println("Restaurante não pode estar vazio");
        } else {
        this.restaurante = restaurante;}
    }

    @Override
    public String toString() {
        return "ID do pedido: " + id
                + " | Cliente: " + cliente.getNome()
                + " | Restaurante: " + restaurante.getNome()
                + " | Valor total: $" + valorTotal;
    }
}
