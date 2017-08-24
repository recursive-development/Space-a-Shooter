package com.shako.spaceshooter.desktop;

// --- ---
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
// --- ----
import com.shako.spaceshooter.GameApp;

/** */
public class DesktopLauncher {

    /** */
	public static void main (String[] arg) {

        //
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        //
        new LwjglApplication(new GameApp(), config);

	}
}
