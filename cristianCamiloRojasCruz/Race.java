import java.util.ArrayList;
import java.util.List;

public class Race {
    private int length;
    private int[][] progress;
    private List<Caballo> contestants;
    private List<Caballo> winner;

    public Race(int length){
        this.length = length;
        this.contestants = new ArrayList<Caballo>();
        this.progress = new int[0][0];
        this.winner = new ArrayList<Caballo>();
    }

    public void addCaballoToRace(Caballo caballo){
        caballo.setNumber(contestants.size());
        contestants.add(caballo);
    }

    private int[][] createField(int mapLength, int contestantsLength){
        int[][] newArray = new int[contestantsLength][mapLength];
        for(int i = 0; i < contestantsLength; i++){
            for(int j = 0; j < mapLength - 1; j++){
                newArray[i][j] = 0;
            }
        }
        return newArray;
    }

    public void startRace(){

        progress = createField(length, contestants.size());

        while(winner.isEmpty()){
            verifyWinner();
            printRace();
            moveHorses();
        }
    }
    private void verifyWinner(){
        for(int i = 0; i < progress.length; i++){
            if(contestants.get(i).getPosition() == progress[i].length){
                winner.add(contestants.get(i));
            }
        }
    }

    private void moveHorses(){
        for(Caballo i : contestants){
            i.tryMove();
        }
    }

    private void printRace(){
        for(int i = 0; i < progress.length; i++){
            for(int j = 0; j < progress[0].length; j++){
              if(contestants.get(i).getNumber() == i && contestants.get(i).getPosition() > j){
                  System.out.print("[" + contestants.get(i).getNumber() + "]");
              } else{
                  System.out.print("[-]");
              }
            }
            System.out.println("");
        }
        System.out.println("------------------------------------------------------------------");
        if(!winner.isEmpty()){
            if(winner.size() == 1){
                System.out.println("The winner is: " + winner.get(0).getNumber());
            } else{
                for(Caballo caballo: winner){
                    System.out.println("tied: " + caballo.getNumber());
                }
            }

        }
    }
}
