public class Executavel {
    public static void main(String[] args) {

        Cliente c2 = new Cliente();

        //CRIANDO OBJETO CLIENTE C1 E ATRIBUINDO
        Cliente c1 = new Cliente();
        c1.setNome("Fernando");
        c1.setCpf("497-459-514-54");
        c1.setVip(true);
        //--------------------------
        //CRIANDO OBJETO ENDERECO E1 E ATRIBUINDO
        Endereco e1 = new Endereco();
        e1.setNumero("230");
        e1.setLogradouro("Rua Chui");
        e1.setComplemento("Aramacan");
        e1.setUf("SP");
        e1.setCep("09110-440");
        e1.setCidade("Santo Andre");
        c1.addEndereco(e1);
        //---------------------------

        System.out.println(c1.getEnderecos());

    }
}
