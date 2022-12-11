import java.util.ArrayList;
import java.util.Collection;


public class ContaCorrente extends Conta{

//    public ContaCorrente(String numero) {
//        super(numero);
//    }

    //INICIO ATRIBUTOS
    private Double limite;
    private Collection<Integer> depositos = new ArrayList<>();

    //FIM ATRIBUTOS
    //--------------------------------------------------------
    //INICIO METODOS GETTERS E SETTERS
    public Double getLimite() {
        return limite;
    }
    public void setLimite(Double limite) {
        this.limite = limite;
    }
    //FIM METODOS GETTERS E SETTERS
    //--------------------------------------------------------
    //INICIO METODOS
    public void transferir(Conta contaDestino, Double valor){
        //ADICIONA CREDITO A CONTA DESTINADA
        Credito creditoTransferencia = new Credito(contaDestino);
        creditoTransferencia.setValor(valor);
        contaDestino.addCreditos(creditoTransferencia);
        //ADICIONA DEBITO NA CONTA DE ORIGEM
        Debito debitoTransferencia = new Debito(this);
        debitoTransferencia.setValor(valor);
        this.addDebitos(debitoTransferencia);
    }
    public void calcularSaldo(){
        Double total=0.0, auxC = 0.0, auxD = 0.0;
        for (Credito credito: getListaCredito()){
            auxC+=credito.getValor();
        }
        for(Debito debito: getListaDebito()){
            auxD+=debito.getValor();
        }
        total=(auxC-auxD)+limite;
//        System.out.println("Soma de Creditos: "+auxC);
//        System.out.println("Soma de Debitos: "+auxD);
        System.out.println("Saldo da Conta Corrente + LIMITE:" +total);
    }
    //FIM METODOS
}
