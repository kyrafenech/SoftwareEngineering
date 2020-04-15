public class Map {

    int size;

    public boolean setMapSize(int x, int y, int n){
        // n is the number of players
        int max_x = 50;
        int max_y = 50;
        int min_x; int min_y;
        if(n<=4){
             min_x = 5;
             min_y = 5;
        }else {
             min_x= 8;
             min_y=8;
        }

        if(min_x <x && x < max_x && min_y < y && y < max_y) {
            return true;
        }else{
            return false;
        }

    }

    public void generate(){

    }

    public char getTileType(int x, int y){

        char type = 'G';

        return type;
    }

    public int getSize(){
        return size;
    }
}
