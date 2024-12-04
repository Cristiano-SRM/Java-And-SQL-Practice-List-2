package PraticasJava.PraticaPOO1.exercicio3;
import PraticasJava.PraticaPOO1.exercicio3.Cadastro;
import PraticasJava.PraticaPOO1.exercicio3.Funcionario;
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
Cadastro cadastro = new Cadastro(5);//cria a instancia da classe funcionario podendo cadastrar 5 funcionarios
for (int i = 0; i < 5; i++) {//loop para cadastrar 5 funcionarios
System.out.println("Cadastro do Funcionário #" + (i + 1));
System.out.print("Nome: ");//solicita e le o nome do funcionario
String nome = teclado.nextLine();
System.out.print("Idade: ");//solicita e le a idade do funcionario
int idade = teclado.nextInt();
teclado.nextLine();
System.out.print("Cargo: ");//solicita e le o cargo do funcionario
String cargo = teclado.nextLine();
System.out.print("Salário: ");//solicita e le o salario do funcionario
double salario = teclado.nextDouble();
teclado.nextLine();
System.out.print("Telefone: ");//solicita e le o telefone do funcionario
String telefone = teclado.nextLine();
System.out.print("Endereço: ");//solicita e le o endereco do funcionario
String endereco = teclado.nextLine();
Funcionario funcionario = new Funcionario(nome, idade, cargo, salario, telefone, endereco);//cria um objeto funcionario com os dados fornecidos
cadastro.cadastrarFuncionario(funcionario);//cadastra o funcionario no sistema
}
System.out.println("\nLista de Funcionários Cadastrados:");
cadastro.exibeCadastro();//mostra as informacoes dos funcionarios
teclado.close();
}
}