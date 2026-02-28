import java.util.ArrayList;
import java.util.List;

public class SistemaDelivery {

    private final List<Pedido> pedidos;

    public SistemaDelivery() {
        this.pedidos = new ArrayList<>();
    }

    public void criarPedido(Cliente c, Restaurante r, double valor) {
            pedidos.add(new Pedido(c, r, valor));
    }

    public String listarPedidos() {
        StringBuilder sb = new StringBuilder();
        for (Pedido p : pedidos) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }



}
