package PraticasJava.PraticaPOO2.exercicio1;

import java.util.Scanner;

/**
 * Classe principal que inicializa o programa de cadastro de veículos.
 */
public class CadastroVeiculo {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.print("\n1. Cadastrar Veículo\n2. Imprimir Cadastro\n3. Sair\nEscolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            if (opcao == 1) {
                cadastro.cadastrarVeiculo();
            } else if (opcao == 2) {
                cadastro.imprimirCadastro();
            }
        } while (opcao != 3);
        scanner.close();
    }
}
