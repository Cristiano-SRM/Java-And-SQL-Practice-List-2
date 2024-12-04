package PraticasJava.PraticaPOO1.exercicio3;
import PraticasJava.PraticaPOO1.exercicio3.Funcionario;
public class Cadastro {
//atributos privados da classe
private Funcionario[] funcionarios;//armazena os funcionarios cadastrados
private int contador;//contador para rastrear o numero de funcionarios cadastrados
public Cadastro(int tamanho) {
funcionarios = new Funcionario[tamanho];
contador = 0;
}
public void cadastrarFuncionario(Funcionario funcionario) {//metodo para cadastrar um novo funcionario
if (contador < funcionarios.length) {
funcionarios[contador] = funcionario;
contador++;
} else {
System.out.println("Erro: Cadastro de funcionários está cheio.");
}
}
public void exibeCadastro() {//metodo para exibir todos os funcionarios cadastrados
if (contador == 0) {
System.out.println("Nenhum funcionário cadastrado.");
} else {
for (int i = 0; i < contador; i++) {
funcionarios[i].exibe();
}
}
}
}