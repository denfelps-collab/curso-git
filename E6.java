package academy.devdojo.maratonajava.Exercicios.ListaDeEx;

public class E6 {
    static void main() {
        reajusteDe5Porcento(100);

    }

    public static void reajusteDe5Porcento(double valor){
        double reajuste = 1.05;
        double valorReajustado = valor * reajuste;
        System.out.println("Seu valor reajustado em 5% eh " +valorReajustado);
    }
}
