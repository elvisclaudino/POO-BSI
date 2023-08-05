public class ListasNumeros extends Calculadora {
    int[] lista = new int[]{};

    public ListasNumeros(int ...lista) {
        this.lista = lista;
    }


    @Override
    public int somar() {
        int total = 0;
        for(int i=0; i<lista.length; i++){
            total += lista[i];
        }
        return total;
    }

    @Override
    public int subtrair() {
        int total = lista[0];
        for(int i=1; i<lista.length; i++){
            total -= lista[i];
        }
        return total;
    }

    @Override
    public int multiplicar() {
        int total = 1;
        for(int i=0; i<lista.length; i++){
            total *= lista[i];
        }
        return total;
    }

    @Override
    public int dividir() {
        int total = lista[0];
        for(int i=1; i<lista.length; i++){
            total /= lista[i];
        }
        return total;
    }
}
