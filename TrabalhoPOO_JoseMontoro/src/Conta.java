import java.util.ArrayList;
import java.util.Collection;

public abstract class Conta {
    //INICIO ATRIBUTOS
    private String numero;
    private Double saldoo;

    private Collection<Credito> listaCredito = new ArrayList<>();
    private Collection<Debito> listaDebito = new ArrayList<>();
    //FIM ATRIBUTOS

    //INICIO METODOS CONSTRUTOR

    public Conta(String numero){
        this.numero=numero;
    }

    //Java sugeriu o no-args para eliminar erro, tirar duvida com o professor depois ...
    protected Conta() {
    }

    //FIM METODOS CONSTRUTOR
    //--------------------------------------------------------
    //LISTA PARA ADICIONAR CREDITO E DEBITOS
    public void addCreditos(Credito credito){
        this.listaCredito.add(credito);
    }
    public void addDebitos(Debito debito){
        this.listaDebito.add(debito);
    }
    //--------------------------------------------------------

    //INICIO METODOS GETTERS E SETTERS
    public Collection<Credito> getListaCredito() {
        return listaCredito;
    }

    public void setListaCredito(Collection<Credito> listaCredito) {
        this.listaCredito = listaCredito;
    }

    public Collection<Debito> getListaDebito() {
        return listaDebito;
    }

    public void setListaDebito(Collection<Debito> listaDebito) {
        this.listaDebito = listaDebito;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    //FIM METODOS GETTERS E SETTERS


    //INICIO METODOS DEPOSITAR, SACAR E CALCULAR SALDO
    public void depositar(Double valorDeposito){
       Credito CR1 = new Credito(this);
       CR1.setValor(valorDeposito);
       this.addCreditos(CR1);

    }
    public void sacar(Double valorSaque){
        //if (valorSaque>){
            //Fazer a validacao do ValorDoSaque
        //}
        Debito DE1 = new Debito(this);
        DE1.setValor(valorSaque);
        this.addDebitos(DE1);
    }

    //FIM METODOS DEPOSITAR, SACAR E CALCULAR SALDO
}
