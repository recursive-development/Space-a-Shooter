package com.shako.spaceshooter.screens.menu;

// --- ---
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
// --- ---
import com.shako.game.engine.Base2DScreen;

/**
 * Экран для меню приложения.
 *
 * @author Alexey Stepchenko
 * @author Timur Kashapov
 *
 */
public class MenuScreen extends Base2DScreen {

    /** */
    private SpriteBatch batch;

    /** Фоновое изображение для экрана меню. */
    private Texture bkgd;

    /** */
    private Texture
            playButton,
            exitButton;

    /** */
    public MenuScreen(Game game) {
        super(game);

        batch = new SpriteBatch();
        batch.getProjectionMatrix().idt();

        bkgd     = new Texture("atmosphere/bk-menu.jpg");
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        // Начало отрисовки
        batch.begin();

        batch.draw(bkgd, -1f, -1f, 2f, 2f);

        batch.end();
        // Конец отрисовки
    }

    @Override
    public void hide() {
        super.hide();
    }

    @Override
    public void dispose() {

        // Освобождаем ресурсы
        batch.dispose();
        super.dispose();
    }
}
