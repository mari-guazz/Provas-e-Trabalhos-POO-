import java.util.HashSet;
import java.util.Set;

public class TeleSena {

    public static final double VALOR = 10.0;

    private int[] conjunto1 = new int[25];
    private int[] conjunto2 = new int[25];

    public TeleSena() {
        gerarConjunto(conjunto1);
        gerarConjunto(conjunto2);
    }

    //Gera um conjunto de 25 números aleatórios de 1 a 60, sem repetição
    private void gerarConjunto(int[] conjunto) {
        Set<Integer> usados = new HashSet<>();

        int i = 0;
        while (i < 25) {
            int numero = (int) (Math.random() * 60 + 1);
            usados.add(numero);
            conjunto[i] = numero;
            i++;            
        }
    }

    public int[] getConjunto1() {
        return conjunto1;
    }

    public int[] getConjunto2() {
        return conjunto2;
    }
}
