package fapi.lpoo.lista02.porta;

public class FabricaPorta {

    private String nome;
    private int quantidadeFuncionario;
    private String cnpj;

    public fabricarPorta(float tamanho, String cor, String modelo, String material){
        return new Porta (tamanho, cor, modelo, material)
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionario() {
        return quantidadeFuncionario;
    }

    public void setQuantidadeFuncionario(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
