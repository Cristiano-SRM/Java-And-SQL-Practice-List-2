package PraticasJava.Excessao.exercicio1;
public class Calculadora {
    public int dividir(int dividendo, int divisor) throws ArithmeticException
   {
    if (divisor == 0) {
    throw new ArithmeticException("Divisão por zero não é permitida.");
    }
    if (dividendo < 0) {
    throw new ArithmeticException("O dividendo não pode ser negativo.");
    }
    return dividendo / divisor;
    }
}