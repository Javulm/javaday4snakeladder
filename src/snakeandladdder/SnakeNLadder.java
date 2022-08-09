package snakeandladdder;
import java.util.Random;

public class SnakeNLadder {
	static int POSITION = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake And ladder");
		System.out.println("Current Position: " + POSITION);
		int dieNumber = dieRoll();
		System.out.println("Die Number is : " + dieNumber);
	}

	private static int dieRoll() {
		Random random = new Random();
		int dieNumber = random.nextInt(6) + 1;
		return dieNumber;
	}
}
