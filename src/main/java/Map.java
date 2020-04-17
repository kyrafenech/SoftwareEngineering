import java.util.Random;

public class Map {

    int size;
    Tile[][] grid;


    public boolean setMapSize(int x, int y, int n){
        // n is the number of players

        if(x!=y){
            System.out.println("The map must be a square shape of size NxN.\n");

        }
        int max_size = 50;
        int min_size;
        if(n<=4){
             min_size = 5;
        }else {
             min_size= 8;
        }

        if(min_size < x && x < max_size) {
            this.size = x;
            return true;
        }else{
            return false;
        }

    }

    public Tile[][] generate(){
        this.grid = new Tile[size][size];
        Random rand = new Random();
        setTreasure(rand); //treasure tile is chosen first
        setWaterTile(rand);
        setGrass();
        return this.grid;
   }

    public void setTreasure(Random random){
        int random_x = random.nextInt(this.size);
        int random_y = random.nextInt(this.size);

        this.grid[random_x][random_y] = new TreasureTile();
    }

    public void setWaterTile(Random random){
        //number of water tiles will be approximately 30% of the size
        int amount = (int)((float)Math.pow(this.size,2)/3);
        int i;
        for(i =0; i < amount; i++){
            int random_x = random.nextInt(this.size);
            int random_y = random.nextInt(this.size);
            //in case the random coordinates are occupied by another tile
            if(this.grid[random_x][random_y] != null){
                amount++;
                continue;
            }else{
                this.grid[random_x][random_y] = new WaterTile();
            }
        }
    }

    public void setGrass(){
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (this.grid[i][j] == null)
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
