package academy.devdojo.maratonajava.Exercicios.ListaDeEx;

public class E4 {
    static void main() {
        AntecessorESucessor(5);


    }

    public static void AntecessorESucessor(int num){
        int antecessor = num - 1;
        int sucessor = num + 1;
        System.out.println("O antecessor do seu numero eh " +antecessor+ " e o sucessor eh " + sucessor);

    }

}
