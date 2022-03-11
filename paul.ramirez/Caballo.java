public class Caballo {
    protected int pos;
    protected String id;
    
    public Caballo(String id){
        this.pos = -1;
        this.id = id;
    }

    public void advance(){
        this.pos++;
    }

    public int getPos(){
        return this.pos;
    }

    public String getId(){
        return this.id;
    }
}
