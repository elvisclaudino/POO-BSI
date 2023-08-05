public class Clientes extends Pessoas {
    private int valorConta = 0;
    public Clientes(String nome, String genero, String dt_nasc, String cpf) {
        super(nome, genero, dt_nasc, cpf);
    }

    public int getValorConta() {
        return this.valorConta;
    }

    public void setValorConta(int valor) {
        this.valorConta += valor;
    }

    public void listarClientes() {
        System.out.println("CLIENTE");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Data de nascimento: " + this.getDt_nasc());
        System.out.println("CPF: " + this.getCpf());
        System.out.println();
    }
}
