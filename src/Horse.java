public class Horse {
    private int positionX;

    public Horse(int postitionX) {
        this.positionX = postitionX;
    }

    public void advance() {
        this.positionX = positionX + 1;
    }

    public int getPositionX() {
        return this.positionX;
    }

    public void wins(int horseNumber) {
        System.out.println("Horse " + horseNumber + " won!");
    }
}