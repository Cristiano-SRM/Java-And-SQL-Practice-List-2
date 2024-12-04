package PraticasJava.PraticaPOO2.exercicio2;

/**
 * Classe que representa uma pessoa jurídica, herdando a classe Pessoa.
 */
public class PessoaJuridica extends Pessoa { // Torne a classe pública
    private String cnpj;

    /**
     * Construtor da classe PessoaJuridica.
     */
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    /**
     * Exibe os dados da pessoa jurídica no formato
     * "Pessoa Jurídica: Nome='nome', CNPJ='cnpj'".
     */
    @Override
    public void exibe() {
        System.out.println("Pessoa Jurídica: Nome='" + getNome() + "', CNPJ='" + cnpj + "'");
    }
}
