package PraticasJava.PraticaPOO1.exercicio1;
import java.util.*;
public class ContaCorrente {
//atributos privados da classe
private int numero, agencia;
private double saldo;
public void iniciarContaCorrente(int n, int ag) {//metodo para inicializar a conta
numero = n;
agencia = ag;
saldo = 0;
}
public void sacar(double valor){//metodo para realizar saque
if(valor > saldo){
System.out.println("Erro: Saldo insuficiente para realizar o saque.");
}else{
saldo -= valor;
System.out.println("Saque de R$" + valor + "realizado com sucesso.");
}
}
public void depositar(double valor){//metodo para depositar
if (valor > 0) {
saldo += valor;
System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
} else {
System.out.println("Erro: O valor do depósito deve ser positivo.");
}
}
public double consultarSaldo(){//metodo que consulta o saldo
return (saldo);
}
public void exibe() {//metodo para exibir as informações da conta
System.out.println("Número da Conta: " + numero);
System.out.println("Agência: " + agencia);
System.out.println("Saldo: " + saldo);
}
}
