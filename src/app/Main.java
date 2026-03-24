package app;

import model.*;
import service.EntregaBicicleta;
import service.EntregaMoto;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Restaurante res = new Restaurante("Delician", "rua la longe", "hamburgueria");
        Restaurante res1 = new Restaurante("Pão Bão", "rua zezinho zinho", "lanchonete");

        Cliente cliente1 = new Cliente("Ana", "999999", "ana@gmail.com");
        Cliente cliente2 = new Cliente("Maria", "888888", "maria@gmail.com");

        Entregador entregador1 = new Entregador("Joao", "777777", "joao@gmail.com");
        Entregador entregador2 = new Entregador("Pedro", "666666", "pedro@gmail.com");

        Pedido pedido1 = new Pedido(cliente1, res, 50);
        Pedido pedido2 = new Pedido(cliente2, res1, 100);

        pedido1.setEstrategiaEntrega(new EntregaBicicleta());
        pedido2.setEstrategiaEntrega(new EntregaMoto());

        List<Usuario> usuarios = List.of(cliente1, cliente2, entregador1, entregador2);
        List<Pedido> pedidos = List.of(pedido1, pedido2);


        for (Pedido p : pedidos){
            p.processarEntrega();
        }

    }
}