package PraticasJava.PraticaPOO2.exercicio2;
/**
* Classe que representa uma pessoa física, herdando a classe Pessoa.
*/
class PessoaFisica extends Pessoa {
    private String cpf;
    /**
    * Construtor da classe PessoaFisica.
    * nome Nome da pessoa física.
    * cpf CPF da pessoa física.
    */
    public PessoaFisica(String nome, String cpf) {
    super(nome);
    this.cpf = cpf;
    }
    /**
    * Exibe os dados da pessoa física no formato
    * "Pessoa Física: Nome='nome', CPF='cpf'".
    */
    public void exibe() {
    System.out.println("Pessoa Física: Nome='" + getNome() + "', CPF='" + cpf + "'");
    }
    }
    