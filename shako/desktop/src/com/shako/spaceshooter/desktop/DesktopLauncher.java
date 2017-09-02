package com.shako.spaceshooter.desktop;

// --- libGDX ---
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

// --- Custom ----
import com.shako.spaceshooter.GameApp;
import com.shako.game.engine.globals.R;

/** */
public class DesktopLauncher {

    /** */
	public static void main (String[] arg) {

        //
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title  = R.GAME_APP_TITLE;
		config.width  = R.DEF_DESKTOP_SCREEN_WIDTH;
		config.height = R.DEF_DESKTOP_SCREEN_HEIGHT;

        //
        new LwjglApplication(new GameApp(), config);

	}
}
