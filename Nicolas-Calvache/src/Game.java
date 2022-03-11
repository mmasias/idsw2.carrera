import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Game {
    public List<Track> tracks;

    public Game(int horsesQuantity, int trackLength) {
        this.tracks = new ArrayList<>();
        IntStream.range(0, horsesQuantity).forEach(trackNumber -> tracks.add(new Track(trackLength, trackNumber + 1)));
    }

    public void advance() {
        this.tracks.forEach(track -> {
            track.advanceTrack();
        });
    }

    public void printGame() {
        System.out.println("---".repeat(tracks.get(0).getTrack().size()));

        this.tracks.forEach(track -> track.printTrack());

        System.out.println("---".repeat(tracks.get(0).getTrack().size()) + "\n".repeat(10));
    }

    public boolean gameEnds() {
        return tracks.stream().filter(track -> track.horseWins()).count() > 0;
    }
}
