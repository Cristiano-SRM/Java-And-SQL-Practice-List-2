package PraticasJava.PraticaPOO2.exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe que gerencia o cadastro de pessoas, permitindo cadastrar
 * e exibir os registros.
 */
public class Cadastro { // Torne a classe pública
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    /**
     * Realiza o cadastro de uma pessoa.
     */
    public void cadastrarPessoa(int tipo) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        Pessoa p = (tipo == 1) 
            ? new Pessoa(nome)
            : (tipo == 2) 
                ? new PessoaFisica(nome, solicitarEntrada("CPF"))
                : new PessoaJuridica(nome, solicitarEntrada("CNPJ"));
        listaPessoas.add(p);
        System.out.println("Cadastro realizado com sucesso!\n");
    }

    /**
     * Solicita uma entrada ao usuário.
     */
    private String solicitarEntrada(String tipoDocumento) {
        System.out.print(tipoDocumento + ": ");
        return scanner.nextLine();
    }

    /**
     * Imprime a lista de pessoas cadastradas.
     */
    public void imprimirCadastro() {
        System.out.println("\nLista de Pessoas Cadastradas:");
        listaPessoas.forEach(Pessoa::exibe);
    }
}
