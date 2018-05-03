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
    private Roda roda[] = new Roda[4];
    private Porta porta[]= new Porta[4];
    private Tanque tanque;
    private Banco banco[] = new Banco[3];
    private TetoSolar tetoSolar;
    private Bluetooth bluetooth;
    private Pneu stepPneu;
    private Roda stepRoda;
    private float autonomia;

    public void durabilidadePneu(int durabilidade){
        for (int i=0; i<4; i++){
            this.pneu[i].setDurabilidade(durabilidade);
        }
    }

    public void andar (float kmPercorrido){
        tanque.kmLitro(motor.getAutonomia(),kmPercorrido);

    }

    public Carro(Motor motor, Pneu[] pneu, Porta[] porta, Roda[] roda, Tanque tanque, Banco[] banco) {
        this.motor = motor;
        this.pneu = pneu;
        this.porta = porta;
        this.roda = roda;
        this.tanque = tanque;
        this.banco = banco;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Pneu[] getPneu() {
        return pneu;
    }

    public void setPneu(Pneu[] pneu) {
        this.pneu = pneu;
    }

    public Porta[] getPorta() {
        return porta;
    }

    public void setPorta(Porta[] porta) {
        this.porta = porta;
    }

    public Roda[] getRoda() {
        return roda;
    }

    public void setRoda(Roda[] roda) {
        this.roda = roda;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Banco[] getBanco() {
        return banco;
    }

    public void setBanco(Banco[] banco) {
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

    public Pneu getStepPneu() {
        return stepPneu;
    }

    public void setStepPneu(Pneu stepPneu) {
        this.stepPneu = stepPneu;
    }

    public Roda getStepRoda() {
        return stepRoda;
    }

    public void setStepRoda(Roda stepRoda) {
        this.stepRoda = stepRoda;
    }

    public float getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(float autonomia) {
        this.autonomia = autonomia;
    }
}
