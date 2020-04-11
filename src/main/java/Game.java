public class Game {

    int turns;
    Player player;
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

    public void generateHTMLFile(){

    }

    public static void main(String[] args) {

    }
}
