package academy.devdojo.maratonajava.Exercicios.ListaDeEx;

public class E11 {
    static void main() {
        calculaMediaEIndica("Felipe",2,4,4,8);

    }

    public static void calculaMediaEIndica(String nome, float nota1, float nota2, float nota3, float nota4){
        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7){
            System.out.println("Parabens " +nome+" , voce foi aprovado");
            System.out.println("Sua media foi -> " +media);
        } else {
            System.out.println(nome+ ", voce foi reprovado");
            System.out.println("Sua media foi -> " +media);
        }
    }
}
