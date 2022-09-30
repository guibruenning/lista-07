package exer09;

public class Exer09Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.setCanal(10);
        tv.setVolume(20);
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());

        tv.aumentarCanal();
        tv.aumentarVolume();
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());

    }
}
