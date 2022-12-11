public class Debito extends Conta{
    //INICIO ATRIBUTOS
    private Double valor;
    private Conta conta;
    //FIM METODO GETTER E SETTER
    //--------------------------------------
    //INICIO METODO CONSTRUTOR
    public Debito(Conta conta){
        this.conta=conta;
    }
    //FIM METODO CONSTRUTOR
    //--------------------------------------
    //INICIO METODO GETTER E SETTER
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    //FIM METODO GETTER E SETTER


}
