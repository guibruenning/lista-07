package exer04;

import java.util.Scanner;

public class Exer04Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = Double.parseDouble(scanner.nextLine());

        Salario exer04 = new Salario(valorHora, horasTrabalhadas);
        System.out.println(exer04.informacoes());
    }
}
