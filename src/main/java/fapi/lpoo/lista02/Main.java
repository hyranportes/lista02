package fapi.lpoo.lista02;

import fapi.lpoo.lista02.carro.Carro;
import fapi.lpoo.lista02.carro.FabricaCarro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FabricaCarro fabricaCarro = new FabricaCarro();
        Carro carro = fabricaCarro.fabricarCarro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a autonomia do seu carro: ");
        carro.setAutonomia(scanner.nextFloat());
        System.out.println("Insira a durabilidade dos pneus: ");
        carro.durabilidadePneu(scanner.nextInt());


    }
}
