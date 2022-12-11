public class Credito extends Conta{
    //-----------------------------------------------
    //ATRIBUTOS
    private Double valor;
    private Conta conta;
    //ATRIBUTOS
    //-----------------------------------------------
    //METODO CONSTRUTOR
    public Credito (Conta conta){
        this.conta=conta;

    }
    //METODO CONSTRUTOR
    //-----------------------------------------------
    //INICIO METODOS GETTERS E SETTERS

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }

    //FIM METODOS GETTERS E SETTERS
    //-----------------------------------------------



}
