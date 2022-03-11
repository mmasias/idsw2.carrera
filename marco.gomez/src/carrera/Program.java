package carrera;

import java.util.Random;

public class Program {

	public void jugar() {
		Pista pista = new Pista(20);
		Random rand = new Random();
		while (true) {
			System.out.println(pista.avanzarCaballo("[1]", rand.nextInt(100) <= 50 ? true : false , "[2]", rand.nextInt(100) <= 50 ? true : false));
			if (pista.isCaballo1Ganador() && pista.isCaballo2Ganador()) {
				System.out.println("Empate");
				break;
			}  else if (pista.isCaballo1Ganador()){
				System.out.println("Caballo 1 ganador");
				break;
			} else if (pista.isCaballo2Ganador()){
				System.out.println("Caballo 2 ganador");
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Program().jugar();
	}

}
