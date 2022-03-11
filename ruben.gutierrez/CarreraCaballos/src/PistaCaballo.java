

public class PistaCaballo {
	
	
	private String [] casillas;
	private int posicionCaballo;
	private int numeroCaballo;
	
	public PistaCaballo(int numeroCaballo) {
		this.casillas = new String[20];
		this.posicionCaballo = 0;
		this.numeroCaballo = numeroCaballo;
		
		for(int i=0 ; i<20 ; i++) {
			casillas[i] = "[0]";
		}
		
		casillas[posicionCaballo] = "["+ numeroCaballo +"]";
		
	}
	
	
	
	
	public String[] getCasillas() {
		return casillas;
	}


	public void setCasillas(String[] casillas) {
		this.casillas = casillas;
	}




	public int getPosicionCaballo() {
		return posicionCaballo;
	}




	public void setPosicionCaballo(int posicionCaballo) {
		this.posicionCaballo = posicionCaballo;
	}


	public void avanzar() {
		Double numeroRandom = Math.random()*100;
		
		if(numeroRandom > 50 ) {
			posicionCaballo +=1;
			casillas[posicionCaballo] = "["+ numeroCaballo +"]";
		}
		
		if(posicionCaballo == 18) {
			System.out.println("Ha ganado el caballo : " + numeroCaballo);
		}
		
		
	}

	public void print() {
		for(String actual : this.casillas) {
			System.out.print(actual);
		}
		System.out.println();
		
	}

}
