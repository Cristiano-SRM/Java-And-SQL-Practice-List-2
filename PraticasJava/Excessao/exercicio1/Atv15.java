package PraticasJava.Excessao.exercicio1;
import java.util.Scanner;
public class Atv15 {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 try {
 System.out.print("Digite o primeiro número (dividendo): ");
 int num1 = input.nextInt();
 System.out.print("Digite o segundo número (divisor): ");
 int num2 = input.nextInt();
 int resultado = num1 / num2;
 System.out.println("O resultado da divisão é: " + resultado);
 } catch (ArithmeticException e) {
 System.out.println("Erro: Divisão por zero não é permitida.");
 } finally {
 input.close();
 }
}
}
 