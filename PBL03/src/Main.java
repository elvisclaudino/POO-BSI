public class Main {
    public static void main(String[] args) {
        Jogadores fallen = new Jogadores("Fallen", "Awper");
        Jogadores coldzera = new Jogadores("Coldzera", "Lurker");
        Jogadores fer = new Jogadores("Fer", "Riffler");
        Jogadores taco = new Jogadores("taco", "entry");
        Jogadores fnx = new Jogadores("fnx", "Fragger");

        Jogadores fasola = new Jogadores("fasola", "Awper");
        Jogadores paulo = new Jogadores("paulo", "Lurker");
        Jogadores caua = new Jogadores("caua", "Riffler");
        Jogadores elvis = new Jogadores("elvis", "entry");
        Jogadores gustavo = new Jogadores("gustavo", "Fragger");

        Time imperial = new Time("Imperial", "CT");
        Time nerds = new Time("nerds", "TR");
        Mapa mirage = new Mapa("Mirage");

        imperial.adicionaJogador(fallen);
        imperial.adicionaJogador(coldzera);
        imperial.adicionaJogador(fer);
        imperial.adicionaJogador(taco);
        imperial.adicionaJogador(fnx);

        nerds.adicionaJogador(fasola);
        nerds.adicionaJogador(paulo);
        nerds.adicionaJogador(caua);
        nerds.adicionaJogador(elvis);
        nerds.adicionaJogador(gustavo);

        mirage.adicionaTimes(imperial);
        mirage.adicionaTimes(nerds);

        System.out.println("O time " + imperial.getNome() + " de " + imperial.getLado() + " jogara contra " + nerds.getNome() + " de " + nerds.getLado() + " no mapa " + mirage.getMapa());
        System.out.println("Imperial: " + imperial.getTime());
        System.out.println("Nerds: " + nerds.getTime());
    }
}