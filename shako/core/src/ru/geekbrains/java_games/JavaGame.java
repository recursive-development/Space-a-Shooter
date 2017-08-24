package ru.geekbrains.java_games;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class JavaGame extends ApplicationAdapter {

    private SpriteBatch batch;

    private Texture
            GALAXY,
            SHIP;

	private Sprite
            background,
            ship;

    private float rotation;

	@Override
	public void create () {

        batch = new SpriteBatch();

        GALAXY = new Texture(Gdx.files.internal("andromeda_640x480.png"));
        SHIP   = new Texture(Gdx.files.internal("p.gif"));

        background = new Sprite(GALAXY);
//        background.setSize(1f, 1f * background.getHeight() / background.getWidth());
        background.setPosition(0, 0);

        ship = new Sprite(SHIP, 20, 20, 128, 128);
	}

	@Override
	public void render () {

        Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        batch.draw(GALAXY, 0, 0, 0, 0, 640, 480, 1, 1, 0.0f, 0, 0, 640, 480, false, false);

        ship.setPosition(180, 100);
        ship.setRotation( ++rotation );

		ship.draw(batch);

        batch.end();
	}
	
	@Override
	public void dispose () {

		batch.dispose();
        SHIP.dispose();
		GALAXY.dispose();

	}
}
