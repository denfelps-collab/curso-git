package academy.devdojo.maratonajava.Exercicios.ListaDeEx;

import java.util.Scanner;

public class E12aprimorado {
    static void main() {
        calculaDescontoOuJuros();


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
    private static final double PAGAMENTO_CARTAO_PARCELADO_ATE_2 = 1.00;
    private static final double PAGAMENTO_CARTAO_PARCELADO_MAIS_DE_3 = 1.10;

    public static void calculaDescontoOuJuros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor do produto? ");
        double valor= scanner.nextDouble();
        System.out.println("Qual vai ser a forma de pagamento, segue tabela 1 - 4 ");
        int formaDePag = scanner.nextInt();
        switch(formaDePag){
            case 1:
                valor
                System.out.println("O Valor do produto no pix fica -> " + valor*PAGAMENTO_NO_PIX);
                break;
            case 2:
                System.out.println("O Valor do produto no cartao a vista -> + %.2f%n" +valor*PAGAMENTO_CARTAO_AVISTA);
                break;
            case 3:
                System.out.println("O Valor do produto no cartao em 2 parcelas -> " + valor*PAGAMENTO_CARTAO_PARCELADO_ATE_2);
                break;
            case 4:
                System.out.println("O Valor do produto no cartao em mais de 3 parcelas -> " +valor*PAGAMENTO_CARTAO_PARCELADO_MAIS_DE_3);
                break;
            default:
                System.out.println("Opção invalida");


        }

    }

}

