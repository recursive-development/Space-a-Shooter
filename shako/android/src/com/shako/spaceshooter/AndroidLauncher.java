package com.shako.spaceshooter;

// --- ---
import android.os.Bundle;
// --- ---
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
// --- ---
import com.shako.spaceshooter.SGame;

/** */
public class AndroidLauncher extends AndroidApplication {

    /** */
	@Override
	protected void onCreate (Bundle savedInstanceState) {

        //
		super.onCreate(savedInstanceState);

        //
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();

        //
        initialize(new SGame(), config);
	}
}
