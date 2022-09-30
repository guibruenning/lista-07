package exer07;

public class Exer07Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 20, 1.75, 70);
        Pessoa p2 = new Pessoa("Maria", 18, 1.65, 55);

        System.out.println("antes");
        System.out.println("Nome: " + p1.getNome() + " | Idade: " + p1.getIdade() + " | Altura: " + p1.getAltura() + " | Peso: " + p1.getPeso());
        System.out.println("Nome: " + p2.getNome() + " | Idade: " + p2.getIdade() + " | Altura: " + p2.getAltura() + " | Peso: " + p2.getPeso());


        p1.envelhecer(2);
        p2.envelhecer(5);

        p1.engordar(5);
        p2.engordar(10);

        p1.emagrecer(3);
        p2.emagrecer(7);

        System.out.println("depois");
        System.out.println("Nome: " + p1.getNome() + " | Idade: " + p1.getIdade() + " | Altura: " + p1.getAltura() + " | Peso: " + p1.getPeso());
        System.out.println("Nome: " + p2.getNome() + " | Idade: " + p2.getIdade() + " | Altura: " + p2.getAltura() + " | Peso: " + p2.getPeso());
    }
}
