import java.util.Scanner;

public class Game {

    private int turns;
    private Player[] players;
    private Map map;


    private boolean setNumPlayers(int playerCount){
        int minPlayers = 2;
        int maxPlayers = 8;

        //validating given number of players [2 < n < 8]
        if(playerCount <= minPlayers || playerCount >= maxPlayers){
            System.out.println("Only between 2 and 8 players are accepted.");
            return false;
        }
        return true;
    }

    private boolean setMapSize(int size){
        final int MAX = 50;
        //setting minimum number of map size according to amount of players
        final int MIN = players.length <= 4 ? 5 : 8;

        //validating given size
        if(MIN >= size){
            System.out.println("Given map size is too small.");
            return false;
        }
        else if(MAX <= size){
            System.out.println("Given map size is too big.");
            return false;
        }
        return true;
    }

    public void generateHTMLFile(){

    }

    public static void main(String[] args) {
        //starting the game
        Game game = new Game();

        //variables/scanner object for receiving user input
        boolean inputAccepted;
        Scanner scanner = new Scanner(System.in);

        //variables for map size and number of players
        int size = 0, playerCount = 0;

        //validating number of players
        do {
            System.out.println("Enter number of players: ");
            if (scanner.hasNextInt()) {
                playerCount = scanner.nextInt();
                inputAccepted = game.setNumPlayers(playerCount);
            } else {
                scanner.nextLine();
                System.out.println("Not an integer!");
                inputAccepted = false;
            }
        }while(!inputAccepted);

        //initialising players array
        game.players = new Player[playerCount];

        //validating map size
        do{
            System.out.println("Enter map size: ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                inputAccepted = game.setMapSize(size);
            }
            else {
                scanner.nextLine();
                System.out.println("Not an integer!");
                inputAccepted = false;
            }
        }while(!inputAccepted);

        game.map = new Map(size);


    }
}
