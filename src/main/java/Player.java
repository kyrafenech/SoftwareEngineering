public class Player {

    Position current;
    Position initial;

    public Player() {
        this.initial = new Position(0, 0); //this will be randomly generated
        this.current = new Position(0, 0); //this will start off as initial
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
