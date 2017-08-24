package com.shako.spaceshooter;

//*************************************************************************************************
/*
*
* 1. Полностью разобраться с кодом урока.
* 2. В MenuScreen перехватить все события ввода, залогировать их в консоль и изучить их работу.
* 3***. Дописать Base2DScreen чтобы он рисовал текстуры пропорционально их размеру.
*
 */
//*************************************************************************************************

// --- libGDX классы ---
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
// --- Кастомные классы ---
import com.shako.game.engine.Base2DScreen;

/** */
public class Main extends ApplicationAdapter {

    /** */
    Base2DScreen screen;

	/** */
	private SpriteBatch batch;

	/** */
	private Texture
            logo,
            bgnd,
            trgt;

    /*
    *
    *
    *
    */
	@Override
	public void create () {
		batch = new SpriteBatch();

        bgnd = new Texture("sunset_1920x1200.jpg");
		logo   = new Texture("badlogic.jpg");
        trgt = new Texture("target.png");
	}

	/*
	*
	*
	*
	*/
	@Override
	public void render () {

		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();

        batch.draw(bgnd, 0, 0);
		batch.draw(logo, 0, 0);
        batch.draw(trgt, 0, 0);



		batch.end();
	}

	/*
	*
	*
	*
	*/
	@Override
	public void dispose () {
		batch.dispose();
		logo.dispose();
	}
}

