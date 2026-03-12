public class Cliente extends Usuario {


    public Cliente(String nome, String telefone, String email) {
        super(nome, telefone, email);
    }



    @Override
    public String exibirDados() {
        return "Cliente: " + nome + " | Telefone: " + telefone + " | Email: " + email;
    }


}
