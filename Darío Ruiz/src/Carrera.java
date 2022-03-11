import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Carrera {
    public static void main(String[] args) throws Exception {
        Mapa mapa = inicializarMapa();

        while(mapa.carreraNoTerminada()) {
            mapa.imprimirPistas();
            Scanner scan = new Scanner(System.in);
            scan.nextLine();
            mapa.advance();
        } 
        mapa.imprimirPistas();
        System.out.println(mapa.getGanador());
    }

    public static Mapa inicializarMapa() {
        List<String> pista1 = new ArrayList<String>();
        List<String> pista2 = new ArrayList<String>();
        IntStream.range(0, 10).forEach(el -> {
            pista1.add("[0]");
            pista2.add("[0]");
        });

        Caballo caballo1 = new Caballo("[1]", -1);
        Caballo caballo2 = new Caballo("[2]", -1);

        return new Mapa(pista1, pista2, caballo1, caballo2);
    }
}
