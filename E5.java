package academy.devdojo.maratonajava.Exercicios.ListaDeEx;

public class E5 {
    static void main() {
        quantosSalariosMinimos(25864.40);

    }

    public static void quantosSalariosMinimos(double salario){
        double salarioMinimo = 1_293.20;
        System.out.println("Voce ganha " + salario/salarioMinimo+ " salarios minimos");
    }
}
