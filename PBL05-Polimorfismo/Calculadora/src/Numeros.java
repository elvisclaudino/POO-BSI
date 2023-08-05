public class Numeros extends Calculadora{
    private int n1;
    private int n2;
    public Numeros(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    @Override
    public int somar() {
        return n1 + n2;
    }

    @Override
    public int subtrair() {
        return n1 - n2;
    }

    @Override
    public int multiplicar() {
        return n1 * n2;
    }

    @Override
    public int dividir() {
        return n1 / n2;
    }
}
