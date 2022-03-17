package anderpardo;

import java.util.Scanner;

public class Carrera {
	public static void main(String[] args) {

        System.out.println("==Elige tu configuracion==");
        System.out.println("Introduce el numero de caballos participantes");
        Scanner sc = new Scanner(System.in);
        int Caballos = sc.nextInt();
        System.out.println("Introduce la longitud de la pista");
        Scanner sc2 = new Scanner(System.in);
        int LongitudTerreno = sc2.nextInt();

        System.out.println("==CARRERA DE CABALLOS===");
		Caballo caballo = new Caballo(LongitudTerreno,Caballos);
        do {
			System.out.println(Movimiento.ImprimirTerreno());
		} while (!Movimiento.ControlTurnos());
        Caballo.Victoria();
	}
}