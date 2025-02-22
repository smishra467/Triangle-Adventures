package levels;
import elements.*;
import your_code.Gameplay;

public class Level9 implements Level {

	public final static int WALL_LENGTH = (int) (Math.random() * 6 + 1);
	
	@Override
	public void load(World world, Player player) {
		world.add(player, 0, 1);

		for (int i = 0; i <= WALL_LENGTH + 1; i++) {
			world.add(new Wall(), i, 0);
		}

		for (int i = 0; i < WALL_LENGTH; i++) {
			world.add(new Wall(), i, 2);
			for (int k = 0; k <= 5; k++) {
				if (k != 1)
					world.add(new Wall(), WALL_LENGTH + 1, k);
			}
		}

		world.add(new Enemy(), 0, 4);
		world.add(new Enemy(), 1, 4);
		world.add(new Enemy(), 1, 5);
		world.add(new Gate(), 0, 5);
	}

	@Override
	public void runPlayerCommands(Player player) {
		Gameplay.solveLevel9(player);
	}

}
