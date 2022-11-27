public class Executavel {
    public static void main(String[] args) {


        //APLICAÇÃO 2 :
        //CRIANDO OBJETO CLIENTE C1 E ATRIBUINDO
        Cliente c1 = new Cliente();
        c1.setNome("Fernando");
        c1.setCpf("497-459-514-54");
        c1.setVip(true);
        //--------------------------
        //CRIANDO OBJETO ENDERECO E1 E ATRIBUINDO AO CLIENTE1
        Endereco e1 = new Endereco();
        e1.setNumero("230");
        e1.setLogradouro("Rua Chui");
        e1.setComplemento("Aramacan");
        e1.setUf("SP");
        e1.setCep("09110-440");
        e1.setCidade("Santo Andre");
        c1.addEndereco(e1);
        //---------------------------
        //CRIANDO OBJETO ENDERECO E2 E ATRIBUINDO AO CLIENTE1
        Endereco e2 = new Endereco();
        e2.setNumero("1260");
        e2.setLogradouro("Av. Assaxe");
        e2.setComplemento("Poei");
        e2.setUf("RJ");
        e2.setCep("0579-220");
        e2.setCidade("Santereza");
        c1.addEndereco(e2);
        //---------------------------
        //CRIANDO OBJETO ENDERECO E3 E ATRIBUINDO AO CLIENTE1
        Endereco e3 = new Endereco();
        e3.setNumero("4978");
        e3.setLogradouro("Av. Guaxupe");
        e3.setComplemento("Em frente ao Mercado");
        e3.setUf("ES");
        e3.setCep("0478-996");
        e3.setCidade("Floripa");
        c1.addEndereco(e3);
        //---------------------------
        //Imprimindo os Enderecos
        System.out.println(c1.imprimirEnderecos());


    }
}
