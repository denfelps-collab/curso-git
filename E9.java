package academy.devdojo.maratonajava.Exercicios.ListaDeEx;

public class E9 {
    static void main() {
        CalculaIMC(72,1.70);

    }

    public static void CalculaIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
            System.out.println("seu IMC -> " +imc);
        } else if (imc < 24.99) {
            System.out.println("Peso ideal parabens");
            System.out.println("seu IMC -> " +imc);
        } else if (imc < 29.9) {
            System.out.println("Levemente acima do peso");
            System.out.println("seu IMC -> " +imc);
        } else if (imc < 34.9) {
            System.out.println("Obesidade Grau 1");
            System.out.println("seu IMC -> " +imc);
        } else if (imc < 39.9) {
            System.out.println("Obesidade Grau 2 SEVERA");
            System.out.println("seu IMC -> " +imc);
        } else {
            System.out.println("Obesidade Grau 3 MORBIDA");
            System.out.println("seu IMC -> " +imc);
        }
    }
}
