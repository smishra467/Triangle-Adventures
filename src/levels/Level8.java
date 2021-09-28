package levels;
import elements.*;
import your_code.Gameplay;

public class Level8 implements Level {

	public static final int DISTANCE = (int) (Math.random() * 5);

	@Override
	public void load(World world, Player player) {
		world.add(player, 2, 3);
		world.add(new Enemy(), 3 + DISTANCE, 3);
		world.add(new Door(), 3 + DISTANCE, 2);
		for (int i = 0; i < 6; i ++) {
			world.add(new Wall(), 2 + i, 1);
			world.add(new Wall(), 2 + i, 4);
			if (2 + i != 3 + DISTANCE)
				world.add(new Lava(), 2 + i, 2);
		}
		world.add(new Wall(), 1, 2);
		world.add(new Wall(), 1, 3);
	}

	@Override
	public void runPlayerCommands(Player player) {
		Gameplay.solveLevel8(player);
	}

}
