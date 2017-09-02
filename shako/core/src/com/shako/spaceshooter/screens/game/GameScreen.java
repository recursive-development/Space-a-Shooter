package com.shako.spaceshooter.screens.game;

// --- libGDX ---
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Label;


// --- Customs ---
import com.shako.game.engine.Base2DScreen;

/**
 *
 * @author Timur Kashapov
 */

public class GameScreen extends Base2DScreen {

    /** */
    private Label
            label01,
            label02,
            label03,
            label04,
            label05;

    /** */
    private SpriteBatch batch;

    /** */
    private Sprite heroShip;

    /** */
    private float
            up     = 0.01f,
            down   = 0.01f,
            dvx    = -0.1f,
            dvy    = -0.1f;

    /** Фоновое изображение для экрана игры. */
    private Texture bkgd;

    /**
     *
     * @param game libGDX Game class
     */
    public GameScreen(Game game) {
        super(game);

        batch = new SpriteBatch();
        batch.getProjectionMatrix().idt();

        heroShip = new Sprite(new Texture("heroship.gif"));
//        bkgd     = new Texture("atmosphere/bk-game.png");
        bkgd     = new Texture("space/a.jpg");
    }

    @Override
    public boolean keyDown(int keycode) {

        if (keycode == 19) {
            System.out.printf("Поднимаемся keyDown code[%d]\n", keycode);
            dvy += 0.05f;
        } else if (keycode == 20) {
            System.out.printf("Опускаемся keyDown code[%d]\n", keycode);
            dvy -= 0.05f;
        }

        if (keycode == 22) {
            System.out.printf("Вправо keyDown code[%d]\n", keycode);
            dvx += 0.05f;
        } else if (keycode == 21) {
            System.out.printf("Влево keyDown code[%d]\n", keycode);
            dvx -= 0.05f;
        }



        return false;
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        batch.begin();

        batch.draw(bkgd, -1.0f, -1.0f, 2.0f, 2.0f);
        batch.draw(heroShip, dvx, dvy, 0.5f, 0.5f);

        batch.end();


    }

    @Override
    public void hide() {
        super.hide();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void dispose() {

        batch.dispose();
        super.dispose();
    }
}
