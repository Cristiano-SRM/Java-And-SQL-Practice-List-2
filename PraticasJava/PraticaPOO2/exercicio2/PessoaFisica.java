package PraticasJava.PraticaPOO2.exercicio2;

/**
 * Classe que representa uma pessoa física, herdando a classe Pessoa.
 */
public class PessoaFisica extends Pessoa { // Torne a classe pública
    private String cpf;

    /**
     * Construtor da classe PessoaFisica.
     */
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    /**
     * Exibe os dados da pessoa física no formato
     * "Pessoa Física: Nome='nome', CPF='cpf'".
     */
    @Override
    public void exibe() {
        System.out.println("Pessoa Física: Nome='" + getNome() + "', CPF='" + cpf + "'");
    }
}
