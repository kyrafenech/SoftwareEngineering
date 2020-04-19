public class Tile {

    private TileType type;
    private boolean uncovered;

    public Tile(TileType type){
        this.type = type;
        this.uncovered = false;
    }

    public TileType getType() {
        return this.type;
    }

    public void setUncovered(){
        this.uncovered = true;
    }

}
