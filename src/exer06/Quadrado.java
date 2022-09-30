package exer06;

public class Quadrado {
    private double tamLado;

    public Quadrado(double lado) {
        setLado(lado);
    }

    public double getLado() {
        return tamLado;
    }

    public void setLado(double tamLado) {
        if (tamLado > 0)
            this.tamLado = tamLado;
    }

    public void mudarLado(double novoLado) {
        setLado(novoLado);
    }

    public double retornarLado() {
        return getLado();
    }

    public double calcularArea() {
        return tamLado * tamLado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Quadrado{");
        sb.append("lado=").append(tamLado);
        sb.append('}');
        return sb.toString();
    }
}
