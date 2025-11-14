package academy.devdojo.maratonajava.Exercicios.ListaDeEx;

public class E3 {
    static void main() {
    ifEqualSum(500,500);

    }

    public static void ifEqualSum(int numA, int numB){
        int c = 0;
        if(numA == numB){
            c = numA + numB;
            System.out.println("Sao iguais, e a soma resulta em -> " + c);
        } else {
            c = numA * numB;
            System.out.println("Nao sao iguais, e a multiplicacao resulta em -> " +c);
        }

    }
}
