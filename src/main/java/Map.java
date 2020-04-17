import java.util.Random;

public class Map {

    int size;


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
