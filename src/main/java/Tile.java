public abstract class Tile {

    char type;
    boolean covered = true;

    public Tile(){

    }

    private abstract void setType();
    public abstract char getType();

    private void setCovered(){
        covered = false;
    }

    public void uncoverTile(){

    }


}
