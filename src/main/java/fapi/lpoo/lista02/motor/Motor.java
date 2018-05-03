package fapi.lpoo.lista02.motor;

public class Motor {

    private double potencia = 2.0;
    private int peso = 300;
    private String material = "titanio";
    private String idMotor = "ABC16E587TH19WX6";
    private float autonomia;


    public Motor(double potencia, int peso, String material, String idMotor, float autonomia) {
        this.potencia = potencia;
        this.peso = peso;
        this.material = material;
        this.idMotor = idMotor;
        this.autonomia = autonomia;
    }

    public float getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(float autonomia) {
        this.autonomia = autonomia;
    }
}
