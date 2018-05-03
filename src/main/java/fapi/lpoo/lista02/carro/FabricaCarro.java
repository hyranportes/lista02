package fapi.lpoo.lista02.carro;

import fapi.lpoo.lista02.banco.Banco;
import fapi.lpoo.lista02.banco.FabricaBanco;
import fapi.lpoo.lista02.motor.FabricaMotor;
import fapi.lpoo.lista02.motor.Motor;
import fapi.lpoo.lista02.pneu.FabricaPneu;
import fapi.lpoo.lista02.pneu.Pneu;
import fapi.lpoo.lista02.porta.FabricaPorta;
import fapi.lpoo.lista02.porta.Porta;
import fapi.lpoo.lista02.roda.FabricaRoda;
import fapi.lpoo.lista02.roda.Roda;
import fapi.lpoo.lista02.tanque.FabricaTanque;
import fapi.lpoo.lista02.tanque.Tanque;

public class FabricaCarro {

    public Carro fabricarCarro(){
        FabricaMotor fabricaMotor = new FabricaMotor();
        Motor motor = fabricaMotor.fabricarMotor(100,100,"Ferro","1", 13);

        FabricaPneu fabricaPneu = new FabricaPneu();
        Pneu pneu[] = new Pneu[4];

        pneu[0] = fabricaPneu.fabricarPneu();
        pneu[1] = fabricaPneu.fabricarPneu();
        pneu[2] = fabricaPneu.fabricarPneu();
        pneu[3] = fabricaPneu.fabricarPneu();

        FabricaRoda fabricaRoda = new FabricaRoda();
        Roda roda[] = new Roda[4];

        roda[0] = fabricaRoda.fabricarRoda(17,"Aluminio");
        roda[1] = fabricaRoda.fabricarRoda(17,"Aluminio");
        roda[2] = fabricaRoda.fabricarRoda(17,"Aluminio");
        roda[3] = fabricaRoda.fabricarRoda(17,"Aluminio");

        FabricaPorta fabricaPorta = new FabricaPorta();
        Porta porta[] = new Porta[4];

        porta[0] = fabricaPorta.fabricarPorta(2,"Azul Royal", "Motorista", "Aluminio");
        porta[1] = fabricaPorta.fabricarPorta(2,"Azul Royal", "Carona", "Aluminio");
        porta[2] = fabricaPorta.fabricarPorta(1,"Azul Royal", "PassageiroDireito", "Aluminio");
        porta[3] = fabricaPorta.fabricarPorta(1,"Azul Royal", "PassageiroEsquerdo", "Aluminio");

        FabricaTanque fabricaTanque = new FabricaTanque();
        Tanque tanque = fabricaTanque.fabricarTanque(65,"Adamantium");

        FabricaBanco fabricaBanco = new FabricaBanco();
        Banco banco[] = new Banco[3];

        banco[0] = fabricaBanco.fabricarBanco("Motorista");
        banco[1] = fabricaBanco.fabricarBanco("Carona");
        banco[2] = fabricaBanco.fabricarBanco("Passageiros");

        return new Carro(motor, pneu, porta, roda, tanque, banco);
    }
}
