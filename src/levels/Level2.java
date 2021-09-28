package levels;
import elements.*;
import your_code.Gameplay;

public class Level2 implements Level {

	@Override
	public void load(World world, Player player) {
		world.add(player, 1, 2);
		world.add(new Enemy(), 6, 4);
		world.add(new Gate(), 7, 4);
		world.add(new Lava(), 7, 3);
		world.add(new Lava(), 7, 5);
	}

	@Override
	public void runPlayerCommands(Player player) {
		Gameplay.solveLevel2(player);
	}

}
