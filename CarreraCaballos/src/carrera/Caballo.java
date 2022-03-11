package carrera;

import java.util.ArrayList;

public class Caballo<T> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;
	
	private int posicion;
	private T numCaballo;
	private T casillaVacia;
	
	public Caballo(int numCasillas, T numCaballo, T casillaVacia) {
		super();
		this.posicion = 0;
		this.numCaballo = numCaballo;
		this.casillaVacia = casillaVacia;
		this.llenarCasillas(numCasillas);
	}
	
	private void llenarCasillas(int numCasillas) {
		for (int i = 0; i < numCasillas; i++) this.add(this.casillaVacia);
	}

	public void avanzar() {
		this.set(this.posicion, this.numCaballo);
		this.casillaSiguiente();
	}
	
	public boolean ganador() {
		if (this.posicion == this.size()) return true;
		else return false;
	}
	
	public String caballoToString() {
		return "El caballo " + numCaballo + " ganador";
	}
	
	private void casillaSiguiente() {
		this.posicion += 1;
	}
}
