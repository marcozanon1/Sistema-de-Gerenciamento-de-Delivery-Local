public class Cliente {
    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome não pode estar vazio");
        }
        if(telefone == null || telefone.isBlank()){
            throw new IllegalArgumentException("Telefone não pode estar vazio");
        }
            this.nome = nome;
            this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank()){
            System.out.println("Nome não pode estar em branco");
        } else {
        this.nome = nome;}
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone == null || telefone.isBlank()){
            System.out.println("Telefone não pode estar em branco");
        } else {
        this.telefone = telefone;}
    }


}
