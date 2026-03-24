package model;

public class Restaurante {
    private String nome;
    private String endereco;
    private String categoria;

    public Restaurante(String nome, String endereco, String categoria) {
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("O nome não pode estar vazio");
        }
        if(endereco == null || endereco.isBlank()){
            throw new IllegalArgumentException("O endereço não pode estar vazio");
        }

        if(categoria == null || categoria.isBlank()){
            throw new IllegalArgumentException("A categoria não pode estar vazia");
        }
            this.nome = nome;
            this.endereco = endereco;
            this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.isBlank()) {
            throw new IllegalArgumentException("Endereço não pode ser vazio");
        }
        this.endereco = endereco;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.isBlank()) {
            throw new IllegalArgumentException("Categoria não pode ser vazia");
        }
        this.categoria = categoria;
    }
}
