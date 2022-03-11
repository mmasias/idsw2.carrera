public class Mapa {

    private int huecoParaCaballo1 = 0;
    private int huecoParaCaballo2 = 0;
    private int posiciones;

    public Mapa(int posiciones) {
        this.posiciones = posiciones;
        this.makeMap();
    }

    public void setHuecoParaCaballo1(int huecoParaCaballo1) {
        this.huecoParaCaballo1 = huecoParaCaballo1;
    }

    public void setHuecoParaCaballo2(int huecoParaCaballo2) {
        this.huecoParaCaballo2 = huecoParaCaballo2;
    }

    public void makeMap() {
        System.out.println("-------------------------------------------------------------------------");

        for (int i = 0; i < posiciones; i++) {
            System.out.print("[" + huecoParaCaballo1 + "]");
        }
        System.out.println();

        for (int i = 0; i < posiciones; i++) {
            System.out.print("[" + huecoParaCaballo2 + "]");
        }

        System.out.println();

        System.out.println("-------------------------------------------------------------------------");
    }

}
