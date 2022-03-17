package anderpardo;

import java.util.ArrayList;

public class Caballo<T> extends ArrayList<T> {
    
    int posicion;
	T DorsalCaballo;
	T ZonaLibre;
	static int Casillas;
	static int Caballos;
	
	public Caballo(int HuecosPista, T DorsalCaballo, T HuecoAvance) {
		this.posicion = 0;
		this.DorsalCaballo = DorsalCaballo;
		this.ZonaLibre = HuecoAvance;
		this.InvocarPista(HuecosPista);
	}

    public Caballo(int numCasillas, int numeroCaballos) {
		Movimiento terreno = new Movimiento(numCasillas, numeroCaballos);
	}
	
	public void InvocarPista(int LongitudPista) {
		for (int i = 0; i < LongitudPista; i++) add(ZonaLibre);
	}

	public void avanzar() {
		this.set(posicion,DorsalCaballo);
		GestionAvance();
	}
	
	public boolean AlcanzarMeta() {
		if (posicion == size()) return true;
		else return false;
	}
	
	public String MensajeVictoria() {
		return "HA GANADO EL CABALLO Nº" + DorsalCaballo;
	}
	
	public void GestionAvance() {
		posicion += 1;
	}
	
    public static void Victoria() {
		System.out.println(Movimiento.ImprimirTerreno());
		System.out.println(Movimiento.CaballoVencedor());
	}
    
}