package academy.devdojo.maratonajava.Exercicios.ListaDeEx;

public class E7 {
    static void main() {
        verificadorDeTrueEFalse(false, false);

    }

    public static void verificadorDeTrueEFalse(boolean a, boolean b) {
        if (a == true && b == true){
            System.out.println("Ambos sao verdadeiros");
        } else if(a == false && b == false){
            System.out.println("Ambos sao falsos");
        } else{
            System.out.println("Sao diferentes");
        }
    }
}
