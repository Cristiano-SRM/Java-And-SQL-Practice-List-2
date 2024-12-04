package PraticasJava.PraticaPOO2.exercicio1;
import java.util.ArrayList;
import java.util.Scanner;
/**
* Classe que representa um veículo com atributos básicos como marca, modelo, chassi,
placa e cor.
*/
class Veiculo {
private String marca, modelo, numeroChassi, placa, cor;
/**
* Construtor da classe Veiculo.
* Marca do veículo.
* Modelo do veículo.
* Número do chassi do veículo.
* Placa do veículo.
* Cor do veículo.
*/
public Veiculo(String marca, String modelo, String numeroChassi, String placa, String cor)
{
this.marca = marca;
this.modelo = modelo;
this.numeroChassi = numeroChassi;
this.placa = placa;
this.cor = cor;
}
/**
* Retorna uma representação em formato de string dos dados do veículo.
* String com os atributos do veículo formatados.
*/
public String toString() {
return String.format("Veiculo {marca='%s', modelo='%s', chassi='%s', placa='%s', cor='%s'}", marca, modelo, numeroChassi, placa, cor);
}
}

