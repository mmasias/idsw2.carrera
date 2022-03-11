import java.util.List;

public class Mapa {
    private List<String> primeraPista;
    private List<String> segundaPista;
    private Caballo primerCaballo;
    private Caballo segundoCaballo;

    public Mapa(List<String> primeraPista, List<String> segundaPista, Caballo primerCaballo, Caballo segundoCaballo) {
        this.primeraPista = primeraPista;
        this.segundaPista = segundaPista;
        this.primerCaballo = primerCaballo;
        this.segundoCaballo = segundoCaballo;
    }

    public void imprimirPistas() {
        this.printPista(this.primeraPista);
        System.out.println();
        this.printPista(this.segundaPista);
        System.out.println();
        System.out.println("--------------------------------------------");
    }

    public void printPista(List<String> pista) {
        pista.forEach(el -> System.out.print(el));
    }

    public void advance() {
        if(this.primerCaballo.tryAdvance()) 
            primeraPista.set(this.primerCaballo.getPosition(), this.primerCaballo.getAvatar());
        if(this.segundoCaballo.tryAdvance()) 
            segundaPista.set(this.segundoCaballo.getPosition(), this.segundoCaballo.getAvatar());
    }

    public boolean carreraNoTerminada() {
        return this.primerCaballo.getPosition() < this.primeraPista.size() - 1 && this.segundoCaballo.getPosition() < this.segundaPista.size() - 1;
    }

    public String getGanador() {
        if (this.primerCaballo.getPosition() == this.primeraPista.size() - 1 && this.segundoCaballo.getPosition() == this.segundaPista.size() - 1) 
            return "Hubo un empate entre ambos caballos!";
        else if (this.primerCaballo.getPosition() == this.primeraPista.size()) 
            return "Ganó el caballo número 1!";
        else
            return "Ganó el caballo número 2!";
    }
}