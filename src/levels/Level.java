package levels;
import elements.Player;
import elements.World;

public interface Level {

	public void load(World world, Player player);

	public void runPlayerCommands(Player player);
	
}
