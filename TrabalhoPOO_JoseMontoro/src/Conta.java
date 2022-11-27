public abstract class Conta {
    //INICIO ATRIBUTOS
    private String numero;
    //FIM ATRIBUTOS

    //INICIO METODOS GETTERS E SETTERS

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    //FIM METODOS GETTERS E SETTERS


    //INICIO METODOS

    public Double depositar(){
        return 5.0;
    }
    public Double sacar(){
        return 0.0;
    }
    //FIM METODOS
}
