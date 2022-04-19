import java.util.Random;

public class Player {
	private String playerName;
	private int score;

	void setName(String name) {
		this.playerName = name;
		this.score = 0;
	}

	String getName() {
		return playerName;
	}

	void addPoints(int number) {
		score += number;
	}

	int getPoints() {
		return score;
	}

	double diceNumber(int diceType) {
		Random generator = new Random();
		return generator.nextInt(diceType) + 1;
	}

	int CalculateResults(int diceType, int rounds) {
		for (int i = 1; i <= rounds; i++) {
			int number = (int) diceNumber(diceType);
			System.out.println(number);
			score += number;
		}
		System.out.println(playerName + "'s points:" + score);
		return score;
	}
}