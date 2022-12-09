import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ContaCorrente extends Conta{


    public ContaCorrente(String numero) {
        super(numero);
    }

    //INICIO ATRIBUTOS
    private Double limite;

    private Collection<Integer> depositos = new ArrayList<>();
    //FIM ATRIBUTOS

    //INICIO METODOS GETTERS E SETTERS
    public Double getLimite() {
        return limite;
    }
    public void setLimite(Double limite) {
        this.limite = limite;
    }
    //FIM METODOS GETTERS E SETTERS

    //INICIO METODOS
    public void transferir(Conta contaDestino, Double valor){
    }
    public Double calcularSaldo(){
        return 0.0;
    }

    //FIM METODOS S
}
