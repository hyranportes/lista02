package fapi.lpoo.lista02.pneu;

public class Pneu {

    private int largura = 30;
    private String material = "Borracha";
    private int durabilidade = 15000;

    public Pneu() {

    }

    public Pneu(int largura) {
        this.largura = largura;
    }

    public Pneu(int largura, String material) {
        this.largura = largura;
        this.material = material;
    }

    public Pneu(int largura, String material, int durabilidade) {
        this.largura = largura;
        this.material = material;
        this.durabilidade = durabilidade;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }
}
