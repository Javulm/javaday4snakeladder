package snakeandladdder;
import java.util.Random;

public class SnakeNLadder {
	static int POSITION = 0;
	static final int IS_LADDER = 1;
	static final int IS_SNAKE = 2;
	static final int NO_PLAY = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake And ladder");
		System.out.println("Current Position: " + POSITION);
		 while (POSITION!=100) {
		int dieNumber = dieRoll();
		start(dieNumber);
		System.out.println("Die Number is : " + dieNumber);
		System.out.println("Current Position: " + POSITION);
	}
	}
	private static void start(int dieNumber) {
		int option = (int) (Math.random() * 10) % 3;
		switch (option) {
		case IS_LADDER:
			System.out.println("You got ladder");
			POSITION += dieNumber;
			break;
		case IS_SNAKE:
			System.out.println("you got snake");
			POSITION -= dieNumber;
			break;
		case NO_PLAY:
			System.out.println("No Play");
		}
	}

	private static int dieRoll() {
		Random random = new Random();
		int dieNumber = random.nextInt(6) + 1;
		return dieNumber;
	}
}
