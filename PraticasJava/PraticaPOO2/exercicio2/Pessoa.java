package PraticasJava.PraticaPOO2.exercicio2;

/**
 * Classe que representa uma pessoa genérica.
 */
public class Pessoa { // Torne a classe pública
    private String nome;

    /**
     * Construtor da classe Pessoa.
     */
    public Pessoa(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o nome da pessoa.
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
