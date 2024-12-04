package PraticasJava.PraticaPOO1.exercicio3;
public class Funcionario {
    //atributos privados da classe Funcionario
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private String telefone;
    private String endereco;
    public Funcionario(String nome, int idade, String cargo, double
    salario, String telefone, String endereco) {//contrutora que inicializa os atributos da classe com os valores fornecidos
    this.nome = nome;
    this.idade = idade;
    this.cargo = cargo;
    this.salario = salario;
    this.telefone = telefone;
    this.endereco = endereco;
    }
    public void exibe() {//metodo para mostrar todas as informacoes de funcionarios
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Cargo: " + cargo);
    System.out.println("Salário: R$ " + salario);
    System.out.println("Telefone: " + telefone);
    System.out.println("Endereço: " + endereco);
    }
    }
    