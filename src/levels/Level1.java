package levels;
import elements.*;
import your_code.Gameplay;

public class Level1 implements Level {

	@Override
	public void load(World world, Player player) {
		world.add(player, 1, 2);
		world.add(new Enemy(), 4, 2);
		world.add(new Gate(), 5, 2);
		world.add(new Lava(), 5, 1);
		world.add(new Lava(), 5, 3);
		world.add(new Lava(), 6, 2);
	}

	@Override
	public void runPlayerCommands(Player player) {
		Gameplay.solveLevel1(player);
	}

}
