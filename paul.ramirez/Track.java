import java.util.ArrayList;

public class Track {
    protected int length;

    public Track(int length){
        this.length =  length;
    }

    public void printTrack(ArrayList<Caballo> caballos){
        for(Caballo caballo : caballos){
            for(int i = 0; i < this.length ; i++){
                if(caballo.getPos() == i) System.out.print("["+ caballo.getId()+"]");
                else System.out.print("[-]");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
    }

    public boolean hasWinner(ArrayList<Caballo> caballos){
        for(Caballo caballo : caballos){
            if(caballo.getPos() >=  length -1) return true;
        }
        return false;
    }

    public int getLength(){
        return this.length;
    }
}
