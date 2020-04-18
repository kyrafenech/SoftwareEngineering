import java.util.Random;

public class Player {

    Position current;
    Position initial;

    public Player() {
        this.initial = setInitialPosition(Map.getMap().getSize()); //this will be randomly generated
        this.current = this.initial; //this will start off as initial
    }

    public Position setInitialPosition(int size_ofMap){
        Random rand = new Random();
        int x = rand.nextInt(size_ofMap);
        int y = rand.nextInt(size_ofMap);
        if(Map.getMap().grid[x][y].tileType() == 'G'){
            return new Position(x,y);
        }else{
            return setInitialPosition(size_ofMap);
        }

    }

    public boolean move(char direction, int size) {
        int X, Y; //new coordinates
        boolean moved;

        switch (direction) {
            case 'U':
                X = this.current.getX(); //x-coordinate stays the same
                Y = this.current.getY() + 1; //y-coordinate moves up by 1
                break;
            case 'D':
                X = this.current.getX(); //x-coordinate stays the same
                Y = this.current.getY() - 1; //y-coordinate moves down by 1
                break;
            case 'R':
                X = this.current.getX() + 1; //x-coordinate moves right by 1
                Y = this.current.getY(); //y-coordinate stays the same
                break;
            case 'L':
                X = this.current.getX() - 1; //x-coordinate moves left by 1
                Y = this.current.getY(); //y-coordinate stays the same
                break;
            default:
                //in the case of an invalid token the player does not move
                X = this.current.getX();
                Y = this.current.getY();
                System.out.println("Please press U, D, L or R to move.");
                moved = false;
        }

        if (this.current.setPosition(size, X, Y)) {
            moved = true;
        } else {
            System.out.println("Illegal move!");
            moved = false;
        }

        return moved;

    }


}
