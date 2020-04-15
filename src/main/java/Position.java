public class Position {

    int x;
    int y;

    public Position(int x, int y) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean setPosition(int n, int X, int Y) {
        if(isLegal(n, X, Y)) {
            this.x = X;
            this.y = Y;
            return true;
        }
        return false; //to return false if move is illegal
    }

    //Ensuring that the player does not try to move outside the map
    private boolean isLegal(int n, int X, int Y){
        if(X <= n && Y <= n){
            return true;
        }
        return false;
    }

}

