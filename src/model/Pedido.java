package model;

import service.EntregaBicicleta;
import service.EntregaMoto;
import service.Entregavel;

public class Pedido {
    private static int contadorId = 0;

    private int id;
    private Usuario cliente;
    private Restaurante restaurante;
    private double valorTotal;
    private Entregavel estrategiaEntrega;

    public Pedido(Usuario cliente, Restaurante restaurante, double valorTotal, Entregavel estrategiaEntrega){
        if(cliente == null){
            throw new IllegalArgumentException("Cliente não pode estar vazio");
        }
        if(restaurante == null){
            throw new IllegalArgumentException("Restaurante não pode estar vazio");
        }
        if(estrategiaEntrega == null){
            throw new IllegalArgumentException("A estratégia de entrega não pode estar vazio");
        }

        if(valorTotal < 0){
            throw new IllegalArgumentException("O valor total não pode ser negativo");
        }

            this.id = ++contadorId;
            this.restaurante = restaurante;
            this.cliente = cliente;
            this.valorTotal = valorTotal;
            this.estrategiaEntrega = estrategiaEntrega;
    }

    public int getId() {
        return id;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setRestaurante(Restaurante restaurante) {
        if (restaurante == null){
            throw new IllegalArgumentException("model.Restaurante não pode ser vazio");
        }
        this.restaurante = restaurante;
    }

    public void setEstrategiaEntrega(Entregavel estrategiaEntrega) {
        this.estrategiaEntrega = estrategiaEntrega;
    }

    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("model.Cliente não pode ser vazio");
        }
        this.cliente = cliente;
    }

    public void processarEntrega() {
        if (estrategiaEntrega != null) {
            estrategiaEntrega.realizarEntrega(this);
        } else {
            System.out.println("Estratégia de entrega não definida para o pedido #" + id);
        }
    }

    @Override
    public String toString() {
        return "ID do pedido: " + id
                + " | Cliente: " + cliente.getNome()
                + " | Restaurante: " + restaurante.getNome()
                + " | Valor total: $" + valorTotal;

    }
}
