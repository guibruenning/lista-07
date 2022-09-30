package exer09;

public class Televisao {
    private int volume;
    private int canal;


    // Construtor
    public Televisao() {
        this.volume = 0;
        this.canal = 0;
    }

    public Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    // metodos

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

    public void aumentarCanal() {
        this.canal++;
    }

    public void diminuirCanal() {
        this.canal--;
    }

    public void trocarCanal(int canal) {
        this.canal = canal;
    }

    // getters e setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100)
            this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal >= 0 && canal <= 100)
            this.canal = canal;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Televisao{");
        sb.append("volume=").append(volume);
        sb.append(", canal=").append(canal);
        sb.append('}');
        return sb.toString();
    }
}
