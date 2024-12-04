package PraticasJava.PraticaPOO3.exercicio1;
import java.util.Scanner;

public class Produto {
    private static int ultimoId = 0;
    private int id;
    private String nome;
    private double preco;

    public Produto() {
        this.id = ultimoId++;
        this.nome = "Nome não informado";
        this.preco = 0;
    }

    public Produto(String nome, double preco) {
        this();
        this.nome = nome;
        setPreco(preco);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public static int getUltimoId() {
        return ultimoId - 1;
    }

    public void exibe() {
        System.out.println("Produto: " + nome);
        System.out.println("Id: " + id);
        System.out.println("Preço: " + preco);
    }

    public void reajustaPreco(double percentual) {
        this.preco += this.preco * percentual / 100;
    }
}
