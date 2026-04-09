package app;

import model.*;
import service.EntregaBicicleta;
import service.EntregaMoto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Restaurante res = new Restaurante("Delician", "rua la longe", "hamburgueria");
        Restaurante res1 = new Restaurante("Pão Bão", "rua zezinho zinho", "lanchonete");

        Usuario cliente1 = new Cliente("Ana", "999999", "ana@gmail.com");
        Usuario cliente2 = new Cliente("Maria", "888888", "maria@gmail.com");

        Usuario entregador1 = new Entregador("Joao", "777777", "joao@gmail.com");
        Usuario entregador2 = new Entregador("Pedro", "666666", "pedro@gmail.com");

        Pedido pedido1 = new Pedido(cliente1, res, 50, new EntregaBicicleta());
        Pedido pedido2 = new Pedido(cliente2, res1, 100, new EntregaMoto());



        List<Pedido> pedidos = List.of(pedido1, pedido2);
        List<Usuario> usuarios = List.of(cliente1, cliente2, entregador1, entregador2);

       for (Usuario u : usuarios) {
           System.out.println(u.exibirDados());
       }

     for (Pedido p : pedidos) {
         p.processarEntrega();

     }
    }
}