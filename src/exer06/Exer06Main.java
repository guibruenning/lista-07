package exer06;

public class Exer06Main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(5);
        Quadrado q2 = new Quadrado(10);

        System.out.println(q1);
        System.out.println(q2);

        q1.mudarLado(15);
        q2.mudarLado(20);

        System.out.println(q1);
        System.out.println(q2);

        System.out.println("Área do quadrado 1: " + q1.calcularArea());
        System.out.println("Área do quadrado 2: " + q2.calcularArea());
    }
}
