public class Camisa extends Roupa{
    private String manga;
    public Camisa(String nome, String marca, String tamanho, String cor, String manga) {
        super(tamanho, cor, marca, nome);
        this.manga = manga;
    }
    @Override
    public float calcularPrecoFinal(float acrescimo) {
        this.preco += acrescimo;
        float desconto = this.preco*0.10f;
        this.preco -= desconto;
        return this.preco;
    }
}
