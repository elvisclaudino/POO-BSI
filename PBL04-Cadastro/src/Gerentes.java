public class Gerentes extends Pessoas{
    private String setor;
    private int salario;

    public Gerentes(String nome, String genero, String dt_nasc, String cpf, String setor, int salario) {
        super(nome, genero, dt_nasc, cpf);
        this.setor = setor;
        this.salario = salario;
    }

    public String getSetor() {
        return this.setor;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int valor) {
        this.salario = valor;
    }

    public void listarGerentes() {
        System.out.println("GERENTE");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Data de nascimento: " + this.getDt_nasc());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Cargo: " + ((Gerentes) this).getSetor());
        System.out.println("Salário: " + ((Gerentes) this).getSalario() + "R$");
        System.out.println();
    }
}
