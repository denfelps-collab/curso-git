package academy.devdojo.maratonajava.Exercicios.ListaDeEx;

public class E10 {
    static void main() {
        calculaMedia(10,10,4);

    }

    public static void calculaMedia(float nota1, float nota2, float nota3){
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua media eh -> " +media);
    }
}
