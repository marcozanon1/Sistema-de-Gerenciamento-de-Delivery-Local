public class Entregador extends Usuario{
    public Entregador(String nome, String telefone, String email) {
        super(nome, telefone, email);
    }


    @Override
    public String exibirDados() {
        return "Entregador: " + nome + " | Telefone: " + telefone;
    }
}
