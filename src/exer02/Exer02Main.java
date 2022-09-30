package exer02;

import java.util.Scanner;

public class Exer02Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o inicio: ");
        int inicio = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o fim: ");
        int fim = Integer.parseInt(sc.nextLine());

        if(inicio > fim) {
            System.out.println("os valores de inicio e fim estão invertidos");
            int aux = inicio;
            inicio = fim;
            fim = aux;
        }

        Intervalo e = new Intervalo(inicio, fim);
        System.out.println(e.mostrarNumeros());
    }
}
