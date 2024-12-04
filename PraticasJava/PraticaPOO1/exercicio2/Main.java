package PraticasJava.PraticaPOO1.exercicio2;
import PraticasJava.PraticaPOO1.exercicio2.Retangulo;
import java.util.Scanner;
public class Main {
public static void main(String Args[]) {
//criacao de uma instancia da classe Retangulo
Retangulo ret = new Retangulo();
Scanner teclado = new Scanner(System.in);
System.out.print("Informe a altura do retângulo: ");//solicita e define a altura do retangulo
ret.setAltura(teclado.nextFloat());
System.out.print("Informe a largura do retângulo: ");//solicita define a largura do retangulo
ret.setLargura(teclado.nextFloat());
ret.exibe();//mostra todas as informacoes do retangulo
teclado.close();
}
}
