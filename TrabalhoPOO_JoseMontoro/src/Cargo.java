import java.util.ArrayList;
import java.util.Collection;

public class Cargo {

    //INICIO ATRIBUTOS
    private String nome;
    //VERIFICAR SE DEVE TER UMA COLLECTION NA CLASSE CARGO (DIAGRAMA DE CLASSE TÁ 0.*)
    private Collection<Funcionario> funcionarios = new ArrayList<>();

    //FIM ATRIBUTOS

    //INICIO METODOS GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Collection<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    //FIM METODOS GETTERS E SETTERS
}
