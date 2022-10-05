package Exer10;

public class Exer10Main {
    public static void main(String[] args) {
        bombaCombustivel bomba = new bombaCombustivel("gasolina", 4.50, 1000);
        System.out.println("Valor a ser pago: " + bomba.abastecerPorLitro(50));
        System.out.println("Quantidade de combustivel restante: " + bomba.getQuantidadeCombustivel());

        System.out.println("Valor a ser pago: " + bomba.abastecerPorValor(100));
        System.out.println("Quantidade de combustivel restante: " + bomba.getQuantidadeCombustivel());

        System.out.println("Valor do litro alterado para: " + bomba.alterarValor(4.50));
        System.out.println("Valor a ser pago: " + bomba.abastecerPorLitro(50));

        System.out.println("Tipo de combustivel alterado para: " + bomba.alterarCombustivel("alcool"));
        System.out.println("Valor a ser pago: " + bomba.abastecerPorLitro(50));

        System.out.println("Quantidade de combustivel restante: " + bomba.getQuantidadeCombustivel());


    }
}
