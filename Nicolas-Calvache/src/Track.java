import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Track {
    private List<Integer> track;
    public Horse horse;

    public Track(int trackLength) {
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
}
