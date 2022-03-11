
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Mapa mapa = new Mapa(18);

        Caballo caballo1 = new Caballo(1);
        Caballo caballo2 = new Caballo(2);

        mapa.setHuecoParaCaballo1(caballo1.getNumeroCaballo());
        mapa.makeMap();
        mapa.setHuecoParaCaballo2(caballo2.getNumeroCaballo());
        mapa.makeMap();

    }
}
