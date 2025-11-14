package academy.devdojo.maratonajava.Exercicios.ListaDeEx;

import java.util.Scanner;

public class E12 {
    static void main() {
        determinaValor();

    }
    // 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
    //
    // 2 - À Vista no cartão de crédito, recebe 10% de desconto
    //
    // 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
    //
    // 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

    private static final double PAGAMENTO_NO_PIX = 0.85;
    private static final double PAGAMENTO_CARTAO_AVISTA = 0.90;
    private static final double PAGAMENTO_CARTAO_PARCELADO3MAIS = 1.10;

    // 1 A VISTA PIX
    // 2 CARTAO DE CREDITO + ESCOLHE PARCELAS


    public static void determinaValor() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor do produto? ");

        double valor = scanner.nextDouble();
        System.out.println("Qual a forma de pagamento? ");
        System.out.println("1 -  A VISTA PIX");
        System.out.println("2 - CARTAO DE CREDITO");
        double formaDePagamento = scanner.nextDouble();
        if (formaDePagamento == 2) {
            System.out.println("Quantas parcelas? ");
            double parceladoEmQuantos = scanner.nextDouble();
            if (parceladoEmQuantos == 1) {
                System.out.println("O valor vai ser -> " + valor * PAGAMENTO_CARTAO_AVISTA);
            } else if (parceladoEmQuantos == 2) {
                System.out.println("O Valor vai ser -> " + valor);
            } else if (parceladoEmQuantos > 2) {
                System.out.println("O valor vai ser -> " + valor * PAGAMENTO_CARTAO_PARCELADO3MAIS);
            } else if (parceladoEmQuantos == 0) {
                System.out.println("Quantidade de parcelas invalida");
            }
        } else if (formaDePagamento == 1) {
            System.out.println("O valor vai ser -> " + valor * PAGAMENTO_NO_PIX);

        }


    }
}
