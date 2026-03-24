package model;

public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String telefone;


    public Usuario(String nome, String telefone, String email) {
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome não pode estar vazio");
        }
        if(telefone == null || telefone.isBlank()){
            throw new IllegalArgumentException("Telefone não pode estar vazio");
        }
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("Email não pode estar vazio");
        }
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome não pode estar vazio");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("Email não pode estar vazio");
        }
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone == null || telefone.isBlank()){
            throw new IllegalArgumentException("Telefone não pode estar vazio");
        }
        this.telefone = telefone;
    }

    public abstract String exibirDados();
}
