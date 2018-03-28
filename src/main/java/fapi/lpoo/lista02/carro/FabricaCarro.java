package fapi.lpoo.lista02.carro;

import fapi.lpoo.lista02.motor.FabricaMotor;
import fapi.lpoo.lista02.motor.Motor;
import fapi.lpoo.lista02.pneu.FabricaPneu;
import fapi.lpoo.lista02.pneu.Pneu;

public class FabricaCarro {
    public Carro fabricarCarro(){
        FabricaMotor fabricaMotor = new FabricaMotor();
        Motor motor = fabricaMotor.fabricarMotor(100,100,"Ferro","1");

        FabricaPneu fabricaPneu = new FabricaPneu();
        Pneu pneu[] = new pneu[4];

        pneu[0] = fabricaPneu.fabricarPneu();
        pneu[1] = fabricaPneu.fabricarPneu();
        pneu[2] = fabricaPneu.fabricarPneu();
        pneu[3] = fabricaPneu.fabricarPneu();

        return new Carro(motor,pneu,porta,roda,tanque);
    }
}
