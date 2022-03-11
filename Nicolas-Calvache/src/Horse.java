public class Horse {
    private int position;
    private int horseNumber;

    public Horse(int postition, int horseNumber) {
        this.position = postition;
        this.horseNumber = horseNumber;
    }

    public void advance() {
        this.position = position + 1;
    }

    public void run() {
        this.position = position + 3;
    }

    public int getPosition() {
        return this.position;
    }

    public void wins() {
        System.out.println("Horse " + this.horseNumber + " won!");
    }
}