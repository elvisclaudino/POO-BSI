import java.util.ArrayList;

public class Mapa {
    private String nome;
    private ArrayList<Time> times;

    public Mapa(String nome) {
        this.nome = nome;
        times = new ArrayList<>();
    }

    public void adicionaTimes(Time time) {
        times.add(time);
    }

    public String getMapa() {
        return nome;
    }
}
