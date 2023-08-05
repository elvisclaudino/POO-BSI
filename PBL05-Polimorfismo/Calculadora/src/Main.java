public class Main {
    public static void main(String[] args) {
        Calculadora numeros = new Numeros(1, 2);
        System.out.println(numeros.somar());
        System.out.println(numeros.subtrair());
        System.out.println(numeros.multiplicar());
        System.out.println(numeros.dividir());

        Calculadora lista = new ListasNumeros(new int[]{10, 2, 5});
        System.out.println(lista.somar());
        System.out.println(lista.subtrair());
        System.out.println(lista.multiplicar());
        System.out.println(lista.dividir());

    }
}