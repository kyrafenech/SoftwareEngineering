public abstract class Tile {

    char type;
    boolean covered;

    public Tile(){
        covered = true;
    }

    public abstract void setType();

    public char getType() {
        return type;
    }

    public void uncoverTile(){
        covered = false;
    }


}
