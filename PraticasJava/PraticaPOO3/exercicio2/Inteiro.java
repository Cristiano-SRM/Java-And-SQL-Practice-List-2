package PraticasJava.PraticaPOO3.exercicio2;
import java.util.Scanner;

public class Inteiro {
    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado += a;
        }
        return b < 0 ? -resultado : resultado;
    }

    public int potencia(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = multiplicacao(resultado, a);
        }
        return resultado;
    }

    public int divisao(int a, int b) {
        int quociente = 0;
        int sinal = (a < 0 ^ b < 0) ? -1 : 1;
        a = Math.abs(a);
        b = Math.abs(b);
        while (a >= b) {
            a -= b;
            quociente++;
        }
        return quociente * sinal;
    }

    public int resto(int a, int b) {
        while (a >= b) {
            a -= b;
        }
        return a;
    }

    public boolean par(int a) {
        return resto(a, 2) == 0;
    }
}

