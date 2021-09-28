package levels;
import elements.*;
import your_code.Gameplay;

public class Level3 implements Level {

	@Override
	public void load(World world, Player player) {
		world.add(player, 3, 2);
		world.add(new Enemy(), 1, 2);
		world.add(new Lava(), 0, 1);
		world.add(new Lava(), 0, 3);
		world.add(new Door(), 0, 2);
	}

	@Override
	public void runPlayerCommands(Player player) {
		Gameplay.solveLevel3(player);
	}
	
}
