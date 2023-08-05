public class Main {
    public static void main(String[] args) {
        Pessoa contaPoupanca = new Pessoa(1200, "Conta poupanca");
        Pessoa contaCorrente = new Pessoa(2500, "Conta corrente");

        System.out.println(contaPoupanca.getConta().mostrarSaldo());
        System.out.println(contaCorrente.getConta().mostrarSaldo());

        contaPoupanca.depositar(200);
        contaCorrente.depositar(1700);

        System.out.println(contaPoupanca.getConta().mostrarSaldo());
        System.out.println(contaCorrente.getConta().mostrarSaldo());
    }
}