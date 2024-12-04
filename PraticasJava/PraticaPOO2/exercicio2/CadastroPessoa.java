package PraticasJava.PraticaPOO2.exercicio2;

import java.util.Scanner;

/**
 * Classe principal que inicializa o programa de cadastro de pessoas.
 */
public class CadastroPessoa { // Renomeado para PascalCase
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        try {
            do {
                System.out.print(
                    "\n1. Cadastrar Pessoa\n2. Cadastrar Pessoa Física\n3. Cadastrar Pessoa Jurídica\n4. Imprimir Cadastro\n5. Sair\nEscolha: "
                );
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                if (opcao >= 1 && opcao <= 3) {
                    cadastro.cadastrarPessoa(opcao);
                } else if (opcao == 4) {
                    cadastro.imprimirCadastro();
                }
            } while (opcao != 5);
        } finally {
            scanner.close();
        }
    }
}
