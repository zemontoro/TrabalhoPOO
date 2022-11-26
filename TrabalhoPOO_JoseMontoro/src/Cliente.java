import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa{
    private Boolean vip;
    private Collection<Endereco> enderecos = new ArrayList<>();



    public void listarEnderecos(){

    }


    public Collection<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Collection<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    /*INICIO METODO*/
    /*PARA ADICIONAR ENDERECOS A CLASSE*/
    public void addEndereco(Endereco endereco){
        this.enderecos.add(endereco);

    }

    public void imprimirEnderecos(){

    }
    /*FIM METODO*/
}
