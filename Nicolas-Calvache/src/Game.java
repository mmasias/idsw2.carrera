import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Game {
    public List<Track> tracks;

    public Game(int horsesQuantity, int trackLength) {
        this.tracks = new ArrayList<>();
        IntStream.range(0, horsesQuantity).forEach(trackNumber -> tracks.add(new Track(trackLength, trackNumber + 1)));
    }

    public void begin() throws InterruptedException {
        printGame();
        while (true) {
            advance();
            printGame();
            Thread.sleep(300);

            if (gameEnds()) {
                System.exit(0);
            }
        }
    }

    private void advance() {
        this.tracks.forEach(track -> {
            track.advanceTrack();
        });
    }

    private void printGame() {
        System.out.println("---".repeat(tracks.get(0).getTrackLength()));

        this.tracks.forEach(track -> track.printTrack());

        System.out.println("---".repeat(tracks.get(0).getTrackLength()) + "\n".repeat(10));
    }

    private boolean gameEnds() {
        return tracks.stream().filter(track -> track.horseWins()).count() > 0;
    }
}
