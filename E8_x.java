package academy.devdojo.maratonajava.Exercicios.ListaDeEx;

import java.util.Arrays;

public class E8_x {
    static void main() {
        ordemDecrescente(1,2,3);

    }

    public static void ordemDecrescente(int a, int b, int c){
        int[] numeros = {a,b,c};

        Arrays.parallelSort(numeros);

        for (int numero : numeros) {
            System.out.println(numeros[numero-1]);

        }
    }
}
