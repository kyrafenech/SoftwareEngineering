public class Map {

    private int size;
    private Tile[][] grid;

    public Map(int size){
        this.size = size;
        this.grid = new Tile[size][size];
    }

    public void generate(){

    }

    public char getTileType(int x, int y){

        char type = 'G';

        return type;
    }

    public int getSize(){
        return size;
    }
}
