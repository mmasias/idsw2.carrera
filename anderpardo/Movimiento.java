package anderpardo;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Movimiento{
    static List<Caballo<String>> Juego;
	static int CantidadCaballos;
	static int LongitudPista;
	
	public Movimiento (int tamañoPista, int numeroCaballos) {
		LongitudPista = tamañoPista;
		CantidadCaballos = numeroCaballos;
		Juego = new ArrayList<Caballo<String>>();
		for (int i = 0; i < CantidadCaballos; i++)GenerarCaballo(this.ImprimirCaballo(i + 1));
	}

	static void GenerarCaballo(String numeroCaballo) {
		Caballo<String> caballo = new Caballo<String>(LongitudPista, numeroCaballo, "[ ]");
		Juego.add(caballo);
	}

	private String ImprimirCaballo(int DorsalCaballo) {
		return "|"+Integer.toString(DorsalCaballo)+"|";
	}
	
	public static boolean ControlTurnos() {
		int numCaballosGanadores = 0;
		Random aleatorio = new Random();
		for (Caballo<String> caballo : Juego) {
			if (aleatorio.nextInt(2) == 1) caballo.avanzar(); 
			if(caballo.AlcanzarMeta()) numCaballosGanadores++;
		}
		if (numCaballosGanadores > 0) return true;
		else return false;
	}
	
	public static String ImprimirTerreno() {
		//StringBuffer String que puede ser modificado
		StringBuffer buffer = new StringBuffer();
		System.out.println("=======================================================================================================================");
        for (Caballo<String> caballo : Juego) buffer.append(caballo.toString() + "\n");
		System.out.println("=======================================================================================================================");
        return buffer.toString();
	}	
	
	public static String CaballoVencedor() {
		//StringBuffer String que puede ser modificado
		StringBuffer buffer = new StringBuffer();
		for (Caballo<String> caballo : Juego) {
			if (caballo.AlcanzarMeta()) {
				buffer.append(caballo.MensajeVictoria() + "\n");
			}
		}
		return buffer.toString();
	}
}