import java.util.Arrays;

public class Caballo {
    static int Caballo1[] = new int[20]; 
    static int Pos1 = 0;
    static int Caballo2[] = new int[20];
    static int Pos2 = 0;

    public static void AvanceCaballo1(){
        Caballo1[Pos1] = 1;//Dorsal
        Pos1 = Pos1+ 1;//Avance
    }
    public static void AvanceCaballo2(){
        Caballo2[Pos2] = 2;//Dorsal
        Pos2 = Pos2+ 1;//Avance
    }

    public static void Posicion1() {
        System.out.println(Arrays.toString(Caballo1));   
    }   
    public static void Posicion2() {
        System.out.println(Arrays.toString(Caballo2));     
    }   
    
}
