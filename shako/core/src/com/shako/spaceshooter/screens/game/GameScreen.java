package com.shako.spaceshooter.screens.game;

// --- libGDX ---
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

// --- Customs ---
import com.shako.game.engine.Base2DScreen;

/**
 *
 * @author Timur Kashapov
 */

public class GameScreen extends Base2DScreen {

    /** */
    private SpriteBatch batch;

    /** */
    private Sprite heroShip;

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

        heroShip = new Sprite(new Texture("heroShip.gif"));
        bkgd     = new Texture("atmosphere/bk-game.png");
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        batch.begin();

        batch.draw(bkgd, -1.0f, -1.0f, 2.0f, 2.0f);
        batch.draw(heroShip, 0.0f, 0.0f, 0.2f, 0.2f);

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
