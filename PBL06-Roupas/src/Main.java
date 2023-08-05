public class Main {
    public static void main(String[] args) {
        Roupa camisa = new Camisa("camisa", "nike", "M", "azul", "longa");
        Roupa calca = new Calca("calça", "nike", "M", "azul-escuro", "Cargo");
        Roupa vestido = new Vestido("vestido", "prada", "P", "rosa", "Curto");

        System.out.println("Produto: " + camisa.getNome());
        System.out.println("Marca: " + camisa.getMarca());
        camisa.setPreco(50);
        System.out.println("Preço inicial: " + camisa.getPreco() + "R$");
        System.out.println("Preço com desconto e acréscimo: " + camisa.calcularPrecoFinal(10) + "R$");
        System.out.println();

        System.out.println("Produto: " + calca.getNome());
        System.out.println("Marca: " + calca.getMarca());
        calca.setPreco(240);
        System.out.println("Preço inicial: " + calca.getPreco() + "R$");
        System.out.println("Preço com desconto e acréscimo: " + calca.calcularPrecoFinal(24) + "R$");
        System.out.println();

        System.out.println("Produto: " + vestido.getNome());
        System.out.println("Marca: " + vestido.getMarca());
        vestido.setPreco(540);
        System.out.println("Preço inicial: " + vestido.getPreco() + "R$");
        System.out.println("Preço com desconto e acréscimo: " + vestido.calcularPrecoFinal(45) + "R$");
    }
}