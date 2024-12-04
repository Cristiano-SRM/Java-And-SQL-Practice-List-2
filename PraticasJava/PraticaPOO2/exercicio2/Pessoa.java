package PraticasJava.PraticaPOO2.exercicio2;
class Pessoa {
    private String nome;
    /**
    * Construtor da classe Pessoa.
    * Nome da pessoa.
    */
    public Pessoa(String nome) {
    this.nome = nome;
    }
    /**
    * Obtém o nome da pessoa.
    * Nome da pessoa.
    */
    public String getNome() {
    return nome;
    }
    /**
    * Exibe os dados da pessoa no formato "Pessoa: Nome='nome'".
    */
    public void exibe() {
    System.out.println("Pessoa: Nome='" + nome + "'");
    }
    }
    