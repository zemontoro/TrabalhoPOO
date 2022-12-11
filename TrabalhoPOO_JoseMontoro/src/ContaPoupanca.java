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
    public Double calcularSaldo(){
        return 0.0;
    }
    //FIM METODOS
}
