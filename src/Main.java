public class Main {
    public static void main(String[] args) {

        Restaurante res = new Restaurante("Delician", "rua la longe", "hamburgueria");
        Restaurante res1 = new Restaurante("Pão Bão", "rua zezinho zinho", "lanchonete");
        Restaurante res2 = new Restaurante("", "", "");

        Cliente cl = new Cliente("ana", "5555");
        Cliente cl1 = new Cliente("Antônio", "654321");
        Cliente cl2 = new Cliente("", "");


        SistemaDelivery sistemaDelivery = new SistemaDelivery();

        sistemaDelivery.criarPedido(cl, res, 20);
        sistemaDelivery.criarPedido(cl1, res1, 25);
        sistemaDelivery.criarPedido(cl1, res1, -25);

        String pedidos = sistemaDelivery.listarPedidos();

        System.out.println(pedidos);



    }
}