package exer02;

public class Intervalo {
    private int inicio;
    private int fim;

    public Intervalo(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public String mostrarNumeros() {
        StringBuilder sb = new StringBuilder();
        for (int i = inicio; i <= fim; i++) {
            sb.append(i).append(" | ");
        }
        return sb.toString();
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Exer02{");
        sb.append("inicio=").append(inicio);
        sb.append(", fim=").append(fim);
        sb.append('}');
        return sb.toString();
    }
}
