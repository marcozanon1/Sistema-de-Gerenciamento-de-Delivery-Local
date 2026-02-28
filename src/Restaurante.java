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


}
