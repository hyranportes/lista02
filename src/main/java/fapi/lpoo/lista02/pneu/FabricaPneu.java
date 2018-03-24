package fapi.lpoo.lista02.pneu;

public class FabricaPneu {

    private String nome;
    private int quantidadeFuncionarios;
    private String cnpj;

    public Pneu fabricarPneu() {
        return new Pneu();
    }

    public Pneu fabricarPneu(int largura) {
        return new Pneu(largura);
    }

    public Pneu fabricarPneu(int largura, String material) {
        return new Pneu(largura, material);
    }

    public Pneu fabricarPneu(int largura, String material, int durabilidade) {
        return new Pneu(largura, material, durabilidade);
    }

    public String getNome(){
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
