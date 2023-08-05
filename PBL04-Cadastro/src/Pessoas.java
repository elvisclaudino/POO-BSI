public class Pessoas {
    private String nome;
    private String genero;
    private String dt_nasc;
    private String cpf;

    public Pessoas(String nome, String genero, String dt_nasc, String cpf) {
        this.nome = nome;
        this.genero = genero;
        this.dt_nasc = dt_nasc;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getDt_nasc() {
        return this.dt_nasc;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void listarPessoas() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Data de nascimento: " + this.getDt_nasc());
        System.out.println("CPF: " + this.getCpf());
        System.out.println();
    }

}
