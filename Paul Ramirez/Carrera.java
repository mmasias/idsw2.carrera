import java.util.ArrayList;

class Carrera {
    public static void main(String[] args) {
        ArrayList<Caballo> competidores = new ArrayList<>();
        Caballo caballo1 = new Caballo("1");
        Caballo caballo2 = new Caballo("2");
        competidores.add(caballo1);
        competidores.add(caballo2);
        Track track = new Track(15);

        track.printTrack(competidores);
        while(!track.hasWinner(competidores)){
            int move = (int)(Math.random() * competidores.size());
            competidores.get(move).advance();
            track.printTrack(competidores);
        }
        for(Caballo caballo : competidores){
            if(caballo.getPos() >=  track.getLength() -1) System.out.println("Gano el caballo " + caballo.getId());
        }
        
    }
}