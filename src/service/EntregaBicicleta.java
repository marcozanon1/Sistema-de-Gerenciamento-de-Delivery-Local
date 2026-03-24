package service;

import model.Pedido;

public class EntregaBicicleta implements Entregavel {
    public EntregaBicicleta() {
    }

    @Override
    public void realizarEntrega(Pedido pedido) {
        System.out.println("Entrega feita de bicicleta. O planeta agredece =D");
    }
}
