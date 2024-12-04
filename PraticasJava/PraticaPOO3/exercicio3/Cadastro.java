package PraticasJava.PraticaPOO3.exercicio3;
import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void listarPessoas() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof PessoaFisica) {
                System.out.println("Pessoa Fisica - Nome: " + pessoa.getNome() + ", CPF: " + ((PessoaFisica) pessoa).getCPF());
            } else if (pessoa instanceof PessoaJuridica) {
                System.out.println("Pessoa Juridica - Nome: " + pessoa.getNome() + ", CNPJ: " + ((PessoaJuridica) pessoa).getCNPJ());
            }
        }
    }
}