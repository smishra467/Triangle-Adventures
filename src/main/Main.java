package main;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;

import elements.Gui;
import elements.Player;
import elements.World;
import levels.Level;
import levels.Levels;
import your_code.Gameplay;

public class Main {

	public static final int STEP = 500;

	public Main() {
	}

	public void run() {
		final World world = new World();
		Player player = new Player();
		final Gui gui = new Gui(world);
				
		// change gui mode to DARK or LIGHT
		gui.setMode(Gui.DARK);

		while (Gameplay.LEVEL_NUMBER <= Levels.levels.length) {
		
			final Level level = Levels.levels[Gameplay.LEVEL_NUMBER - 1];
			level.load(world, player);
	
			showGui(gui);
			startLoop(world, gui);
			level.runPlayerCommands(player);
			
			if ((player.getWorld() == null && !player.isFinished) || !player.isFinished)
				break;
			
			player = new Player();
			PrintWriter pw = null;
			try {
				pw = new PrintWriter(new FileWriter(new File("assets/LevelSave.txt"), true));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pw.println(Gameplay.LEVEL_NUMBER);
			pw.close();
			Gameplay.LEVEL_NUMBER++;
			world.clear();
		
		}
		gui.repaint();
		
	}

	@SuppressWarnings("serial")
	public void showGui(final Gui gui) {
		new JFrame("Triangle Adventures") {
			{
				add(gui);
				pack();
				setResizable(false);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
			}
		};
	}

	public void startLoop(final World world, final Gui gui) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (world.isActive()) {
					gui.repaint();

					try {
						Thread.sleep(STEP);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					world.step();
				}
			}
		}).start();
	}

	public static void main(String[] args) {
		final Main m = new Main();
		m.run();
	}
}
