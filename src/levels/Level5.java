package levels;
import elements.*;
import your_code.Gameplay;

public class Level5 implements Level {

	@Override
	public void load(World world, Player player) {
		world.add(player, 0, 3);
		world.add(new Gate(), 2, 3);
		world.add(new Wall(), 1, 3);
		world.add(new Wall(), 2, 2);
		world.add(new Wall(), 2, 4);
		world.add(new Wall(), 3, 2);
		world.add(new Wall(), 3, 4);
		world.add(new Enemy(), 3, 3);
	}

	@Override
	public void runPlayerCommands(Player player) {
		Gameplay.solveLevel5(player);
	}

}
