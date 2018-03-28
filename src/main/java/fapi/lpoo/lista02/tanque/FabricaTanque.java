package fapi.lpoo.lista02.tanque;

public class FabricaTanque {

    private String nome;
    private int quantidadeFuncionarios;
    private String cnpj;

    public fabricarTanque(float capacidade, String material){
        return new Tanque (capacidade, material);
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
