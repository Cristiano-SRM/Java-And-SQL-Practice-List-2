import java.util.*;
import PraticasJava.Ordenacao2.Ordenacao;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        
        // Loop para permitir ao usuário executar o algoritmo quantas vezes quiser
        while (true) {
            System.out.println("Escolha o método de ordenação:");
            System.out.println("1. Bolha");
            System.out.println("2. Seleção");
            System.out.println("3. Inserção");
            System.out.println("4. Quicksort");
            System.out.println("5. Merge Sort");
            System.out.print("Digite o número da opção (ou 0 para sair): ");
            int escolha = scanner.nextInt();
            
            // Se o usuário digitar 0, o programa termina
            if (escolha == 0) {
                System.out.println("Saindo...");
                break;
            }
            
            // Solicita os 10 números para ordenar
            System.out.println("Digite 10 números:");
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = scanner.nextInt();
            }

            // Executa a ordenação conforme a escolha do usuário
            switch (escolha) {
                case 1:
                    Ordenacao.bolha(vetor);
                    System.out.println("Vetor ordenado por Bolha:");
                    break;
                case 2:
                    Ordenacao.selecao(vetor);
                    System.out.println("Vetor ordenado por Seleção:");
                    break;
                case 3:
                    Ordenacao.insercao(vetor);
                    System.out.println("Vetor ordenado por Inserção:");
                    break;
                case 4:
                    Ordenacao.quicksort(vetor, 0, vetor.length - 1);
                    System.out.println("Vetor ordenado por Quicksort:");
                    break;
                    case 5:
                    Ordenacao.mergeSort(vetor, 0, vetor.length - 1); // Adicionando os índices low e high
                    System.out.println("Vetor ordenado por Merge Sort:");
                    break;
                
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            // Exibe o vetor ordenado
            Ordenacao.imprimirVetor(vetor);

            // Pergunta se o usuário deseja executar novamente
            System.out.print("Deseja executar novamente? (sim/não): ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("não")) {
                break;
            }
        }

        scanner.close();
    }
}