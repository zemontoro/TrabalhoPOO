import java.util.ArrayList;
import java.util.Collection;

public abstract class Conta {
    //INICIO ATRIBUTOS
    private String numero;

    private Collection<Credito> listaCredito = new ArrayList<>();
    private Collection<Debito> listaDebito = new ArrayList<>();
    //FIM ATRIBUTOS

    //INICIO METODOS CONSTRUTOR

    public Conta(String numero){
        this.numero=numero;
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


    //INICIO METODOS DEPOSITAR
    public void depositar(Double valor){
       Credito CR1 = new Credito(this);
       CR1.setValor(valor);
       this.addCreditos(CR1);

    }
    //INICIO METODOS SACAR
    public void sacar(Double valor){
        Debito debito = new Debito();
        debito.setValor(valor);
        this.addDebitos(valor);
    }
    //FIM METODOS
}
