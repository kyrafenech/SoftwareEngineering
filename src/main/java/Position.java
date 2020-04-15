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

    public boolean setPosition(int X, int Y) {
        this.x = X;
        this.y = Y;
        return true;
    }

}

