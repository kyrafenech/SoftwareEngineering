public class Position {

    int x;
    int y;

    //Ensuring that the user does not try to move outside the map
    private boolean isLegal(int n){
        if(x <= n && y <= n){
            return true;
        }

        return false;
    }

}
