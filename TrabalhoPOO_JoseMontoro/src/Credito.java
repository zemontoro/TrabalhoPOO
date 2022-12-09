public class Credito extends Conta{
    public Double valor;
    public String conta;

    public Credito(String conta) {
        super(conta);
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
