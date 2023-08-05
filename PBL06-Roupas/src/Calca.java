public class Calca extends Roupa{
    private String tipo;
    public Calca(String nome, String marca, String tamanho, String cor, String tipo) {
        super(tamanho, cor, marca, nome);
        this.tipo = tipo;
    }

    @Override
    public float calcularPrecoFinal(float acrescimo) {
        this.preco += acrescimo;
        float desconto = this.preco*0.15f;
        this.preco -= desconto;
        return this.preco;
    }
}
