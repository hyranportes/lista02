package fapi.lpoo.lista02.tanque;

public class Tanque {

    private float capacidade;
    private String material;
    private float volume;

    public Tanque(float capacidade, String material) {
        this.capacidade = capacidade;
        this.material = material;
        this.volume = this.capacidade;
    }

    public void kmLitro(float autonomia, float kmPercorrido){
        float aux = kmPercorrido/autonomia;
        volume = volume - aux;
    }

    public float getVolume() {
        return volume;
    }
}
