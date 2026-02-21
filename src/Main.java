//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Restaurante res = new Restaurante("Sabores", "rua zezinho", "restaurante");
        Restaurante res1 = new Restaurante("Pão Bão", "rua zezinho zinho", "lanchonete");

        Cliente cl = new Cliente("Marco", "123456");
        Cliente cl1 = new Cliente("Antônio", "654321");

        SistemaDelivery sistemaDelivery = new SistemaDelivery();

        sistemaDelivery.criarPedido(cl, res, 20);
        sistemaDelivery.criarPedido(cl1, res1, 25);

        String pedidos = sistemaDelivery.listarPedidos();

        System.out.println(pedidos);



    }
}