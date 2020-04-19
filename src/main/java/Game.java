public class Game {

    int turns;
    Player[] players;
    Map map;


    public boolean setNumPlayers(int playerCount){
        int minPlayers = 2;
        int maxPlayers = 8;

        //validating given number of players [2 < n < 8]
        return playerCount < minPlayers || playerCount > maxPlayers ? false : true;
    }

    private boolean setMapSize(int size){
        final int MAX = 50;
        //setting minimum number of map size according to amount of players
        final int MIN = players.length <= 4 ? 5 : 8;

        //validating given size
        return MIN <= size && size <= MAX ? true : false;
    }

    public void generateHTMLFile(){

    }

    public static void main(String[] args) {

    }
}
