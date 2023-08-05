public class Funcionarios extends Pessoas{
    private String cargo;
    private int salario;

    public Funcionarios(String nome, String genero, String dt_nasc, String cpf, String cargo, int salario) {
        super(nome, genero, dt_nasc, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int valor) {
        this.salario = valor;
    }

    public void listarFuncionarios() {
        System.out.println("FUNCIONÁRIO");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Data de nascimento: " + this.getDt_nasc());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Cargo: " + ((Funcionarios) this).getCargo());
        System.out.println("Salário: " + ((Funcionarios) this).getSalario() + "R$");
        System.out.println();
    }
}
