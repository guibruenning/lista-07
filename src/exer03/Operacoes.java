package exer03;

public class Operacoes {
    private int valor1;
    private int valor2;
    private String operacao;

    public Operacoes(int valor1, int valor2, String operacao) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacao = operacao;
    }

    public String valor() {
        double resultado = 0;
        String erro = "";
        switch (operacao) {
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            case "*":
                resultado = valor1 * valor2;
                break;
            case "/":
                if(valor2 != 0) {
                    resultado = valor1 / valor2;
                } else {
                    erro = "Não é possível dividir por zero";
                }
                break;
            default:
                erro = "Operação inválida";
        }
        return erro.length() >  3 ? erro : String.valueOf(resultado);
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Exer03{");
        sb.append("valor1=").append(valor1);
        sb.append(", valor2=").append(valor2);
        sb.append(", operacao='").append(operacao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
