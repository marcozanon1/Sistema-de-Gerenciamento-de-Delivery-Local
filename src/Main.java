public class Main {
    public static void main(String[] args) {

        Restaurante res = new Restaurante("Delician", "rua la longe", "hamburgueria");
        Restaurante res1 = new Restaurante("Pão Bão", "rua zezinho zinho", "lanchonete");


        Cliente cliente1 = new Cliente("Ana", "999999", "ana@gmail.com");
        Cliente cliente2 = new Cliente("Maria", "888888", "maria@gmail.com");
        Entregador entregador1 = new Entregador("Joao", "777777", "joao@gmail.com");
        Entregador entregador2 = new Entregador("Pedro", "666666", "pedro@gmail.com");

        Usuario[] usuarios = {cliente1, cliente2, entregador1, entregador2};


        for (Usuario u : usuarios){
            System.out.println(u.exibirDados());
        }

    }
}