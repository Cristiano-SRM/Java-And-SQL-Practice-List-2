package PraticasJava.PraticaPOO2.exercicio2;
import java.util.ArrayList;
import java.util.Scanner;
/**
* Classe que gerencia o cadastro de pessoas, permitindo cadastrar
* e exibir os registros.
*/
class Cadastro {
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    /**
    * Realiza o cadastro de uma pessoa.
    * Tipo de pessoa a ser cadastrada (1 para Pessoa, 2 para Pessoa Física,3 para Pessoa
    Jurídica).
    */
    public void cadastrarPessoa(int tipo) {
    System.out.print("Nome: ");
    String nome = scanner.nextLine();
    Pessoa p = (tipo == 1) ? new Pessoa(nome)
    : (tipo == 2) ? new PessoaFisica(nome, scanner.nextLine())
    : new PessoaJuridica(nome, scanner.nextLine());
    listaPessoas.add(p);
    System.out.println("Cadastro realizado com sucesso!\n");
    }
    /**
    * Imprime a lista de pessoas cadastradas.
    */
    public void imprimirCadastro() {
    System.out.println("\nLista de Pessoas Cadastradas:");
    listaPessoas.forEach(Pessoa::exibe);
    }
    }