public class Tile {

    private TileType type;
    private boolean covered;

    public Tile(TileType type){
        this.type = type;
        this.covered = true;
    }

    public TileType getType() {
        return this.type;
    }

    public void uncoverTile(){
        this.covered = false;
    }

}
