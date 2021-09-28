package your_code;

import elements.Player;
import levels.Levels;

public class Gameplay {

	// Change the level by changing the number below
	public static int LEVEL_NUMBER = Levels.getCurrentLevel();
	
	// Player commands for Level 1
	public static void solveLevel1(Player player) {
		/*
		 * Hint: read the documentation (https://docs.google.com/document/d/1FG13jInI48Gbv16kzwx2JGhG4sP78v1Z6rV9RUhsU0g/edit?usp=sharing)
		 * Second Hint: uncomment the last line for this level
		 */
		player.move();
		player.move();
		player.attack();
		player.move();
		player.move();
	}

	// Player commands for Level 2
	public static void solveLevel2(Player player) {
		for (int i = 0; i < 5; i++) {
			player.move();
		}
		player.turnRight();
		player.move();
		player.attack();
		player.move();
		player.turnLeft();
		player.move();
	}

	// Player commands for Level 3
	public static void solveLevel3(Player player) {
		player.turnLeft();
		player.turnLeft();
		player.move();
		player.attack();
		player.move();
		player.move();
	}

	// Player commands for Level 4
	public static void solveLevel4(Player player) {
		player.move();
		player.turnLeft();
		player.move();
		player.turnRight();
		player.move();
		player.move();
		player.move();
		player.turnRight();
		player.attack();
		player.move();
		player.turnLeft();
		player.move();
	}

	// Player commands for Level 5
	public static void solveLevel5(Player player) {
		player.turnLeft();
		player.move();
		player.move();
		player.turnRight();
		for (int i = 0; i < 4; i++) {
			player.move();
		}
		player.turnRight();
		player.move();
		player.move();
		player.turnRight();
		player.attack();
		player.move();
		player.move();
	}

	// Player commands for Level 6
	public static void solveLevel6(Player player) {
		for (int i = 0; i < 6; i++) {
			player.move();
		}
		player.turnRight();
		for (int i = 0; i < 4; i++) {
			player.move();
		}
		player.turnRight();
		for (int i = 0; i < 7; i++) {
			player.move();
		}
		player.turnRight();
		player.move();
		player.move();
		player.turnRight();
		for (int i = 0; i < 3; i++) {
			player.move();
		}
		player.attack();
		player.move();
		player.move();
	}

	// Player commands for Level 7
	public static void solveLevel7(Player player) {
		/*
		 * Make sure to read the documentation before solving the ones past here
		 */
		if (levels.Level7.CODE == 2) {
			player.turnLeft();
			player.turnLeft();
			player.attack();
			player.move();
			player.move();
		} else {
			player.attack();
			player.move();
			player.move();
		}
	}

	// Player commands for Level 8
	public static void solveLevel8(Player player) {
		for (int i = 0; i < levels.Level8.DISTANCE; i++) {
			player.move();
		}
		player.attack();
		player.move();
		player.turnLeft();
		player.move();
	}

	// Player commands for Level 9
	public static void solveLevel9(Player player) {
		
	}

	// Player commands for Level 10
	public static void solveLevel10(Player player) {
		
	}

	// Player commands for Level 11
	public static void solveLevel11(Player player) {
		
	}

	// Player commands for Level 12
	public static void solveLevel12(Player player) {
		
	}

	// Player commands for Level 13
	public static void solveLevel13(Player player) {
		
	}

	// Player commands for Level 14
	public static void solveLevel14(Player player) {
		
	}

	// Player commands for Level 15
	public static void solveLevel15(Player player) {
		
	}

	// Player commands for Level 16
	public static void solveLevel16(Player player) {
		
	}


}
