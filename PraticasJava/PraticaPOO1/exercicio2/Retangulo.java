package PraticasJava.PraticaPOO1.exercicio2;

public class Retangulo {
    private float altura, largura;

    public Retangulo() {
        altura = 0;
        largura = 0;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float alt) {
        altura = alt;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float larg) {
        largura = larg;
    }

    public float calculaArea() {
        return altura * largura;
    }

    public float calculaPerimetro() {
        return 2 * altura + 2 * largura;
    }

    public void exibe() {
        System.out.println("Altura do retangulo: " + altura);
        System.out.println("Largura do retangulo: " + largura);
        System.out.println("Area do retangulo: " + calculaArea());
        System.out.println("Perimetro do retangulo: " + calculaPerimetro());
    }
}
