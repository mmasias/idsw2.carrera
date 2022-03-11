package carrera;

public class Carrera {

	private Pista pista;
	private static final int NumCasillas = 20;
	private static final int NumCaballos = 5;
	
	private Carrera(int numCasillas, int numeroCaballos) {
		this.pista = new Pista(numCasillas, numeroCaballos);
	}
	
	private void jugar() {
		do {
			System.out.println(this.pista.mostrarPista());
		} while (!this.pista.siguienteTurno());
	}
	
	private void ganador() {
		System.out.println(this.pista.mostrarPista());
		System.out.println(pista.ganador());
	}
	
	public static void main(String[] args) {
		Carrera carrera = new Carrera(NumCasillas, NumCaballos);
		carrera.jugar();
		carrera.ganador();
	}

}
