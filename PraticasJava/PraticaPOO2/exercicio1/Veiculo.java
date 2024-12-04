package PraticasJava.PraticaPOO2.exercicio1;

/**
 * Classe que representa um veículo com atributos básicos como marca, modelo, chassi, placa e cor.
 */
public class Veiculo { // Tornar a classe pública
    private String marca, modelo, numeroChassi, placa, cor;

    /**
     * Construtor da classe Veiculo.
     */
    public Veiculo(String marca, String modelo, String numeroChassi, String placa, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroChassi = numeroChassi;
        this.placa = placa;
        this.cor = cor;
    }

    /**
     * Retorna uma representação em formato de string dos dados do veículo.
     */
    @Override
    public String toString() {
        return String.format(
            "Veiculo {marca='%s', modelo='%s', chassi='%s', placa='%s', cor='%s'}",
            marca, modelo, numeroChassi, placa, cor
        );
    }
}
