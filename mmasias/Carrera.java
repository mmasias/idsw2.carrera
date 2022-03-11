package mmasias;
class Carrera{

    private Pista pista;
    private Caballo[] caballos;
    private Turno turno;

    public Carrera() {
        pista = new Pista(20);
        caballos = new Caballo[2];
        caballos[0] = new Caballo(1);
        caballos[1] = new Caballo(2);
        turno = new Turno();        
    }

    public void jugar() {
        do {
            pista.mostrar();
            caballos[turno.toca()].moverse(pista);
            turno.cambiar();
        } while (!pista.hayGanador());
        caballos[turno.noToca()].celebraVictoria();        
    }

    public static void main(String[] args){
        new Carrera().jugar();
    }

}