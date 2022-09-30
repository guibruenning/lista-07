package exer08;

public class Exer08Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1, 1000, "João");

        conta1.depositar(100);
        conta1.sacar(50);
        conta1.alterarNome("João da Silva");

        System.out.println(conta1.mostrarDados());

        Conta conta2 = new Conta(2, 2000, "Maria");

        conta2.depositar(200);
        conta2.sacar(100);
        conta2.alterarNome("Maria da Silva");

        System.out.println(conta2.mostrarDados());
    }
}
