import java.util.ArrayList;

public class Time {
    private String nome;
    private String lado;
    private ArrayList<Jogadores> listaDeJogadores;

    public Time(String nome, String lado) {
        this.nome = nome;
        this.lado = lado;

        listaDeJogadores = new ArrayList<>();
    }

    public void adicionaJogador(Jogadores jogadores) {
        listaDeJogadores.add(jogadores);
    }

    public String getTime() {
        String message = "";
        for (Jogadores jogador: listaDeJogadores) {
            message += jogador.getNick() + " ";
        }
        return message;
    }

    public String getNome() {
        return nome;
    }

    public String getLado() {
        return lado;
    }
}
