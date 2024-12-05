package PraticasJava.Ordenacao1;

import java.util.Scanner;

public class Pratica9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ordenacao ordenacao = new Ordenacao();
        int opcao;
        do {
            int[] vetor = new int[10];
            System.out.println("Informe 10 números para serem ordenados:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                vetor[i] = input.nextInt();
            }
            System.out.println("\nEscolha o método de ordenação:");
            System.out.println("1 - Bolha");
            System.out.println("2 - Seleção");
            System.out.println("3 - Inserção");
            System.out.print("Opção: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    ordenacao.bolha(vetor);
                    System.out.println("Vetor ordenado com o método Bolha:");
                    break;
                case 2:
                    ordenacao.selecao(vetor);
                    System.out.println("Vetor ordenado com o método Seleção:");
                    break;
                case 3:
                    ordenacao.insercao(vetor);
                    System.out.println("Vetor ordenado com o método Inserção:");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }
            for (int num : vetor) {
                System.out.print(num + " ");
            }
            System.out.println("\n");
            System.out.print("Deseja executar novamente? (1 - Sim / 0 - Não): ");
            opcao = input.nextInt();
        } while (opcao == 1);
        input.close();
        System.out.println("Programa encerrado.");
    }
    /* $ javac PraticasJava/Ordenacao1/*.java
       $ java PraticasJava.Ordenacao1.Pratica9 */
}
