package PraticasJava.PraticaPOO2.exercicio3;
import java.util.Scanner;
public class Circulo {
private int x;
private int y;
private double raio;
public Circulo() {
this.x = 0;
this.y = 0;
this.raio = 0;
}
public Circulo(int x, int y, double raio) {
this.x = x;
this.y = y;
this.raio = raio;
}
public double calcularArea() {
return Math.PI * Math.pow(raio, 2);
}
public double calcularPerimetro() {
return 2 * Math.PI * raio;
}
public void moveX(int dx) {
this.x += dx;
}
public void moveY(int dy) {
this.y += dy;
}
public void aumentaRaio(int incremento) {
this.raio += incremento;
}
public void exibe() {
System.out.println("Centro do Círculo: (" + x + ", " + y + ")");
System.out.println("Raio: " + raio);
System.out.println("Área: " + calcularArea());
System.out.println("Perímetro: " + calcularPerimetro());
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Circulo circulo = new Circulo();
while (true) {
System.out.println("\nMenu:");
System.out.println("1 - Aumentar Raio");
System.out.println("2 - Mover");
System.out.println("3 - Exibir Informações");
System.out.println("4 - Sair");
System.out.print("Escolha uma opção: ");
int opcao = scanner.nextInt();
if (opcao == 4) {
System.out.println("Saindo...");
break;
}
switch (opcao) {
case 1:
System.out.print("Digite o valor para aumentar o raio: ");
int incremento = scanner.nextInt();
circulo.aumentaRaio(incremento);
break;
case 2:
System.out.print("Digite o valor para mover horizontalmente (dx): ");
int dx = scanner.nextInt();
System.out.print("Digite o valor para mover verticalmente (dy): ");
int dy = scanner.nextInt();
circulo.moveX(dx);
circulo.moveY(dy);
break;
case 3:
circulo.exibe();
break;
default:
System.out.println("Opção inválida. Tente novamente.");
break;
}
}
scanner.close();
}
}
