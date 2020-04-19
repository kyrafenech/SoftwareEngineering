import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private int turns;
    private Player[] players;
    private Map map;
    private File[] htmlFiles;
    private BufferedWriter[] bw;

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

    public void generateHTMLFiles() throws IOException {
        int i,j,k;

        String html = "";

        if(htmlFiles == null) {
            htmlFiles = new File[players.length];
            bw = new BufferedWriter[players.length];
            for (i = 0; i < htmlFiles.length; i++) {
                htmlFiles[i] = new File("C:\\map_player_" + (i + 1) + ".html");
                bw[i] = new BufferedWriter(new FileWriter(htmlFiles[i]));
            }
        }
        else{
            for(i=0; i < htmlFiles.length; i++){
                html += "<table>";

                for(j=0; j < map.getSize(); j++){
                    html += "<tr>";
                    for(k=0; k < map.getSize(); k++){
                        if(players[i].getMap().getTileType())
                    }
                    html += "</tr>";
                }

                html += "</table>";

                bw[i].write(html);
                bw[i].close();
            }
        }
    }

    public static void main(String[] args) {
        //starting the game
        Game game = new Game();

        //variables/scanner object for receiving user input
        boolean inputAccepted;
        Scanner scanner = new Scanner(System.in);

        //variables for user input for map size and number of players
        int size = 0, playerCount = 0;
        //to control main game loop
        boolean isGameWon = false;
        //variable for for-loops
        int i;
        //to accept player movement input
        Direction move;
        //array of winners
        ArrayList<Integer> winners = new ArrayList<>();

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

        //initialising the map
        game.map = new Map(size);

        //creating the players
        for(i=0; i < playerCount; i++){
            game.players[i] = new Player(game.map);
        }

        do{
            //loop for player movement
            for(i=0; i < playerCount; i++){
                //move validation
                do {
                    System.out.println("Enter UP, DOWN, LEFT, RIGHT to move");
                    move = Direction.valueOf(scanner.nextLine());
                }while(!game.players[i].move(move));

                //if treasure tile is found by a player, game ends
                if(game.players[i].getStatus() == PlayerStatus.WINS){
                    if (!isGameWon) isGameWon = true;
                    winners.add(i);
                }
            }
        }while(!isGameWon);

        //building list of winners
        StringBuilder listOfWinners = new StringBuilder("Player " + winners.get(i));

        for(i=1; i < winners.size(); i++){
            if(i+1 == winners.size()){
                listOfWinners.append(" and Player ").append(winners.get(i));
            }
            else{
                listOfWinners.append(", Player ").append(winners.get(i));
            }
        }

        System.out.println("Congratulations " + listOfWinners + ", you win the game!");
    }
}
