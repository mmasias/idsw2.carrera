import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Game {
    public List<Track> tracks;

    public Game(int horsesQuantity, int trackLength) {
        this.tracks = new ArrayList<>();
        IntStream.range(0, horsesQuantity).forEach(index -> tracks.add(new Track(trackLength)));
    }

    public void advance() {
        this.tracks.forEach(track -> {
            track.advance();
        });
    }

    public void printGame() {
        this.tracks.forEach(track -> {
            IntStream.range(0, track.getTrack().size()).forEach(index -> {
                if (track.getHorse().getPosition() >= index) {
                    System.out.print("[" + (tracks.indexOf(track) + 1) + "]");
                } else {
                    System.out.print("[" + 0 + "]");
                }
            });
            System.out.println("");
        });

        System.out.println("\n--------------------------\n");
    }

    public boolean gameEnds() {
        List<Track> winnerTrack = tracks.stream()
                .filter(track -> track.getHorse().getPosition() == track.getTrack().size() - 1)
                .collect(Collectors.toList());
        winnerTrack.forEach(track -> track.getHorse().wins(tracks.indexOf(track) + 1));

        return winnerTrack.size() > 0;
    }
}
