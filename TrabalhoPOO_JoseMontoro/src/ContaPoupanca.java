public class ContaPoupanca extends Conta{

//    public ContaPoupanca(String numero, Double rentabilidadeMensal) {
//        super(numero);
//        this.rentabilidadeMensal = rentabilidadeMensal;
//    }



    //INICIO ATRIBUTOS
    private Double rentabilidadeMensal;
    //FIM ATRIBUTOS

    //INICIO METODOS GETTERS E SETTERS
    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }
    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    //FIM METODOS GETTERS E SETTERS

    //INICIO METODOS
    public void calcularSaldo(){
        Double total=0.0, auxC = 0.0, auxD = 0.0;
        for (Credito credito: getListaCredito()){
            auxC+=credito.getValor();
        }
        for(Debito debito: getListaDebito()){
            auxD+=debito.getValor();
        }
        total=(auxC-auxD);
        //System.out.println("Soma de Creditos: "+auxC);
        //System.out.println("Soma de Debitos: "+auxD);
        System.out.println("SALDO da Conta Poupanca:" +total);
    }
    //FIM METODOS
}
