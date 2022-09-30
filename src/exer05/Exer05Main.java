package exer05;

import java.util.Scanner;

public class Exer05Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cardapio[] cardapio = {new Cardapio(100, "Cachorro quente", 3.50),
                               new Cardapio(101, "Bauru simples", 4.00),
                               new Cardapio(102, "Bauru com ovo", 4.50),
                               new Cardapio(103, "Hamburguer", 5.00),
                               new Cardapio(104, "Cheeseburguer", 5.50),
                               new Cardapio(105, "Refrigerante", 3.50)};
        int sair = 0,codigo = 0,quantidade = 0;
        double total = 0;
        do {
            for (Cardapio c : cardapio) {
                System.out.println(c.mostrarCardapio());
            }

            do {
                System.out.print("Digite o código do produto: ");
                codigo = Integer.parseInt(scanner.nextLine());
            } while (codigo < 100 || codigo > 105);

            System.out.print("Digite a quantidade: ");
            quantidade = Integer.parseInt(scanner.nextLine());

            for (Cardapio c : cardapio) {
                if (c.getCodigo() == codigo) {
                    total +=  c.valorTotal(quantidade);
                    break;
                }
            }
            System.out.print("Deseja sair? (1 - Sim / 0 - Não): ");
            sair = Integer.parseInt(scanner.nextLine());

            System.out.println("\n");
        } while (sair != 1);

        System.out.println("Total: R$" + total);

    }
}
