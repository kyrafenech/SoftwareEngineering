import java.util.Random;

public class Map {

    int size;
    Tile[][] grid;


    public boolean setMapSize(int size, int n){
        // n is the number of players

        int max_size = 50;
        int min_size;
        if(n<=4){
             min_size = 5;
        }else {
             min_size= 8;
        }

        if(min_size < size && size < max_size) {
            this.size = size;
            return true;
        }else{
            return false;
        }

    }

    public Tile[][] generate(){
        this.grid = new Tile[size][size];
        Random rand = new Random();
        setGrass();
        setTreasure(rand);
        setWaterTile(rand);
        return this.grid;
   }

    public void setTreasure(Random random){
        int random_x = random.nextInt(this.size);
        int random_y = random.nextInt(this.size);

        this.grid[random_x][random_y]=null; //since it is already a grass tile
        this.grid[random_x][random_y] = new TreasureTile();
    }

    public void setWaterTile(Random random){
        //number of water tiles will be approximately 30% of the size
        int amount = (int)((float)Math.pow(this.size,2)/3);
        int i;
        for(i =0; i < amount; i++){
            int random_x = random.nextInt(this.size);
            int random_y = random.nextInt(this.size);
            //in case the random coordinates are occupied by the treasure tile or another water tile
            if(this.grid[random_x][random_y] instanceof TreasureTile || this.grid[random_x][random_y] instanceof WaterTile){
                amount++;
                continue;
            }else{
                this.grid[random_x][random_y]=null; //since it is already a grass tile
                this.grid[random_x][random_y] = new WaterTile();
            }
        }
    }

    public void setGrass(){
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                    this.grid[i][j] = new GrassTile();
            }
        }
    }

    public char getTileType(int x, int y){

        char type = 'G';

        return type;
    }

    public int getSize(){
        return size;
    }
}
