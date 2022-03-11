package mmasias;
public class Turno {

    private int elTurno;

    public Turno(){
        elTurno = (int)(Math.random()+.5);
    }

    public int toca() {
        return elTurno;
    }

    public int noToca() {
        return (elTurno+1)%2;
    }

    public void cambiar() {
        elTurno = this.noToca();
    }

}
