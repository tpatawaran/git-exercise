## NBA Player Sorter

This Java program sorts NBA players by their points per game and includes two additional features for filtering and displaying the top scorer.

### Features
1. Sort Players by Points Per Game
The main feature of this program is to sort NBA players by their points per game (PPG) in descending order. This makes it easy to see who is performing best in terms of scoring.

2. Filter Players Above a Points Threshold
This feature allows you to filter players who score above a specified points threshold. It’s useful if you want to see only the highest-scoring players.

Method: filterPlayersAboveThreshold(Player[] players, double threshold)

Usage: To use this feature, call filterPlayersAboveThreshold with an array of players and a threshold value. For example, calling it with a threshold of 30.0 will display all players with more than 30 points per game.

Example:
filterPlayersAboveThreshold(players, 30.0);

3. Display the Top Scorer
This feature finds and displays the player with the highest points per game in the array. It’s a quick way to identify the top scorer.

Method: displayTopScorer(Player[] players)

Usage: To use this feature, call displayTopScorer with an array of players. The method will print out the player with the highest PPG.

Example:
displayTopScorer(players);

## How to Run

Clone the repository:
git clone https://github.com/your-username/NBAPlayerSorter.git

Compile the program:
javac Main.java

Run the program:
java Main

