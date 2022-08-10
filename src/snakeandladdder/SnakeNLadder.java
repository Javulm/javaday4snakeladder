package snakeandladdder;
import java.util.Random;

public class SnakeNLadder {
	static int CHANCE=1;
	static final int IS_LADDER = 1;
	static final int IS_SNAKE = 2;
	static final int NO_PLAY = 0;
	

	public static void main(String[] args) {
		System.out.println("Welcome to Snake And ladder");
		player person1 = new player();
		player person2 = new player();
		System.out.println("Current Position of person1: " + person1.POSITION);
		System.out.println("Current Position of person2: " + person2.POSITION);
		while (person1.POSITION!=100 && person2.POSITION!=100) {
			int dieNumber = dieRoll();
			System.out.println("Die Number is : " + dieNumber);
			if(CHANCE==1) {
				person1.TOTAL_DIE_ROLL++;
				start(dieNumber, person1);
			}
			else {
				person1.TOTAL_DIE_ROLL++;
				start(dieNumber, person2);
			}
		}
			if (person1.POSITION==100) {
				System.out.println("The winner is person1");
				System.out.println("The total die played by person1 : "+person1.TOTAL_DIE_ROLL);
			}
			else if (person2.POSITION==100) {
				System.out.println("The winner is person2");
				System.out.println("The total die played by person2 : "+person2.TOTAL_DIE_ROLL);
			}
		}
	    private static void start(int dieNumber, player person) {
		int option = (int) (Math.random() * 10) % 3;
		switch (option) {
		case IS_LADDER:
			System.out.println("person" +CHANCE+ " got ladder");
			if (player.POSITION + dieNumber<=100)
				player.POSITION += dieNumber;
				System.out.println("current position: " + player.POSITION);
			break;
		case IS_SNAKE:
			System.out.println("person" +CHANCE+ " got snake");
			player.POSITION -= dieNumber;
			if (player.POSITION<0) {
                player.POSITION =0;
			System.out.println("current position: " + player.POSITION);
			}
			if(CHANCE==1)
				CHANCE=2;
			else
				CHANCE=1;
			break;
		case NO_PLAY:
			System.out.println("No Play");
			if(CHANCE==1)
				CHANCE=2;
			else
				CHANCE=1;
		}
	}

	private static int dieRoll() {
		Random random = new Random();
		int dieNumber = random.nextInt(6) + 1;
		 player.TOTAL_DIE_ROLL++;
		return dieNumber;
	}
}

class player{
	static int POSITION = 0;
	static int TOTAL_DIE_ROLL=0;
}

