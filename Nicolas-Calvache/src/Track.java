import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Track {
    private List<Integer> track;
    private Horse horse;
    private int trackNumber;

    public Track(int trackLength, int trackNumber) {
        this.trackNumber = trackNumber;
        this.track = new ArrayList<Integer>();
        this.horse = new Horse(0);
        this.fillTrack(trackLength);
    }

    private void fillTrack(int trackLength) {
        IntStream.range(0, trackLength).forEach(index -> this.track.add(0));
    }

    public List<Integer> getTrack() {
        return this.track;
    }

    public void advanceTrack() {
        if (Math.random() <= 0.25) {
            this.horse.advance();
        }
    }

    public Horse getHorse() {
        return this.horse;
    }

    public void printTrack() {
        IntStream.range(0, this.track.size()).forEach(index -> {
            if (this.horse.getPosition() >= index) {
                System.out.print("[" + trackNumber + "]");
            } else {
                System.out.print("[" + 0 + "]");
            }
        });
        
        System.out.println("");
    }

    public boolean horseWins() {
        if (this.horse.getPosition() == track.size() - 1) {
            this.horse.wins(this.trackNumber);
            return true;
        } else {
            return false;
        }
    }
}
