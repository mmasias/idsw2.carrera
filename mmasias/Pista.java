package mmasias;
import java.util.Scanner;
public class Pista {

    private int[][] casillas;
    private int largo;

    public Pista(int longitudPista) {
        this.largo = longitudPista;
        casillas = new int[2][this.largo];
    }

    public void mostrar() {
		Scanner entrada = new Scanner(System.in);
        for (int i=0;i<casillas.length;i++){
            for (int j=0;j<casillas[i].length;j++){
                System.out.print("["+casillas[i][j]+"]");
            }
            System.out.println();
        }
        for(int j=0;j<=this.largo;j++){
            System.out.print("---");
        }
        System.out.println();
		entrada.nextLine();
    }

    public boolean hayGanador() {
        return this.hayGanador(1) || this.hayGanador(2);
    }

    private boolean hayGanador(int caballo){
        if (casillas[caballo-1][largo-1]==caballo){
            return true;
        }
        return false;
    }

    public void avanzarCaballo(int nombre, int posicion) {
        this.casillas[nombre-1][posicion]=nombre;
    }

}
