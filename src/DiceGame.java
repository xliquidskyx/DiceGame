import java.util.ArrayList;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Conditions conditions = new Conditions();

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a dice: 4|6|8|10|12|20 sides");
		int diceType = sc.nextInt();
		diceType = conditions.setNumberOfSides(diceType); // checks if an input is valid and returns it
		System.out.println("Choose the number of rounds: ");
		int rounds = sc.nextInt();
		System.out.println("Choose the number of players:");
		int playerNumber = sc.nextInt();

		ArrayList<Player> players = new ArrayList<Player>(); // create an array for the object Player

		for (int i = 0; i < playerNumber; i++) {
			if (i == 0) {
				System.out.println("Select name for the first player: ");
			} else {
				System.out.println("Select name for the next player: ");
			}
			String name = sc.next();
			players.add(new Player()); // add a new player to the array
			players.get(i).setName(name); // set the name of said player
		}
		sc.close();

		System.out.println("Welcome to our game!");
		System.out.println(players.get(0).getName() + " you go first!");

		int i = 0;
		int max = 0;
		String winner = null;

		while (i < playerNumber) {

			int score = players.get(i).CalculateResults(diceType, rounds); // print out results for player i
			if (score > max) {
				max = score;
				winner = players.get(i).getName(); // set a winner
			}

			i++;
		}

		System.out.println("And the winner is: " + winner + "! Congratulations!");

	}
}
