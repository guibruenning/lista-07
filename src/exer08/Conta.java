package exer08;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;

    // Construtor
    public Conta(int numero, double saldo, String nome) {
        setNumero(numero);
        setSaldo(saldo);
        setNome(nome);
    }

    public Conta() {
    }

    //metodos

    public void incluirConta(int numero, double saldo, String nome) {
       setNumero(numero);
       setSaldo(saldo);
       setNome(nome);
    }

    public void alterarNome(String nome) {
        setNome(nome);
    }

    public void sacar(double valor){
        if (valor <= this.saldo){
            setSaldo(getSaldo() - valor);
        }
    }

    public void depositar(double valor){
        setSaldo(getSaldo()+ valor);
    }


    //getter e Setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0)
            this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0)
            this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0)
            this.nome = nome;
    }

    public String mostrarDados(){
        StringBuilder dados = new StringBuilder();
        dados.append("Nome: " + getNome());
        dados.append("Saldo: " + getSaldo());

        return dados.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conta{");
        sb.append("numero=").append(numero);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
}
