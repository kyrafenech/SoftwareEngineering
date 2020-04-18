public class Game {

    int turns;
    Player[] players;
    Map map;


    public boolean setNumPlayers(int n){

        int min_players = 2;
        int max_players = 8;
        if(n<min_players){
            return false;
        }
        else if(n>max_players){
            return false;
        }else {
            return true;
        }
    }

    private boolean setMapSize(int size){

        final int MAX = 50;
        final int MIN = players.length <= 4 ? 5 : 8;

        return MIN <= size && size <= MAX ? true : false;
    }

    public void generateHTMLFile(){

    }

    public static void main(String[] args) {

    }
}
