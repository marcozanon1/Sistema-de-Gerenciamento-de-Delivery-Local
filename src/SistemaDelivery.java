import java.util.ArrayList;

public class SistemaDelivery {

    public SistemaDelivery() {
    }

    ArrayList<Pedido> pedidos = new ArrayList<>();

    public void criarPedido(Cliente c, Restaurante r, double valor){
        pedidos.add( new Pedido(c, r, valor));
    }

    public String listarPedidos() {
        StringBuilder sb = new StringBuilder();
        for (Pedido p : pedidos) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }



}
