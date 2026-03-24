package service;


import model.Pedido;

public class EntregaMoto implements Entregavel {

    public EntregaMoto() {
    }

    @Override
    public void realizarEntrega(Pedido pedido) {
        System.out.println("Entrega feita de moto. Rápido e sua comida chega quentinha =D" );
    }
}
