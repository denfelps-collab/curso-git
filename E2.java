package academy.devdojo.maratonajava.Exercicios.ListaDeEx;

public class E2 {
    static void main() {
        ParOuImpar(3);

    }


    public static void ParOuImpar(int num) {
        int sobra = num % 2;
        if (sobra != 0) {
            System.out.println("O numero " + num + " eh impar");
        } else {
            System.out.println("O numero " + num + " eh par");

        }
    }
}
