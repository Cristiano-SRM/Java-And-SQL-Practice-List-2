package PraticasJava.PraticaPOO1.exercicio1;
import PraticasJava.PraticaPOO1.exercicio1.ContaCorrente;
import java.util.*;
public class Main {
public static void main(String[] args) {
ContaCorrente contaCorrente;//criacao de uma instancia da classe conta corrente
contaCorrente = new ContaCorrente();
Scanner teclado = new Scanner(System.in);
System.out.print("Informe o número da conta: ");//solicita o numero da conta ao usuario
int numeroConta = teclado.nextInt();
System.out.print("Informe a agência da conta: ");//solicita a agencia da conta ao usuario
int agencia = teclado.nextInt();
contaCorrente.iniciarContaCorrente(numeroConta, agencia);//inicia a conta com os dados informados
System.out.print("Informe o valor para depósito: ");//solicita o valor do deposito ao usuario
double deposito = teclado.nextDouble();
contaCorrente.depositar(deposito);
System.out.println("\nDados da conta após o depósito:");//mostra os dados da conta apos o deposito
contaCorrente.exibe();
System.out.print("\nInforme o valor para saque: ");//solicita o valor do saque ao usuario
double saque = teclado.nextDouble();
contaCorrente.sacar(saque);
System.out.println("\nDados da conta após o saque:");//mostra os dados da conta apos o saque
contaCorrente.exibe();
teclado.close();
}
}
