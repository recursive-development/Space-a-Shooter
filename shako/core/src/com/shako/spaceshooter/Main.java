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

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Main extends ApplicationAdapter {

	/** */
	private SpriteBatch batch;

	/** */
	private Texture img;

    /*
    *
    *
    *
    */
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
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
		batch.draw(img, 0, 0);
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
		img.dispose();
	}
}
