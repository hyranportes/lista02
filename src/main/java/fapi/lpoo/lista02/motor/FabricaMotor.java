package fapi.lpoo.lista02.motor;

public class FabricaMotor {

    private String nome;
    private int quantidadeFuncionarios;
    private String cnpj;

    public Motor fabricarMotor(float potencia, int peso, String material, String idMotor){
        return new Motor (potencia, peso, material, idMotor);
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
