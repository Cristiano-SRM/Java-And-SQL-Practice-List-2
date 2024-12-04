package PraticasJava.PraticaPOO2.exercicio4;
public class Tempo {
    private int hour;
    private int minute;
    private int second;
    public Tempo() {
    this(0, 0, 0);
    }
    public Tempo(int hour) {
    this(hour, 0, 0);
    }
    public Tempo(int hour, int minute) {
    this(hour, minute, 0);
    }
    public Tempo(int hour, int minute, int second) {
    setTempo(hour, minute, second);
    }
    public void setTempo(int hour, int minute, int second) {
    setHour(hour);
    setMinute(minute);
    setSecond(second);
    }
    public void setHour(int hour) {
    if (hour >= 0 && hour <= 23) {
    this.hour = hour;
    } else {
    throw new IllegalArgumentException("Hora inválida: deve estar entre 0 e 23");
    }
    }
    public void setMinute(int minute) {
    if (minute >= 0 && minute <= 59) {
    this.minute = minute;
    } else {
    throw new IllegalArgumentException("Minuto inválido: deve estar entre 0 e 59");
    }
    }
    public void setSecond(int second) {
    if (second >= 0 && second <= 59) {
    this.second = second;
    } else {
    throw new IllegalArgumentException("Segundo inválido: deve estar entre 0 e 59");
    }
    }
    public int getHour() {
    return hour;
    }
    public int getMinute() {
    return minute;
    }
    public int getSecond() {
    return second;
    }
    public String toString() {
    return String.format("%d:%d:%d", hour, minute, second);
    }
    public static void main(String[] args) {
    Tempo tempo1 = new Tempo();
    System.out.println("Hora padrão: " + tempo1);
    Tempo tempo2 = new Tempo(10);
    System.out.println("Hora definida: " + tempo2);
    Tempo tempo3 = new Tempo(10, 30);
    System.out.println("Hora definida: " + tempo3);
    Tempo tempo4 = new Tempo(10, 30, 45);
    System.out.println("Hora definida: " + tempo4);
    }
    }