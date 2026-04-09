package service;

import model.Cliente;
import model.Pedido;
import model.Restaurante;
import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class SistemaDelivery {

    private List<Pedido> pedidos;

    public SistemaDelivery() {
        this.pedidos = new ArrayList<>();
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void criarPedido(Usuario c, Restaurante r, double valor, Entregavel estrategiaEntrega) {
            pedidos.add(new Pedido(c, r, valor, estrategiaEntrega));
    }

    public String listarPedidos() {
        StringBuilder sb = new StringBuilder();
        for (Pedido p : pedidos) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }



}
