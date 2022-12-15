import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa implements IUsuario{
    private Boolean vip;
    //LISTA PARA ENDERECOS
    private Collection<Endereco> enderecos = new ArrayList<>();
    //LISTA PARA CONTAS
    private Collection<Conta> contas = new ArrayList<>();
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
    /*PARA ADICIONAR ENDERECOS A CLIENTE*/
    public void addEndereco(Endereco endereco){
        this.enderecos.add(endereco);
    }
    public void addContaCorrente (ContaCorrente contaCorrente){this.contas.add(contaCorrente);}

    public boolean imprimirEnderecos(){
        for (Endereco e: getEnderecos()){
            System.out.println("Logradouro: "+e.getLogradouro() + ", Numero: " +e.getNumero() + ", Cidade: "+e.getCidade()+", UF: "+e.getUf() + ", Complemento: "+e.getComplemento());
        }
        return false;
    }
    /*PARA ADICIONAR CONTAS A CLIENTE*/
    public void addConta(Conta conta){
        this.contas.add(conta);
    }
    /*FIM METODO*/

    /*CRIANDO A AUTENTICAÇÃO DO USUÁRIO*/
    private String senha;
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //felipe fez
    public Boolean autenticar(String nome, String senha) {
        if (this.getNome() == nome) {
            if (this.getSenha() == senha) {
                return true;
            }else {
                System.out.println("[+] Password incorrect");
            }return false;
        }System.out.println("[+] Username incorrect");
        {return true;}
    }


}
