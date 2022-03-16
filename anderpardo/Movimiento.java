package anderpardo;

import java.util.Random;

public class Movimiento{
    public static boolean ProbabilidadMovimiento(){
        Random rd = new Random();
        return(rd.nextBoolean());
    }
    public static void GestionAvance(){
        if (Movimiento.ProbabilidadMovimiento()){
            Caballo.AvanceCaballo1();//True
        } else {
            Caballo.AvanceCaballo2();//False
        }   
    }
    public static void Victoria() {
        if (Caballo.Caballo2[Caballo.Caballo2.length-1] == 0){
            System.out.println("VICTORIA CABALLO 1");
        } else {
            System.out.println("VICTORIA CABALLO 2");
        }
    }
}