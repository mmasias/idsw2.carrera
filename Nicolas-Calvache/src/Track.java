import java.util.stream.IntStream;

public class Track {
    private int trackLength;
    private Horse horse;
    private int trackNumber;

    public Track(int trackLength, int trackNumber) {
        this.trackNumber = trackNumber;
        this.trackLength = trackLength;
        this.horse = new Horse(0, trackNumber);
    }

    public int getTrackLength() {
        return this.trackLength;
    }

    public void advanceTrack() {
        if (Math.random() <= 0.05) {
            this.horse.run();

        } else if (Math.random() <= 0.25) {
            this.horse.advance();

        }
    }

    public Horse getHorse() {
        return this.horse;
    }

    public void printTrack() {
        IntStream.range(0, this.trackLength).forEach(index -> {
            if (this.horse.getPosition() >= index) {
                System.out.print("[" + trackNumber + "]");
            } else {
                System.out.print("[" + 0 + "]");
            }
        });

        System.out.println("");
    }

    public boolean horseWins() {
        if (this.horse.getPosition() == trackLength) {
            this.horse.wins();
            return true;
        } else {
            return false;
        }
    }
}
