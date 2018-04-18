package fapi.lpoo.lista02.banco;

public class FabricaBanco {
    private String nome;
    private int quantidadeFuncionarios;
    private String cnpj;


    public Banco fabricarBanco(String tipo){
        return new Banco(tipo);
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
