import java.util.Arrays;
import java.util.Comparator;

public class Main {

    static class Player {
        String name;
        double pointsPerGame;

        // Constructor
        public Player(String name, double pointsPerGame) {
            this.name = name;
            this.pointsPerGame = pointsPerGame;
        }

        @Override
        public String toString() {
            return name + " (" + pointsPerGame + " PPG)";
        }
    }

    public static void main(String[] args) {
        // Array of NBA players and their points per game
        Player[] players = {
                new Player("Luka Doncic", 33.1),
                new Player("Joel Embiid", 29.3),
                new Player("Giannis Antetokounmpo", 31.8),
                new Player("Stephen Curry", 30.0),
                new Player("Kevin Durant", 28.5)
        };

        // Print the original list
        System.out.println("Original list of players:");
        for (Player player : players) {
            System.out.println(player);
        }

        // Sort players by points per game in descending order
        Arrays.sort(players, Comparator.comparingDouble(player -> -player.pointsPerGame));

        // Print the sorted list
        System.out.println("\nPlayers sorted by points per game (highest to lowest):");
        for (Player player : players) {
            System.out.println(player);
        }
    }
}