package exer05;

public class Cardapio {
    private int codigo;
    private String descricao;
    private double preco;

    public Cardapio(int codigo, String descricao, double preco) {
        setCodigo(codigo);
        setDescricao(descricao);
        setPreco(preco);
    }
    public Cardapio() {
    }

    public double valorTotal(int quantidade){
        return preco * quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo >= 100 && codigo <= 105)
            this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.length() > 0)
            this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0)
            this.preco = preco;
    }

    public String mostrarCardapio() {
        final StringBuilder Cardapio = new StringBuilder();
        Cardapio.append("Código: ").append(codigo);
        Cardapio.append(" - ").append(descricao);
        Cardapio.append(" - R$").append(preco);

        return Cardapio.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cardapio{");
        sb.append("codigo=").append(codigo);
        sb.append(", descricao='").append(descricao).append('\'');
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }
}
