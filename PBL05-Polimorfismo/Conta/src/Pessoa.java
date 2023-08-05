public class Pessoa {
    private Conta conta;
    private String tipoConta;

    public Pessoa(float saldo, String tipoConta) {
        this.tipoConta = tipoConta;
        if (this.tipoConta == "Conta poupanca") {
            conta = new ContaPoupanca(saldo);
        } else {
            conta = new ContaCorrente(saldo);
        }
    }

    public void depositar(double valor) {
        conta.depositar(valor);
    }

    public Conta getConta() {
        return conta;
    }
}