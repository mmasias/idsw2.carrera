import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PistaCaballo pista1 = new PistaCaballo(1);
		PistaCaballo pista2 = new PistaCaballo(2);
		
		
		do {
			
			pista1.print();
			pista2.print();
			System.out.println("--------------------------------------");
			

			String aux = sc.nextLine();
			
			if(pista1.getPosicionCaballo() < 19 && pista2.getPosicionCaballo() < 19) {
				pista1.avanzar();
				pista2.avanzar();
			}
			
		}while(pista1.getPosicionCaballo() < 19 && pista2.getPosicionCaballo() < 19);
		
		
		

	}
	
	
	
	

}
