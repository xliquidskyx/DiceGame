import java.util.Scanner;

public class Conditions {

	private int numberOfRounds;
	private int numberOfSides;
	private int numberOfPlayers;

	int setNumberOfSides(int number) {
		this.numberOfSides = number;

		boolean isInTheArray = RoundsCheck();

		while (isInTheArray == false) {
			System.out.println("Please, choose on of the options listed: 4|6|8|10|12|20");
			Scanner sc = new Scanner(System.in);
			numberOfSides = sc.nextInt();
			isInTheArray = RoundsCheck();
		}
		return number;

	}

	boolean RoundsCheck() {
		int[] availableOptions = { 4, 6, 8, 10, 12, 20 };

		boolean isInTheArray = false;

		for (int i = 0; i < availableOptions.length; i++) {
			if (availableOptions[i] == numberOfSides) {
				isInTheArray = true;
			}
		}
		return isInTheArray;
	}
}
