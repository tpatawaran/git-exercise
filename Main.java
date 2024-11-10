import java.util.Arrays;
import java.util.Comparator;

public class Main {

    static class Player {
        String name;
        double pointsPerGame;

        public Player(String name, double pointsPerGame) {
            this.name = name;
            this.pointsPerGame = pointsPerGame;
        }

        @Override
        public String toString() {
            return name + " (" + pointsPerGame + " PPG)";
        }
    }

    public static void filterPlayersAboveThreshold(Player[] players, double threshold) {
        System.out.println("\nPlayers with points per game above " + threshold + ":");
        for (Player player : players) {
            if (player.pointsPerGame > threshold) {
                System.out.println(player);
            }
        }
    }

    // Method to find and display the top scorer
    public static void displayTopScorer(Player[] players) {
        if (players.length == 0)
            return;

        Player topScorer = players[0];
        for (Player player : players) {
            if (player.pointsPerGame > topScorer.pointsPerGame) {
                topScorer = player;
            }
        }
        System.out.println("\nTop scorer: " + topScorer);
    }

    public static void main(String[] args) {
        Player[] players = {
                new Player("Luka Doncic", 33.1),
                new Player("Joel Embiid", 29.3),
                new Player("Giannis Antetokounmpo", 31.8),
                new Player("Stephen Curry", 30.0),
                new Player("Kevin Durant", 28.5)
        };

        System.out.println("Original list of players:");
        for (Player player : players) {
            System.out.println(player);
        }

        Arrays.sort(players, Comparator.comparingDouble(player -> -player.pointsPerGame));

        System.out.println("\nPlayers sorted by points per game (highest to lowest):");
        for (Player player : players) {
            System.out.println(player);
        }

        filterPlayersAboveThreshold(players, 30.0);

        // Example
        displayTopScorer(players);
    }
}
