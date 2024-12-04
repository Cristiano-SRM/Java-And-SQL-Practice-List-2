package PraticasJava.PraticaPOO2.exercicio1;
import java.util.Scanner;
import java.util.ArrayList;
/**
* Classe que gerencia o cadastro de veículos, permitindo adicionar e exibir os registros.
*/
class Cadastro {
    public ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);
    /**
    * Realiza o cadastro de um novo veículo solicitando as informações ao usuário.
    */
    public void cadastrarVeiculo() {
    System.out.print("Marca: ");
    String marca = scanner.nextLine();
    System.out.print("Modelo: ");
    String modelo = scanner.nextLine();
    System.out.print("Número do Chassi: ");
    String numeroChassi = scanner.nextLine();
    System.out.print("Placa: ");
    String placa = scanner.nextLine();
    System.out.print("Cor: ");
    String cor = scanner.nextLine();
    listaVeiculos.add(new Veiculo(marca, modelo, numeroChassi, placa, cor));
    System.out.println("Veículo cadastrado com sucesso!\n");
    }
    /**
    * Exibe a lista de veículos cadastrados no formato definido pelo método toString().
    */
    public void imprimirCadastro() { 
        listaVeiculos.forEach(System.out::println);
    }
    }
    