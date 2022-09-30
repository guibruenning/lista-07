package exer04;

//classe salario mensal
public class Salario {
    private double valorHora;
    private double horasTrabalhadas;

    public Salario(double valorHora, double horasTrabalhadas) {
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double salarioBruto(){
        return valorHora * horasTrabalhadas;
    }

    public double descontoInss(){
        return salarioBruto() * 0.08;
    }

    public double descontoIr(){
        return salarioBruto() * 0.11;
    }

    public double descontoSindicato(){
        return salarioBruto() * 0.05;
    }

    public double salarioLiquido(){
        return salarioBruto() - descontoInss() - descontoIr() - descontoSindicato();
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String informacoes() {
        final StringBuilder info = new StringBuilder();
        info.append("Salario bruto: ").append(salarioBruto());
        info.append(" INSS: ").append(descontoInss());
        info.append(" IR: ").append(descontoIr());
        info.append(" Sindicato: ").append(descontoSindicato());
        info.append(" Salario liquido: ").append(salarioLiquido());
        return info.toString();
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salario{");
        sb.append("valorHora=").append(valorHora);
        sb.append(", horasTrabalhadas=").append(horasTrabalhadas);
        sb.append('}');
        return sb.toString();
    }
}
