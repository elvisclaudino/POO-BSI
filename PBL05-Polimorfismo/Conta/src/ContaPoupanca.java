public class ContaPoupanca extends Conta{
    public ContaPoupanca(float saldo) {
        super(saldo);
    }

    @Override
    public double mostrarSaldo() {
        double rendimento = super.mostrarSaldo() * 0.005;
        return super.mostrarSaldo() + rendimento;
    }
}
