package PraticasJava.PraticaPOO3.exercicio3;
import java.util.Scanner;
public class TesteCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();

        System.out.println("Deseja cadastrar uma Pessoa Fisica (1) ou Juridica (2)?");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            PessoaFisica pf = new PessoaFisica();
            System.out.print("Informe o nome: ");
            pf.setNome(scanner.nextLine());
            System.out.print("Informe o CPF: ");
            pf.setCPF(scanner.nextLine());
            cadastro.cadastrarPessoa(pf);
        } else if (opcao == 2) {
            PessoaJuridica pj = new PessoaJuridica();
            System.out.print("Informe o nome: ");
            pj.setNome(scanner.nextLine());
            System.out.print("Informe o CNPJ: ");
            pj.setCNPJ(scanner.nextLine());
            cadastro.cadastrarPessoa(pj);
        }

        System.out.println("Lista de Pessoas Cadastradas:");
        cadastro.listarPessoas();

        scanner.close();
    }
}