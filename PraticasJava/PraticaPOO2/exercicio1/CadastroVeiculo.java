package PraticasJava.PraticaPOO2.exercicio1;
import PraticasJava.PraticaPOO2.exercicio1.Cadastro;
import PraticasJava.PraticaPOO2.exercicio1.Veiculo;
import java.util.Scanner;
/**
* Classe principal que inicializa o programa de cadastro de veículos.
*/
public class CadastroVeiculo {
    /**
    * Método principal que gerencia o menu de interação com o usuário para o cadastro de
    veículos.
    * Argumentos de linha de comando (não utilizado neste programa).
    */
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
    