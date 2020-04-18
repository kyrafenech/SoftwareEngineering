import java.util.Random;

public class Map {

    private int size;
    private Tile[][] grid;

    public Map(int size){
        this.size = size;
        this.grid = new Tile[size][size];
        generate();
    }

    private void generate(){
        //Setting the Treasure tile
        Random rnd = new Random();
        int treasureX = rnd.nextInt(this.size);
        int treasureY = rnd.nextInt(this.size);

        this.grid[treasureX][treasureY] = new Tile(TileType.TREASURE);

        //Setting number of grass tiles
        int numOfGrassTiles = (int) (size*size*0.70);

        //Setting the Grass tiles
        setGrass(treasureX, treasureX, numOfGrassTiles);

        //Setting the remaining empty tiles as Water tiles
        setWater();
   }

    private void setGrass(int tX, int tY, int num){
        int tempX = 0;
        int tempY = 0;
        boolean tileSet = false;

        for(int i=1; i <= num; i++){
            do {
                Direction direction = Direction.randomDirection();
                switch (direction) {
                    case UP:
                        tempY -=1;
                        break;
                    case DOWN:
                        tempY +=1;
                        break;
                    case LEFT:
                        tempX -=1;
                        break;
                    case RIGHT:
                        tempX +=1;
                        break;
                    default:
                        throw new IndexOutOfBoundsException();
                }

                if(tempX > 0 && tempX < size && tempY > 0 && tempY < size ){
                    tX += tempX;
                    tY += tempY;
                    grid[tempX][tempY] = new Tile(TileType.GRASS);
                    tileSet = true;
                }else{
                    tempX = 0;
                    tempY = 0;
                }
            }while(!tileSet);
        }
    }

    private void setWater(){
        for(int x=0; x < size; x++){
            for(int y=0; y < size; y++){
                if(grid[x][y] == null){
                    grid[x][y] = new Tile(TileType.WATER);
                }
            }
        }
    }

    public int getSize(){
        return this.size;
    }
}
