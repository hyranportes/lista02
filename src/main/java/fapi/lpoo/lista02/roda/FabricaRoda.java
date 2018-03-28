package fapi.lpoo.lista02.roda;

public class FabricaRoda {

    private String nome;
    private int quantidadeFuncionarios;
    private String cnpj;

    public Roda fabricarRoda(int aro, String material){
        return new Roda (aro, material);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
