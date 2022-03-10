public class Carrera {
    public static void main(String[]args){

            System.out.println("==CARRERA DE CABALLOS===");
            do{
                Movimiento.GestionAvance();
                Caballo.Posicion1();
                Caballo.Posicion2();
                System.out.println("-------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------");

            } while (Caballo.Caballo1[Caballo.Caballo1.length-1] == 0 && Caballo.Caballo2[Caballo.Caballo2.length-1] == 0);
            
        System.out.println("FINAL DE LA CARRERA");
        Movimiento.Victoria();
        
    }
}
