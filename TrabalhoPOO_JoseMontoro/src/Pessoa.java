
//CLASSE ABSTRATA
public abstract class Pessoa {
    //INICIO ATRIBUTOS
    private String cpf;
    private String nome;
    private String telefone;
    //FIM ATRIBUTOS

    //INICIO METODOS GETTERS E SETTERS
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //FIM METODOS GETTERS E SETTERS
}
