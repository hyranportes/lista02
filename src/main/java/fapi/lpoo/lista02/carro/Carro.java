package fapi.lpoo.lista02.carro;

import fapi.lpoo.lista02.banco.Banco;
import fapi.lpoo.lista02.motor.Motor;
import fapi.lpoo.lista02.opcionais.Bluetooth;
import fapi.lpoo.lista02.opcionais.TetoSolar;
import fapi.lpoo.lista02.pneu.Pneu;
import fapi.lpoo.lista02.porta.Porta;
import fapi.lpoo.lista02.roda.Roda;
import fapi.lpoo.lista02.tanque.Tanque;

public class Carro {

    private Motor motor;
    private Pneu pneu[] = new Pneu[4];
    private Porta porta;
    private Roda roda;
    private Tanque tanque;
    private Banco banco[] = new Banco[3];
    private TetoSolar tetoSolar;
    private Bluetooth bluetooth;
    private Pneu step;

    public Carro(Motor motor, Pneu[] pneu, Porta porta, Roda roda, Tanque tanque, Banco[] banco) {
        this.motor = motor;
        this.pneu = pneu;
        this.porta = porta;
        this.roda = roda;
        this.tanque = tanque;
        this.banco = banco;
    }

    public TetoSolar getTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(TetoSolar tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public Bluetooth getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Bluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }

    public Pneu getStep() {
        return step;
    }

    public void setStep(Pneu step) {
        this.step = step;
    }

}
