public class Restaurante {
    private String nome;
    private String endereco;
    private String categoria;

    public Restaurante(String nome, String endereco, String categoria) {
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
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
