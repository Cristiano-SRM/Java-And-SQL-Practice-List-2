package PraticasJava.PraticaPOO3.exercicio1;
import java.util.Scanner;
public class TesteProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do primeiro produto:");
        String nome1 = scanner.nextLine();
        System.out.println("Informe o preço do primeiro produto:");
        double preco1 = scanner.nextDouble();
        Produto produto1 = new Produto(nome1, preco1);

        scanner.nextLine();

        System.out.println("Informe o nome do segundo produto:");
        String nome2 = scanner.nextLine();
        System.out.println("Informe o preço do segundo produto:");
        double preco2 = scanner.nextDouble();
        Produto produto2 = new Produto(nome2, preco2);

        System.out.println("Informe o percentual de reajuste:");
        double reajuste = scanner.nextDouble();
        produto1.reajustaPreco(reajuste);
        produto2.reajustaPreco(reajuste);

        System.out.println("Informações dos produtos:");
        produto1.exibe();
        produto2.exibe();

        System.out.println("Último ID gerado: " + Produto.getUltimoId());

        scanner.close();
    }
}