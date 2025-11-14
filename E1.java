package academy.devdojo.maratonajava.Exercicios.ListaDeEx;

public class E1 {
    static void main() {
        SomaABEComparaComC(1,1,3);

    }

    public static void SomaABEComparaComC(int a, int b, int c) {
        int somaAB = a + b;
        System.out.println("Soma a + b = " + somaAB);
        if (somaAB < c) {
            System.out.println("C eh maior que a soma de a + b");
        } else {
            System.out.println("C nao e maior que a soma de a + b");
        }
    }
}
