package carrera;

import java.util.ArrayList;
import java.util.List;

public class Pista {
	List<String> pista1;
	List<String> pista2;
	int caballo1;
	int caballo2;
	int TAMA�O;
	
	Pista (int tama�oPista) {
		this.TAMA�O = tama�oPista;
		caballo1 = 0;
		caballo2 = 0;
		this.pista1 = new ArrayList<String>();
		this.pista2 = new ArrayList<String>();
		llenarPista(tama�oPista);
	}

	private void llenarPista(int tama�oPista) {
		for (int i = 0; i < tama�oPista; i++) {
			this.pista1.add("[0]");
			this.pista2.add("[0]");
		}
	}
	
	public String avanzarCaballo(String caballo1, boolean isCaballo1, String caballo2, boolean isCaballo2) {
		if (isCaballo1) {
			pista1.set(this.caballo1, caballo1);
			this.caballo1 += 1;
		}
		if (isCaballo2) {
			pista2.set(this.caballo2, caballo2);
			this.caballo2 += 1;
		}
		return pintarPista();
	}


	private String pintarPista() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("---------------------------------------------------------------------------------------------------------------------\n");
		buffer.append(pista1.toString() + "\n");
		buffer.append(pista2.toString() + "\n");
		buffer.append("---------------------------------------------------------------------------------------------------------------------");
		return buffer.toString();
	}
	
	public boolean isCaballo1Ganador() {
		if (this.caballo1 == TAMA�O - 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isCaballo2Ganador() {
		if (this.caballo2 == TAMA�O - 1) {
			return true;
		} else {
			return false;
		}
	}
	
}
