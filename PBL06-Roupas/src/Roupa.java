public abstract class Roupa implements Produto{
    String tamanho;
    String cor;
    String marca;
    String nome;
    float preco;

    public Roupa(String tamanho, String cor, String marca, String nome) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.marca = marca;
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public float getPreco() {
        return this.preco;
    }

    @Override
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public abstract float calcularPrecoFinal(float acrescimo);
}
