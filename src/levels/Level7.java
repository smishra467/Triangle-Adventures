package levels;
import elements.*;
import your_code.Gameplay;

public class Level7 implements Level {

	public static final int CODE = (int) (Math.random() * 2) + 1;

	@Override
	public void load(World world, Player player) {
		world.add(player, 3, 3);
		world.add(new Enemy(), (CODE == 1) ? 4 : 2, 3);
		world.add(new Gate(), (CODE == 1) ? 5 : 1, 3);
		for (int i = 0; i < 5; i ++) {
			
			world.add(new Wall(), 1 + i, 2);
			world.add(new Wall(), 1 + i, 4);
			
		}
		
		world.add(new Wall(), 0, 3);
		world.add(new Wall(), 6, 3);
		
	}

	@Override
	public void runPlayerCommands(Player player) {
		Gameplay.solveLevel7(player);
	}

}
