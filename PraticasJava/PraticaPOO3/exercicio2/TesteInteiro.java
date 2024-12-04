package PraticasJava.PraticaPOO3.exercicio2;
import java.util.Scanner;

public class TesteInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inteiro inteiro = new Inteiro();

        int opcao;
        do {
            System.out.println("1 – Multiplicação.");
            System.out.println("2 – Potência.");
            System.out.println("3 – Divisão.");
            System.out.println("4 – Par.");
            System.out.println("5 – Sair.");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o valor de a: ");
                int a = scanner.nextInt();
                System.out.print("Digite o valor de b: ");
                int b = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado da Multiplicação: " + inteiro.multiplicacao(a, b));
                        break;
                    case 2:
                        System.out.println("Resultado da Potência: " + inteiro.potencia(a, b));
                        break;
                    case 3:
                        System.out.println("Resultado da Divisão: " + inteiro.divisao(a, b));
                        break;
                    case 4:
                        System.out.println("É par? " + inteiro.par(a));
                        break;
                }
            }
        } while (opcao != 5);

        scanner.close();
    }
}