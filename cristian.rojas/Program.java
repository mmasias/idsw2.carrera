public class Program {
    public static void main(String[] args){
        Race race = new Race(15);
        pushCaballos(race, 5);
        race.startRace();
    }
    // solo para facilitar las cosas
    public static void pushCaballos(Race race, int number){
        for(int i = 0; i < number; i++){
            Caballo caballo = new Caballo(0);
            race.addCaballoToRace(caballo);
        }
    }

}
