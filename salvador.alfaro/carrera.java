public class carrera {
    public static void main(String[] args) {

        System.out.println("Inicia la carrera de caballos");
            while (caballos.caballo1[9] == 0 && caballos.caballo2[9] == 0){
            if (randomNum() <= 50){
                caballos.sumaCaballo1();
            } else {
                caballos.sumaCaballo2();
            }
    
            caballos.printCaballos();
            System.out.println("------------------");
        }
        caballos.caballoGanador();
        System.out.println("Fin de la carrera de caballos");
    }

    public static int randomNum() {
        return (int) (Math.random() * (100 - 1)) + 1;
    }


}
