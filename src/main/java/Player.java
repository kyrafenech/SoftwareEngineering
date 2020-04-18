import java.util.Random;

public class Player {

    Position current;
    Position initial;
    Map map;

    public Player() {
        this.initial = setInitialPosition(Map.getMap().getSize()); //this will be randomly generated
        this.current = this.initial; //this will start off as initial
    }

    public Position setInitialPosition(int size_ofMap){
        Random rand = new Random();
        int x = rand.nextInt(size_ofMap);
        int y = rand.nextInt(size_ofMap);
        if(Map.getMap().grid[x][y].getType() == 'G'){
            return new Position(x,y);
        }else{
            return setInitialPosition(size_ofMap);
        }

    }

    public boolean move(Direction direction) {
        int X = this.current.getX();
        int Y = this.current.getY();
        int size = map.getMapSize();

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
            this.current.setPosition(x, y);
            return true;
        }
        return false;
    }

}
