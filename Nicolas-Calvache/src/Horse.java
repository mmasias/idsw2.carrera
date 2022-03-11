public class Horse {
    private int position;

    public Horse(int postitionX) {
        this.position = postitionX;
    }

    public void advance() {
        this.position = position + 1;
    }

    public int getPosition() {
        return this.position;
    }

    public void wins(int horseNumber) {
        System.out.println("Horse " + horseNumber + " won!");
    }
}