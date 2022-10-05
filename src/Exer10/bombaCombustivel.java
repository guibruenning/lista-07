package Exer10;

public class bombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    // Construtor
    public bombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        setTipoCombustivel(tipoCombustivel);
        setValorLitro(valorLitro);
        setQuantidadeCombustivel(quantidadeCombustivel);
    }

    public bombaCombustivel() {
    }

    // metodos
    public double abastecerPorValor(double valor){
        double litros = valor / this.valorLitro;
        alterarQuantidadeCombustivel(litros);

        return litros;
    }

    public double abastecerPorLitro(double litros){
        double valor = litros * this.valorLitro;
        alterarQuantidadeCombustivel(litros);

        return valor;
    }

    public double alterarValor(double valor){
        setValorLitro(valor);
        return getValorLitro();
    }

    public String alterarCombustivel(String tipo){
        setTipoCombustivel(tipo);
        return getTipoCombustivel();
    }

    public double alterarQuantidadeCombustivel(double quantidade){
        setQuantidadeCombustivel(getQuantidadeCombustivel() - quantidade);
        return getQuantidadeCombustivel();
    }

    // getters e setters
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        if (tipoCombustivel.equals("gasolina") || tipoCombustivel.equals("alcool") || tipoCombustivel.equals("diesel"))
            this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        if (valorLitro > 0)
            this.valorLitro = valorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        if (quantidadeCombustivel > 0)
            this.quantidadeCombustivel = quantidadeCombustivel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("bombaCombustivel{");
        sb.append("tipoCombustivel='").append(tipoCombustivel).append('\'');
        sb.append(", valorLitro=").append(valorLitro);
        sb.append(", quantidadeCombustivel=").append(quantidadeCombustivel);
        sb.append('}');
        return sb.toString();
    }
}
