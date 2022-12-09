public class Debito extends Conta{
    private Double valor;

    public Debito(String numero, Double valor) {
        super(numero);
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


}
