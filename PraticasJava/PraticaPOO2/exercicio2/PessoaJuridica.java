package PraticasJava.PraticaPOO2.exercicio2;
/**
* Classe que representa uma pessoa jurídica, herdando a classe Pessoa.
*/
class PessoaJuridica extends Pessoa {
    private String cnpj;
    /**
    * Construtor da classe PessoaJuridica.
    * nome Nome da pessoa jurídica.
    * cnpj CNPJ da pessoa jurídica.
    */
    public PessoaJuridica(String nome, String cnpj) {
    super(nome);
    this.cnpj = cnpj;
    }
    /**
    * Exibe os dados da pessoa jurídica no formato
    * "Pessoa Jurídica: Nome='nome', CNPJ='cnpj'".
    */
    public void exibe() {
    System.out.println("Pessoa Jurídica: Nome='" + getNome() + "', CNPJ='" + cnpj + "'");
    }
    }
    