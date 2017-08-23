package ru.geekbrains.java_games.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ru.geekbrains.java_games.JavaGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width  = 640;
		config.height = 480;
        config.title = "Game Jam Tech";

		new LwjglApplication(new JavaGame(), config);
	}
}
