public class Conta {
    private float saldo;

    public Conta(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double mostrarSaldo() {
        return saldo;
    }
}
