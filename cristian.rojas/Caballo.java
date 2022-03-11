public class Caballo {
    private int position;
    private int number;

    public Caballo(int position){
        this.number = 0;
        this.position = position;
    }
    public int getPosition(){
        return this.position;
    }

    public void setPosition(int newPosition){
        this.position = newPosition;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void tryMove() {
        if(Math.random() <= 0.25){
            setPosition(this.position + 1);
        }
    }
}
