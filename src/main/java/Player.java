import java.util.Random;

public class Player {

    private Position current;
    private Position initial;
    private Map map;

    public Player(Map map) {
        this.map = map;
        setInitial();
        this.current = this.initial; //this will start off as initial
    }

    private void setInitial(){
        Random rand = new Random();
        int x, y;

        do {
            x = rand.nextInt(map.getMapSize());
            y = rand.nextInt(map.getMapSize());

        }while(map.getTileType(x, y) != TileType.GRASS);

        this.initial = new Position(x, y);
    }

    public boolean move(Direction direction) {
        int X = this.current.getX();
        int Y = this.current.getY();

        switch (direction) {
            case UP:
                Y -= 1; //y-coordinate moves up by 1
                break;
            case DOWN:
                Y += 1; //y-coordinate moves down by 1
                break;
            case RIGHT:
                X += 1; //x-coordinate moves right by 1
                break;
            case LEFT:
                X -= 1; //x-coordinate moves left by 1
                break;
            default:
                //in the case of an invalid token the player does not move
                System.out.println("Please press U, D, L or R to move.");
                return false;
        }
        if(!setPosition(new Position(X,Y))){
            System.out.println("Illegal move.");
            return false;
        }
        return true;
    }

    private boolean setPosition(Position p){
        //checking if new coordinates are in map boundary
        int x = p.getX();
        int y = p.getY();

        if(x > 0 && x < map.getMapSize() && y > 0 && y < map.getMapSize()){
            this.current.setX(x);
            this.current.setY(y);
            return true;
        }
        return false;
    }

}
