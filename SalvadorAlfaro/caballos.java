import java.util.Arrays;

public class caballos {

    public static int caballo1[] = new int[10]; 
    public static int caballo2[] = new int[10];
    static int acum1 = 0;
    static int acum2 = 0;

    public static void sumaCaballo1(){
        caballo1[acum1] = 1;
        acum1 = acum1+ 1;
    }

    public static void sumaCaballo2(){
        caballo2[acum2] = 2;
        acum2 = acum2+ 1;
    }

    public static void printCaballos() {
        System.out.println(Arrays.toString(caballo1));
        System.out.println(Arrays.toString(caballo2));
    }

    public static void caballoGanador() {
        if (caballo2[9] == 0){
            System.out.println("Ganó el caballo 1");
        } else {
            System.out.println("Ganó el caballo 2");
        }
    }
    
}
