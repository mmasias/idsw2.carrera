package mmasias;
public class Caballo {

    private int nombre;
    private int posicion;

    public Caballo(int nombreCaballo) {
        this.nombre = nombreCaballo;
        this.posicion = 0;
    }

    public void moverse(Pista pista) {
        int avance;
        avance = (int)(Math.random()*2);
        this.posicion = this.posicion + avance;
        pista.avanzarCaballo(nombre,posicion);
    }

    public void celebraVictoria() {
        System.out.println("Ha ganado el caballo "+this.nombre);
    }

}
