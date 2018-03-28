package fapi.lpoo.lista02.carro;

import fapi.lpoo.lista02.motor.Motor;
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

    public Carro(Motor motor, Pneu[] pneu, Porta porta, Roda roda, Tanque tanque) {
        this.motor = motor;
        this.pneu = pneu;
        this.porta = porta;
        this.roda = roda;
        this.tanque = tanque;
    }
}
