package PraticasJava.Excessao.exercicio2;
import java.util.Scanner;
public class Atv15Alterada {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 Calculadora calculadora = new Calculadora();
 try {
 System.out.print("Digite o primeiro número (dividendo): ");
 int dividendo = input.nextInt();
 System.out.print("Digite o segundo número (divisor): ");
 int divisor = input.nextInt();
 int resultado = calculadora.dividir(dividendo, divisor);
 System.out.println("O resultado da divisão é: " + resultado);
 } catch (ArithmeticException e) {
 System.out.println("Erro: " + e.getMessage());
 } finally {
 input.close();
 }
 }
}