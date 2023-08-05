public class Vestido extends Roupa{
    private String decote;
    public Vestido(String nome, String marca, String tamanho, String cor, String decote) {
        super(tamanho, cor, marca, nome);
        this.decote = decote;
    }

    @Override
    public float calcularPrecoFinal(float acrescimo) {
        this.preco += acrescimo;
        float desconto = this.preco*0.20f;
        this.preco -= desconto;
        return this.preco;
    }
}
